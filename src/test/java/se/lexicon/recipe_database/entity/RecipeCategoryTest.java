package se.lexicon.recipe_database.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

    public class RecipeCategoryTest {
        RecipeCategory testObject;
        List<Recipe> testRecipes;

        @BeforeEach
        public void setup() {
            Recipe A = new Recipe();
            Recipe B = new Recipe();
            Recipe C = new Recipe();
            testObject = new RecipeCategory();
            testObject.setId(1);
            testObject.setCategory("X");

            testRecipes = new ArrayList<>();
            testRecipes.add(A);
            testRecipes.add(B);
            testRecipes.add(C);
            testObject.setRecipes(testRecipes);
        }

        @Test
        @DisplayName("Test 1 Created Object")
        public void test_sucessfully_created(){
            Assertions.assertEquals(1,testObject.getId());
            Assertions.assertEquals("X",testObject.getCategory());
            Assertions.assertEquals(3,testObject.getRecipes().size());
        }


    }



