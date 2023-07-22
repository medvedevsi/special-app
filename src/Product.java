public class Product {
   private final String name;
   private String barCode;

    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

   public String getBarCode() {
        return barCode;
    }

   public void setBarCode(String newBarCode) {
        this.barCode = newBarCode;
    }
   
}
