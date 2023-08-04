
public class ItemDecorator implements Item {

    private Item item;
    private int quantity;

    public ItemDecorator(Item item, int quantity) {
        if (item == null) {
            throw new IllegalArgumentException("Select a valid Item");
        }
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getAmount() {
        return item.getAmount()*quantity;
    }

}
