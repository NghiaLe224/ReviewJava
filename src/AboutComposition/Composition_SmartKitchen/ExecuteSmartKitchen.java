package AboutComposition.Composition_SmartKitchen;

public class ExecuteSmartKitchen {
    public static void main(String[] args) {
        Composition_SmartKitchen smartKitchen = new Composition_SmartKitchen();

//        smartKitchen.getIceBox().setHasWorkToDo(true);
//        smartKitchen.getDishWasher().setHasWorkToDo(true);
//        smartKitchen.getBrewMaster().setHasWorkToDo(true);
//
//        smartKitchen.getBrewMaster().brewCoffee();
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getIceBox().orderFood();

        System.out.println("-----------");

//        smartKitchen.doKitchenWork();
//        smartKitchen.getBrewMaster().brewCoffee();
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getIceBox().orderFood();

        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();
    }
}
