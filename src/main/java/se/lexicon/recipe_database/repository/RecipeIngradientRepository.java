package se.lexicon.recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipe_database.entity.RecipeIngradient;

public interface RecipeIngradientRepository extends CrudRepository<RecipeIngradient,String> {
}
