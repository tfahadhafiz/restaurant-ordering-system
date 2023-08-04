
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Item> items;

    public Restaurant() {
        items = new ArrayList<>();
        items.add(new MainMeal("Meal 1", 10.5));
        items.add(new MainMeal("Meal 2", 11));
        items.add(new MainMeal("Meal 3", 11.5));
        items.add(new Beverages("Coffee", 5.2));
        items.add(new Beverages("Coca Cola", 4.3));
        items.add(new Beverages("Pepsi", 4.3));
        items.add(new Beverages("7UP", 4.3));
        items.add(new SideDish("French Fries", 5.0));
        items.add(new SideDish("Salad", 4.0));
        items.add(new SideDish("Baked Beans", 5.0));
    }

    public Item getItem(String name) {
        for (Item item : items) {
            if (((ItemImp) item).getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

}
