import java.util.ArrayList;
import java.util.List;

class Order {
    private Customer customer;
    private Restaurant restaurant;
    private List<MenuItems> items;

    public Order(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
    }

    public void addItem(String itemName)
        throws OrderLimitExceedException, MenuItemsNotFoundException {

        if (MenuItems.size() >= 5) {
            throw new OrderLimitExceedException("Cannot order more than 5 items.");
        }

        if (!restaurant.hasItem(itemName)) {
            throw new MenuItemsNotFoundException("Item '" + itemName + "' not found in menu.");
        }

        MenuItems item = restaurant.getItem(itemName);
        items.add(item);
    }

    public void placeOrder() {
        System.out.println("Order placed by " + customer.getUserName() + " at " + restaurant.getName());
        System.out.println("Ordered Items:");
        for (MenuItems item : items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
    }
}
