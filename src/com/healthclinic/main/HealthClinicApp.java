package com.healthclinic.main;

import java.util.ArrayList;

/**
 * -- Q2 - Health Clinic App
 * HealthClinicApp - a class to sort different food types
 *
 * @author Tim Winwood - x20213638
 * @version 1.0
 */
public class HealthClinicApp {

	/**
	 * entry point to the application
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {

		// -- Q2.a - Implement Food Class
		Food lentil = new Food("Lentil", "Plant", 116, 9, 0.4, 20);
		System.out.println("=== Q2.a ===");
		System.out.println(lentil.toString());

		// -- Q2.d.i - Add 5 different food items into the tree
		BinaryTree<Food> bt = new BinaryTree<Food>();
		bt.insert(new Food("Apple", "Plant", 95, 1, 0, 25));
		bt.insert(new Food("Potato", "Plant", 110, 3.1, 0, 23));
		bt.insert(new Food("Chicken", "Meat", 165, 31, 3.6, 0));
		bt.insert(new Food("Turkey", "Meat", 147, 29, 7, 0));
		bt.insert(new Food("Cheese", "Dairy", 400, 25, 33, 1));

		// -- Q2.d.ii - Check if count method works
		System.out.println("=== Q2.d.ii ===");
		System.out.println("Item Count: " + bt.count());

		// -- Q2.d.iii - Print the contents of the tree
		System.out.println("=== Q2.d.iii ===");
		System.out.println("Tree Contents:");
		bt.inOrderTraversal();

		// -- Q2.d.iv- Find the items with minimum and maximum calories counts
		System.out.println("=== Q2.d.iv ===");
		System.out.println("Item with Min Calories: \n" + bt.findElementLowestCalories());
		System.out.println("Item with Max Calories: \n" + bt.findElementHighestCalories());

		// -- Q2.e- Test your program
		BinaryTree<Food> btTest = new BinaryTree<Food>();
		TestYourDataStructure tyds = new TestYourDataStructure();
		ArrayList<ArrayList<String>> testData = tyds.getStringArray();

		for (int i = 0; i < testData.size(); i++) {

			String name = testData.get(i).get(0);
			String type = testData.get(i).get(1);
			int calories = Integer.parseInt(testData.get(i).get(2));
			double protein = Double.parseDouble(testData.get(i).get(3));
			double fat = Double.parseDouble(testData.get(i).get(4));
			double carbs = Double.parseDouble(testData.get(i).get(5));

			btTest.insert(new Food(name, type, calories, protein, fat, carbs));

		}

		System.out.println("=== Q2.e ===");
		System.out.println("Test Item with Min Calories: \n" + btTest.findElementLowestCalories());
		System.out.println("Test Item with Max Calories: \n" + btTest.findElementHighestCalories());

	}

}
