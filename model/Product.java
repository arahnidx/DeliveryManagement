package model;

import java.util.ArrayList;


public class Product {
	
	String Name;
	float Price, Cost, Profit, TimeExpected;
	ArrayList<String> Ingredients = new ArrayList<String>();
	
	
	
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
	

}
