package se.lexicon.recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipe_database.entity.RecipeInstruction;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction,String> {
}
