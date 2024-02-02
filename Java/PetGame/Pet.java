public class Pet{
    private String name;
    private int age;
    private int hunger;
    private int happiness;


    public Pet(String name, int age){
        this.name = name;
        this.age = age;
        this.hunger = 50;
        this.happiness = 50;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public int getHunger(){
        return hunger;
    }
    public void setHunger(int hunger){
        this.hunger = Math.max(0, Math.min(hunger,100));
    }

    public int getHappiness(){
        return happiness;
    }

    public void setHappiness(int happiness){
        this.happiness = Math.max(0, Math.min(happiness,100));
    }

    public void feed(){
        setHunger(getHunger() -10 );
        setHappiness(getHappiness() + 5);
    }

    public void play () {
        setHappiness(getHappiness() +10);
        setHunger(getHunger() + 5);
    }

}