public abstract class Monster{
    protected String name;
    protected int health;
    protected int attackPower;

    public Monster(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower
    }

    public abstract void attack();


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.heath = health;
    }

    public int getAttackPower(){
        return attackPower;
    }
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower
    }
}
