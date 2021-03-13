package se.lexicon.recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.recipe_database.entity.Ingradient;

    public interface IngradientRepository extends CrudRepository<Ingradient, Integer> {
        /*All CRUD here
        saveAll
        findById
        existById
        findAll
        deleteById
        delete
        deleteAll
         */
    }


