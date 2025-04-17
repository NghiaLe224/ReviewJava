package section8.oop_master_challenge;

public class Hamburger extends Item{
    private Item extraItem1;
    private Item extraItem2;
    private Item extraItem3;

    public Hamburger(String name, double price) {
        super("BURGER", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extraItem1 == null) ? 0 : extraItem1.getAdjustedPrice()) +
                ((extraItem2 == null) ? 0 : extraItem2.getAdjustedPrice()) +
                ((extraItem3 == null) ? 0 : extraItem3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName){
        return switch(toppingName.toUpperCase()){
            case "AVOCADO", "MAYO" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addTopping(String extra1, String extra2, String extra3){
        this.extraItem1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        this.extraItem2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
        this.extraItem3 = new Item("TOPPING", extra3, getExtraPrice(extra3));

    }

    public void printItemizedList(){
        printItem("BASE BURGER", getBasePrice());
        if(extraItem1 != null){
            extraItem1.printItem();
        }
        if(extraItem2 != null){
            extraItem2.printItem();
        }
        if(extraItem3 != null){
            extraItem3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
