package com.healthclinic.main;

import java.text.DecimalFormat;

/**
 * -- Q1.a - Implement a Food class
 * Food - a class to represent a Food item
 *
 * @author Tim Winwood - x20213638
 * @version 1.0
 */
public class Food implements Comparable<Food> {

	// instance variables
	private String name;
	private String type;
	private int calories;
	private double protein;
	private double  fat;
	private double  carbs;
	
	/**
	 * Food constructor
	 */
	public Food(String name, String type, int calories, double protein, double fat, double carbs) {
		
		this.name = name;
		this.type = type;
		this.calories = calories;
		this.protein = protein;
		this.fat = fat;
		this.carbs = carbs;
		
	}

	/**
	 * get the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set the name
	 * 
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *  get the type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * set the type
	 * 
	 * @param type the type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 *  get the calories
	 * 
	 * @return the calories
	 */
    public int getCalories() {
		return calories;
	}

	/**
	 * set the calories
	 * 
	 * @param calories the calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 *  get the protein
	 * 
	 * @return the protein
	 */
	public double getProtein() {
		return protein;
	}

	/**
	 * set the protein
	 * 
	 * @param protein the protein
	 */
	public void setProtein(double protein) {
		this.protein = protein;
	}

	/**
	 *  get the fat
	 * 
	 * @return the fat
	 */
	public double getFat() {
		return fat;
	}

	/**
	 * set the fat
	 * 
	 * @param fat the fat
	 */
	public void setFat(double fat) {
		this.fat = fat;
	}

	/**
	 *  get the carbs
	 * 
	 * @return the carbs
	 */
	public double getCarbs() {
		return carbs;
	}

	/**
	 * set the carbs
	 * 
	 * @param carbs the carbs
	 */
	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	/**
	 * returns the string representation of the Food object
	 *
	 * @return the string representation of the Food object
	 */
	@Override
    public String toString(){
    	
		// DecimalFormat used to format double values
		DecimalFormat df = new DecimalFormat("0.#");
		
		// return the string representation of the Food object
    	return "=== " + this.name + " ===\n"
    			+ "Type: " + this.type + "\n"
    			+ "Calories (in 100g): " + this.calories + "\n"
    			+ "Protein/Fat/Carbohydrate (in 100g): " + df.format(this.protein) + " g / " + df.format(this.fat) + " g / " + df.format(this.carbs) + " g";

    }
	
	
    /**
     * compares the passed Food object 'f' with this Food object
     *
     * @return the comparison result
     */
    @Override
    public int compareTo(Food f){
    	
    	// returns 0 if X == Y, less than 0 if X < Y, greater than - if X > Y
    	return Integer.compare(this.calories, f.getCalories());
    }
	

}
