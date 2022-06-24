package model;

import java.util.ArrayList;


public class Product {
	
	private String Name;
	private double Price, Cost, Profit, TimeExpected;
	private ArrayList<String> Ingredients = new ArrayList<String>();
	
	
	
	public Product(String Name, double Price, double Cost, double Profit, double TimeExpected, ArrayList<String> Ingredient) {
		this.Name = Name;
		this.Price = Price;
		this.Cost = Cost;
		this.Profit = Profit;
		this.TimeExpected = TimeExpected;
		
		for (String i : Ingredients) {
			this.Ingredients.add(i);
		}
	}


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public double getProfit() {
		return Profit;
	}

	public void setProfit(double profit) {
		Profit = profit;
	}

	public double getTimeExpected() {
		return TimeExpected;
	}

	public void setTimeExpected(double timeExpected) {
		TimeExpected = timeExpected;
	}

	public ArrayList<String> getIngredients() {
		return Ingredients;
	}

	public void setIngredients(ArrayList<String> ingredients) {
		Ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Product{" +
				"Name='" + Name + '\'' +
				", Price=" + Price +
				", Cost=" + Cost +
				", Profit=" + Profit +
				", TimeExpected=" + TimeExpected +
				", Ingredients=" + Ingredients +
				'}';
	}
}
