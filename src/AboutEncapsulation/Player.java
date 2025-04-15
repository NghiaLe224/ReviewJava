package AboutEncapsulation;

public class AboutEncapsulation {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());
    }
}

class Player{
    public String name;
    public int health;
    public String weapon;



    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player knocked out of game");
        }
    }

    public void restoreHealth(int extraHealth){
        this.health += extraHealth;
        if(this.health > 100){
            System.out.println("Player fulled health");
            this.health = 100;
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}