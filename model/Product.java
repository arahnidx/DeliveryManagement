package model;

import java.util.ArrayList;


public class Product {
	
	private String Name;
	private float Price, Cost, Profit, TimeExpected;
	private ArrayList<String> Ingredients = new ArrayList<String>();
	
	
	
	public Product(String Name, float Price, float Cost, float Profit, float TimeExpected, ArrayList<String> Ingredient) {
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



	public float getPrice() {
		return Price;
	}



	public void setPrice(float price) {
		Price = price;
	}



	public float getCost() {
		return Cost;
	}



	public void setCost(float cost) {
		Cost = cost;
	}



	public float getProfit() {
		return Profit;
	}



	public void setProfit(float profit) {
		Profit = profit;
	}



	public float getTimeExpected() {
		return TimeExpected;
	}



	public void setTimeExpected(float timeExpected) {
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
		return "Product [Cost=" + Cost + ", Ingredients=" + Ingredients + ", Name=" + Name + ", Price=" + Price
				+ ", Profit=" + Profit + ", TimeExpected=" + TimeExpected + "]";
	}

	
	

}
