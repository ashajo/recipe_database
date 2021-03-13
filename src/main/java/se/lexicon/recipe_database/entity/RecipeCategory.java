package se.lexicon.recipe_database.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
public class RecipeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String category;
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "recipes_recipe_categories",
    joinColumns = @JoinColumn(name = "recipe_category_id"),
    inverseJoinColumns = @JoinColumn(name = "recipe_id"))
    private List<Recipe>recipes;

    public RecipeCategory() {
    }

    public RecipeCategory(int id, String category, List<Recipe> recipes) {
        Id = id;
        this.category = category;
        this.recipes = recipes;
    }

    public RecipeCategory(String category, List<Recipe> recipes) {
        this.category = category;
        this.recipes = recipes;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return Id == that.Id && Objects.equals(category, that.category) && Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, category, recipes);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "Id=" + Id +
                ", category='" + category + '\'' +
                ", recipes=" + recipes +
                '}';
    }
}
