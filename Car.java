public class Car {
    private String model;
    private int price;
    private boolean forSale;
    private String owner;
    private final String country = "Israel";

    public Car(String model, int price, boolean forSale, String owner) {
        this.model = model;
        this.price = price;
        this.forSale = forSale;
        this.owner = owner;
    }

    public Car(String model, String owner) {
        this.model = model;
        this.owner = owner;
        this.forSale = false;
        this.price = 0;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public boolean isForSale() {
        return forSale;
    }

    public String getOwner() {
        return owner;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setForSale(String owner, boolean forSale) {
        if (owner.equals(this.owner)){
            this.forSale = forSale;
            System.out.println("the car is now for sale : " + this.forSale);
        } else {
            System.out.println("not an owner tried to change the flag");
        }
    }

    public void setPrice(String owner, int price) {
        if (owner.equals(this.owner)) {
            this.price = price;
            System.out.println("the new price is  : " + this.price);
        } else {
            System.out.println("not an owner tried to change the price");
        }
    }

    private void setOwner(String owner) {
      this.owner = owner;
    }

    public void sale(String owner, String newOwner) {
        if (this.forSale && this.owner.equals(owner)) {
            //setOwner(newOwner);
            this.owner = newOwner;
            System.out.println("The owner changed from : " + owner + " to " + newOwner);
        } else {
            System.out.println("sales operation failed");
        }
    }



}
