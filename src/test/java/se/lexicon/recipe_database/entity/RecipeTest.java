package se.lexicon.recipe_database.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

    public class RecipeTest {
        Recipe testObject;
        Recipe testObjectA;
        Recipe testObjectB;
        List<Recipe> testObjectList;

        Ingradient testIngradientA;
        Ingradient testIngradientB;
        RecipeIngradient testRecipeIngradientA;
        RecipeIngradient testRecipeIngradientB;
        List<RecipeIngradient> testRecipeIngradientList;

        RecipeInstruction testRecipeInsructionA;
        RecipeInstruction testRecipeInstructionB;
        List<RecipeInstruction> testRecipeList;

        RecipeCategory testRecipeCategoryA;
        RecipeCategory testRecipeCategoryB;
        List<RecipeCategory> testRecipeCategoryList;
        String testUUID;

        @BeforeEach
        void setup() {
            testIngradientA = new Ingradient(1, "A");
            testIngradientB = new Ingradient(2, "B");

            testRecipeIngradientA = new RecipeIngradient(testIngradientA, 3, Measurement.Gram, testObjectB);
            testRecipeIngradientB = new RecipeIngradient(testIngradientB, 5, Measurement.KiloGram, testObjectB);

            testRecipeIngradientList = new ArrayList<>();
            testRecipeIngradientList.add(testRecipeIngradientA);
            testRecipeIngradientList.add(testRecipeIngradientB);

            testRecipeInsructionA = new RecipeInstruction();
            testRecipeInstructionB = new RecipeInstruction();

            testRecipeList = new ArrayList<>();
            testRecipeList.add(testRecipeInsructionA);
            testRecipeList.add(testRecipeInstructionB);

            testRecipeCategoryList = new ArrayList<>();
            testRecipeCategoryList.add(testRecipeCategoryA);
            testRecipeCategoryList.add(testRecipeCategoryB);

            testObjectA = new Recipe(1, "Recipe1", testRecipeIngradientList, testRecipeInsructionA, testRecipeCategoryList);
            testObjectB = new Recipe(2, "Recipe2", testRecipeIngradientList, testRecipeInstructionB, testRecipeCategoryList);

            testObjectList = new ArrayList<>();
            testObjectList.add(testObjectA);
            testObjectList.add(testObjectB);
        }

        @Test
        @DisplayName("Test1 Create Object")
        public void test_sucessfully_created() {
            Assertions.assertEquals(1, testObjectA.getId());
            Assertions.assertEquals("Recipe2", testObjectB.getRecipeName());
        }
    }









