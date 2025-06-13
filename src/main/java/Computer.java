public class Computer {

    private final float basePrice = 200;

    final MotherBoard motherBoard;
    final Ram ram;

//    private final List<Addon> addons = new ArrayList<Addon>();

    private double motherBoardAddonsPrice = 0;
    private double ramAddonsPrice = 0;

    private LOCATION location;

    public Computer() {
        this.motherBoard = new MotherBoard();
        this.ram = new Ram();
    }

    public float getBasePrice() {
        return basePrice;
    }

    public Computer addAddon(Addon addon) {
//        this.addons.add(addon);
        if (addon instanceof MotherBoardAddon) {
            this.motherBoardAddonsPrice += addon.getPrice();
        }
        if (addon instanceof RAMAddon) {
            this.ramAddonsPrice += addon.getPrice();
        }
        return this;
    }


    public double geTotalPrice() {


        double MotherboardAndAddonsPrice = this.motherBoard.getBasePrice() + this.motherBoardAddonsPrice;
        double RamAndAddonsPrice = this.ram.getBasePrice() + this.ramAddonsPrice;

        double locationCharges = (this.location.getRamSurCharge() * RamAndAddonsPrice) +
                (this.location.getMotherBoardSurCharge() * MotherboardAndAddonsPrice);

        double netPrice = this.basePrice + MotherboardAndAddonsPrice + RamAndAddonsPrice;


        double freedomCharges = 0.2;
        return netPrice + freedomCharges * netPrice + locationCharges;
    }

    public void purchaseFrom(LOCATION location) {
        this.location = location;
    }
}
