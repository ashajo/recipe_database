package se.lexicon.recipe_database.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


    public class RecipeIngradientTest {
        RecipeIngradient testObject;
        Ingradient testIngradient;
        UUID testUUID;
        @BeforeEach
        public void setup() {
            testIngradient = new Ingradient(1, "starch");
            testObject = new RecipeIngradient();
            testObject.setId(testObject.getId());
            testObject.setIngradient(testIngradient);
            testObject.setAmount(3);
            testObject.setMeasurement(Measurement.Gram);
            testObject.setRecipe(null);
        }



        @Test
        @DisplayName("Test1 Created Object")
        public void test_sucessfully_created() {
            assertEquals(testUUID,testObject.getId());
            assertEquals(1,testObject.getIngradient().getId());
            assertEquals(3,testObject.getAmount());
            assertEquals(null,testObject.getRecipe());
        }
        @Test
        @DisplayName("Test2 Equal")
        public void test_equal() {
            RecipeIngradient expected = new RecipeIngradient(testObject.getId(), testIngradient,3,Measurement.Gram,null);
            assertTrue(expected.equals(testObject));


        }
        @Test
        @DisplayName("Test3 hashCode")
        public void test_hashcode() {
            RecipeIngradient expected = new RecipeIngradient(testObject.getId(), testIngradient,3,Measurement.Gram,null);
            assertEquals(expected.hashCode(),testObject.hashCode());
        }

    }




