package se.lexicon.recipe_database.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
@Entity
public class RecipeIngradient {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn()
    private Ingradient ingradient;
    @Column(nullable = true)
    private double amount;
    @Column(nullable = false)
    private Measurement measurement;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn()
    private Recipe recipe;

    public RecipeIngradient() {
    }

    public RecipeIngradient(String id, Ingradient ingradient, double amount, Measurement measurement, Recipe recipe) {
        this.id = id;
        this.ingradient = ingradient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public RecipeIngradient(Ingradient ingradient, double amount, Measurement measurement, Recipe recipe) {
        this.ingradient = ingradient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ingradient getIngradient() {
        return ingradient;
    }

    public void setIngradient(Ingradient ingradient) {
        this.ingradient = ingradient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngradient that = (RecipeIngradient) o;
        return Double.compare(that.amount, amount) == 0 && Objects.equals(id, that.id) && Objects.equals(ingradient, that.ingradient) && measurement == that.measurement && Objects.equals(recipe, that.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingradient, amount, measurement, recipe);
    }

    @Override
    public String toString() {
        return "RecipeIngradient{" +
                "id='" + id + '\'' +
                ", ingradient=" + ingradient +
                ", amount=" + amount +
                ", measurement=" + measurement +
                ", recipe=" + recipe +
                '}';
    }
}
