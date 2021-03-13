package se.lexicon.recipe_database.entity;

import javax.persistence.*;
import java.util.Objects;

    @Entity
    public class Ingradient {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(nullable = false,length = 255,unique = true)
        private String ingradientName;

        public Ingradient() {
        }

        public Ingradient(String ingradient) {
            this.ingradientName = ingradient;
        }

        public Ingradient(int id, String ingradient) {
            this.id = id;
            this.ingradientName = ingradient;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIngradientName() {
            return ingradientName;
        }

        public void setIngradientName(String ingradient) {
            this.ingradientName = ingradientName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ingradient that = (Ingradient) o;
            return id == that.id && Objects.equals(ingradientName, that.ingradientName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, ingradientName);
        }
    }


