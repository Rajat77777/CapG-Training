package FoodDeliverySystem;


public class Driver {

	public static void main(String[] args) {
		Restaurant rest = new Restaurant("Golden Gate");
		rest.addMenuItem(new MenuItems("Burger",100));
		rest.addMenuItem(new MenuItems("Momo",200));
		rest.addMenuItem(new MenuItems("Dessert",100));
		rest.addMenuItem(new MenuItems("Waffle",150));
		rest.addMenuItem(new MenuItems("Chowmein",400));
		
		
		Customer cust = new Customer("Raja Da", false);
        cust.login();  

        if (!cust.isLoggedIn()) {
            System.out.println("Please login to place an order.");
            return;
        }

        
        Order order = new Order(cust, rest);

        try {
            order.addItem("Burger");
            order.addItem("Pizza");
            order.addItem("Fries");
            order.addItem("Salad");
            order.addItem("Pasta");
           
            order.placeOrder();
        } catch (OrderLimitExceedException | MenuItemsNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
	}

