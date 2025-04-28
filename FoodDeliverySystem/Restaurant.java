package FoodDeliverySystem;

import java.util.*;

public class Restaurant {

	private String name;
	private List<MenuItems> menu;
	
	public Restaurant(String name) {
		this.name=name;
		this.menu= new ArrayList<>();
	}
	
	public void addMenuItem(MenuItems item) {
		menu.add(item);
	}
	
	public boolean hasItem(String itemName) {
		return menu.stream().anyMatch(item -> item.getName().equalsIgnoreCase(itemName));
		
	}
	
	public MenuItems getItem(String itemName) {
		return menu.stream().filter(item -> item.getName().equalsIgnoreCase(itemName)).findFirst().orElse(null);
	}
	
	public String getName() {
		return name;
	}
}
