package se.lexicon.recipe_database.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,unique = true)
    private String recipeName;

    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngradient>recipeIngradients;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "recipe_instruction_id")
    private RecipeInstruction recipeInstruction;

@ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
@JoinTable(name = "recipe_recipe_categories",
joinColumns = @JoinColumn(name = "recipe_id"),
inverseJoinColumns = @JoinColumn(name = "recipe_category_id"))
    private List<RecipeCategory>recipeCategoryList;

    public Recipe() {
    }

    public Recipe(int id, String recipeName, List<RecipeIngradient> ingradientList, RecipeInstruction recipeInstruction, List<RecipeCategory> recipeCategoryList) {
        this.id = id;
        this.recipeName = recipeName;
        this.recipeIngradients= recipeIngradients;
        this.recipeInstruction = recipeInstruction;
        this.recipeCategoryList = recipeCategoryList;
    }

    public Recipe(int id, String recipeName, List<RecipeIngradient> ingradientList, RecipeInstruction recipeInstruction) {
        this.id = id;
        this.recipeName = recipeName;
        this.recipeIngradients = recipeIngradients;
        this.recipeInstruction = recipeInstruction;
    }

    public Recipe(String recipeName, List<RecipeIngradient> ingradientList, RecipeInstruction recipeInstruction, List<RecipeCategory> recipeCategoryList) {
        this.recipeName = recipeName;
        this.recipeIngradients = recipeIngradients;
        this.recipeInstruction = recipeInstruction;
        this.recipeCategoryList = recipeCategoryList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngradient> getIngradientList() {
        return recipeIngradients;
    }

    public void setIngradientList(List<RecipeIngradient> ingradientList) {
        this.recipeIngradients = recipeIngradients;
    }

    public RecipeInstruction getRecipeInstruction() {
        return recipeInstruction;
    }

    public void setRecipeInstruction(RecipeInstruction recipeInstruction) {
        this.recipeInstruction = recipeInstruction;
    }

    public List<RecipeCategory> getRecipeCategoryList() {
        return recipeCategoryList;
    }

    public void setRecipeCategoryList(List<RecipeCategory> recipeCategoryList) {
        this.recipeCategoryList = recipeCategoryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id && Objects.equals(recipeName, recipe.recipeName) && Objects.equals(recipeIngradients, recipe.recipeIngradients) && Objects.equals(recipeInstruction, recipe.recipeInstruction) && Objects.equals(recipeCategoryList, recipe.recipeCategoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recipeName, recipeIngradients, recipeInstruction, recipeCategoryList);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeIngradients=" + recipeIngradients +
                ", recipeInstruction=" + recipeInstruction +
                ", recipeCategoryList=" + recipeCategoryList +
                '}';
    }
}
