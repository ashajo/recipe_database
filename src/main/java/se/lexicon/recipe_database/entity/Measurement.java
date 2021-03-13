package se.lexicon.recipe_database.entity;

    public enum Measurement {
        KiloGram("kg") ,Gram("g"), HG("hg"), C("cl"), ML("ml"), DL("dl"), TSP("tsp"), TBSP("tbsp");
        private String value;

        Measurement() {
        }


        Measurement(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


