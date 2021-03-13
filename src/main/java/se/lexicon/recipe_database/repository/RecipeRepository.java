package se.lexicon.recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipe_database.entity.Ingradient;
import se.lexicon.recipe_database.entity.Recipe;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe,Integer> {
}
