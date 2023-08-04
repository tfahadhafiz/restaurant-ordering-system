
public class ItemImp implements Item {

    private String name;
    private double price;

    public ItemImp(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getAmount() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemImp other = (ItemImp) obj;
        return this.name.equals(other.name);
    }

}
