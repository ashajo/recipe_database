package se.lexicon.recipe_database.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.recipe_database.entity.Ingradient;

@DataJpaTest
public class IngradientRepositoryTest {
    @Autowired
    IngradientRepository testObject;
    Ingradient ingradient;

    @BeforeEach
    public void setup() {
        ingradient = new Ingradient(1, "sugar");
        testObject.save(ingradient);
    }
    @Test
    public void test_find_by_id() {
        Assertions.assertEquals(1,testObject.findById(1).get().getId());
        Assertions.assertEquals("sugar",testObject.findById(1).get().getIngradientName());
    }



}
