package se.lexicon.recipe_database.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

    public class MeasurementTest {
        Measurement testObject;

        @BeforeEach
        public void setup() {
            testObject = Measurement.HG;
        }
        @Test
        @DisplayName("Test Equal")
        public void test_equal() {
            Assertions.assertEquals("hg",testObject.getValue());
        }




    }


