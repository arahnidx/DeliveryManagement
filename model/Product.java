package model;

import java.util.ArrayList;


public class Product {
	
	protected String name;
	protected double price, cost, profit, timeExpected;
	protected ArrayList<String> ingredients = new ArrayList<String>();
	
	
	
	public Product(String name, double price, double cost, double profit, double timeExpected, ArrayList<String> ingredients) {
		this.name = name;
		this.price = price;
		this.cost = cost;
		this.profit = profit;
		this.timeExpected = timeExpected;
		
		for (String i : ingredients) {
			this.ingredients.add(i);
		}
	}


}
