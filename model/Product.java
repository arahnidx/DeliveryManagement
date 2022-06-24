package model;

import java.util.ArrayList;


public class Product {
	
	private String name;
	private double price, cost, profit, timeExpected;
	private ArrayList<String> ingredients = new ArrayList<String>();
	
	
	
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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public double getTimeExpected() {
		return timeExpected;
	}

	public void setTimeExpected(double timeExpected) {
		this.timeExpected = timeExpected;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", price=" + price +
				", cost=" + cost +
				", profit=" + profit +
				", timeExpected=" + timeExpected +
				", ingredients=" + ingredients +
				'}';
	}
}
