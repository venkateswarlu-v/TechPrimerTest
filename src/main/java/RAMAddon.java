public enum RAMAddon implements Addon {
    DDR_Chip_Type(200);


    private final float price;

    RAMAddon(float price) {
        this.price = price;
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
