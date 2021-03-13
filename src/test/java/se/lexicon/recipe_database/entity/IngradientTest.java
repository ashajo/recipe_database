package se.lexicon.recipe_database.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IngradientTest {

    Ingradient testObject;
    String ingradientName;

    @BeforeEach
    public void setup() {
        ingradientName = "Potato,Tomato,Sugar,Salt";
        testObject = new Ingradient(1,ingradientName);
    }
    @Test
    @DisplayName("Test 1 Created Object")
    public void test_successfully_created() {
        Assertions.assertEquals(1,testObject.getId());
        Assertions.assertEquals(ingradientName,testObject.getIngradientName());
    }
    @Test
    @DisplayName("Test 2 Equal")
    public void test_equal() {
        Ingradient expected = new Ingradient(1,ingradientName);
        Assertions.assertTrue(testObject.equals(expected));

    }
    @Test
    @DisplayName("Test 3 Hashcode")
    public void test_hashcode() {
        Ingradient expected = new Ingradient(1,ingradientName);
        Assertions.assertEquals(expected.hashCode(),testObject.hashCode());
    }
}

