
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private String date;
    private String time;
    private int tableNumber;
    private List<ItemDecorator> items;

    public Order(int tableNumber) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat tf = new SimpleDateFormat("hh.mm a");
        this.date = df.format(new Date());
        this.time = tf.format(new Date());
        this.tableNumber = tableNumber;
        this.items = new ArrayList<>();
    }

    public void addOrderItem(ItemDecorator item) {
        items.add(item);
    }

    public String getDate() {
        return date;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getTime() {
        return time;
    }

    public List<ItemDecorator> getItems() {
        return items;
    }
    
    

    public double getNetSubTotal() {
        double subTotal = 0;
        for (Item item : items) {
            subTotal += item.getAmount();
        }
        return subTotal;
    }

    public double getSalesTax() {
        double tax = getNetSubTotal() * 0.05;
        return tax;
    }
    
    public double getTotal() {
        return getNetSubTotal()+getSalesTax();
    }

}
