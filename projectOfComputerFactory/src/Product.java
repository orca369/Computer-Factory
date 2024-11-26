public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    class Monitor extends Product {
        private int size;
        private String resolution;

        public Monitor(String model, String manufacturer) {
            super(model, manufacturer);
        }

        public Monitor(String model, String manufacturer, int size, String resolution) {
            super(model, manufacturer);
            this.size = size;
            this.resolution = resolution;
        }

        public void drawPixelAt(int x, int y, String color) {
            System.out.println(String.format("Drawing pixel at %d,%d in color %s", x, y, color));
        }
    }

    class MotherBoard extends Product {
        private int ramSlotsl ;
        private int cardSlots;
        private String bios;

        public MotherBoard(String model, String manufacturer) {
            super(model, manufacturer);
        }

        public MotherBoard(String model, String manufacturer, String bios, int cardSlots, int ramSlotsl) {
            super(model, manufacturer);
            this.bios = bios;
            this.cardSlots = cardSlots;
            this.ramSlotsl = ramSlotsl;
        }

        public void loadProgram(String programName) {
            System.out.println("Loading program: " + programName + " is now loading...");
        }
    }

    class ComputerCase extends Product {
    private String powerSupply ;

        public ComputerCase(String model, String manufacturer) {
            super(model, manufacturer);
        }

        public ComputerCase(String model, String manufacturer, String powerSupply) {
            super(model, manufacturer);
            this.powerSupply = powerSupply;
        }
        public void pressPowerButton(){
            System.out.println("Pressing power button...");
        }
    }
    // all three classes are part of the main class product and called sub-class ( Composition )
}
