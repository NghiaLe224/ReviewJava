package section8.about_composition.Composition_SmartKitchen;

public class Composition_SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public Composition_SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public void addWater(){
        this.brewMaster.setHasWorkToDo(true);
    }

    public void pourMild(){
        this.iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        this.dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeMakerState, boolean refrigeratorState, boolean dishWasherState){
        this.brewMaster.setHasWorkToDo(coffeeMakerState);
        this.dishWasher.setHasWorkToDo(refrigeratorState);
        this.iceBox.setHasWorkToDo(dishWasherState);
    }

    public void doKitchenWork(){
        this.brewMaster.brewCoffee();
        this.iceBox.orderFood();
        this.dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Refrigerator is ordering...");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("DishWasher is doing...");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("CoffeeMaker is brewing...");
            hasWorkToDo = false;
        }

    }
}
