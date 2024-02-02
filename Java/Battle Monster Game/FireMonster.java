public class FireMonster extends Monster {
    private boolean isEnraged;

    public FireMonster(String name, int health, int attackPower) {
        super(name, health, attackPower);
        this.isEnraged = false; // Default state
    }

    
    public void attack() {
        if (isEnraged) {
            System.out.println(name + " unleashes a furious firestorm! Damage: " + (attackPower * 2));
        } else {
            System.out.println(name + " attacks with fire! Damage: " + attackPower);
        }
    }

    public void enrage() {
        isEnraged = true;
        System.out.println(name + " is now enraged, increasing attack power!");
    }

    public void calmDown() {
        isEnraged = false;
        System.out.println(name + " calms down, attack power returns to normal.");
    }

    // Additional methods specific to FireMonster
}
