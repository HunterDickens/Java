public class WaterMonster extends Monster {
    public WaterMonster(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    
    public void attack() {
        System.out.println(name + " attacks with water! Damage: " + attackPower);
    }

    // Additional methods specific to WaterMonster
}
