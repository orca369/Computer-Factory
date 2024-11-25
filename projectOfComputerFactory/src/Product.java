public class Product {
    private String model ;
    private String manufacturer ;
    private int width ;
    private int height ;
    private int depth ;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
    class Monitor extends Product {

        public Monitor(String model, String manufacturer) {
            super(model, manufacturer);
        }
    }
    class MotherBoard extends Product {

        public MotherBoard(String model, String manufacturer) {
            super(model, manufacturer);
        }
    }
    class ComputerCase extends Product {

        public ComputerCase(String model, String manufacturer) {
            super(model, manufacturer);
        }
    }
    // all three classes are part of the main class product
}
