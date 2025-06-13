import org.junit.jupiter.api.Test;

public class ComputerTest {

    @Test
    public void shouldBeAbleToGetBasePriceForGivenComputer() {

        Computer computer = new Computer();

        assert computer.getBasePrice() == 200;
    }

    @Test
    public void shouldBeAbleToGetMotherBoardBasePriceAddedToTheComputer() {

        Computer computer = new Computer();

        assert computer.getMotherBoardBasePrice() == 200;

    }

    @Test
    public void shouldBeAbleToAddAddonForMotherBoard() {
        Computer computer = new Computer();

        computer.addAddon(MotherBoardAddon.LED_FOR_SWITCHES).
                addAddon(MotherBoardAddon.DDR_5_Memory_Modules).
                addAddon(RAMAddon.DDR_Chip_Type).purchaseFrom(LOCATION.Compression_Land);


        double motherBoardAndAddonsPrice = computer.motherBoard.getBasePrice() +
                MotherBoardAddon.LED_FOR_SWITCHES.getPrice() + MotherBoardAddon.DDR_5_Memory_Modules.getPrice();

        double ramAndAddonsPrice = computer.ram.getBasePrice() + RAMAddon.DDR_Chip_Type.getPrice();

        double netPrice = computer.getBasePrice() + motherBoardAndAddonsPrice + ramAndAddonsPrice;
        double locationCharges = (motherBoardAndAddonsPrice * LOCATION.Compression_Land.getMotherBoardSurCharge()) +
                (ramAndAddonsPrice * LOCATION.Compression_Land.getRamSurCharge());
        double freedomCharge = 0.2;
        double netFreedomCharges = netPrice * freedomCharge;

        assert computer.geTotalPrice() == netPrice + netFreedomCharges + locationCharges;

    }
}
