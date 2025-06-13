
public enum MotherBoardAddon implements Addon {
    LED_FOR_SWITCHES(50),
    DDR_5_Memory_Modules(200);

    private final float price;

    MotherBoardAddon(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }
}
