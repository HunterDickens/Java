public class Inventory{
    private int quanitiy;
    private String location;

    public Inventory(int quantity, String location){
        this.quanitiy = quanitiy;
        this.location = location;
    }

    public int getQuantity() {
        return quanitiy;
    }

    public void setQuanity(int quanitiy){
        this.quanitiy = quanitiy;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
}