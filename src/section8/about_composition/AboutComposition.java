package section8.about_composition;

public class AboutComposition {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", "v2.44", 6, 4);

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Window OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
