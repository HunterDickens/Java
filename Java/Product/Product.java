public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o== null || getClass() !=o.getClass())return false;
        
        Product product = (Product) 0;
        return Double.compare(product.price, price) == 0 &&
                name.equals(product.name);  
    }


        public int hashCode() {
            return Object.hash(name, price);
        
        }

        public String getname() {
            return name;
        }

        public double getPrice(){
            return price;
        }
}