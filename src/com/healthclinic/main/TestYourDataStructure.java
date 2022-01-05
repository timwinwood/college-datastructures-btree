package com.healthclinic.main;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emin_
 */
public class TestYourDataStructure {
	// --- Declare a variable to hold an array of Strings
    public ArrayList<ArrayList<String>> strArray;
        
    public TestYourDataStructure(){
        // --- Initialize the strArray
        strArray = new ArrayList<ArrayList<String>>();
        
        // --- Initialize the lines
        ArrayList<String> lineNo01 = new ArrayList<String>();
        ArrayList<String> lineNo02 = new ArrayList<String>();
        ArrayList<String> lineNo03 = new ArrayList<String>();
        ArrayList<String> lineNo04 = new ArrayList<String>();
        ArrayList<String> lineNo05 = new ArrayList<String>();
        ArrayList<String> lineNo06 = new ArrayList<String>();
        ArrayList<String> lineNo07 = new ArrayList<String>();
        ArrayList<String> lineNo08 = new ArrayList<String>();
        ArrayList<String> lineNo09 = new ArrayList<String>();
        ArrayList<String> lineNo10 = new ArrayList<String>();
        ArrayList<String> lineNo11 = new ArrayList<String>();
        ArrayList<String> lineNo12 = new ArrayList<String>();
        ArrayList<String> lineNo13 = new ArrayList<String>();
        
        // --- Add the food items and their properties
        // ----------- Name -----------|-------- Type --------|----- Calories -----|------ Protein ------|------- Fat --------|--- Carbohydrate ---|
        lineNo01.add("Milk");           lineNo01.add("Dairy"); lineNo01.add("42");  lineNo01.add("3.4");  lineNo01.add("1");   lineNo01.add("5");        
        lineNo02.add("Chicken Breast"); lineNo02.add("Meat");  lineNo02.add("165"); lineNo02.add("31");   lineNo02.add("3.6"); lineNo02.add("0");
        lineNo03.add("Butter");         lineNo03.add("Dairy"); lineNo03.add("717"); lineNo03.add("0.9");  lineNo03.add("81");  lineNo03.add("0.1");
        lineNo04.add("Eggplant");       lineNo04.add("Plant"); lineNo04.add("25");  lineNo04.add("1");    lineNo04.add("0.2"); lineNo04.add("6");
        lineNo05.add("Lentil");         lineNo05.add("Plant"); lineNo05.add("116"); lineNo05.add("9");    lineNo05.add("0.4"); lineNo05.add("20");
        lineNo06.add("Leek");           lineNo06.add("Plant"); lineNo06.add("61");  lineNo06.add("1.5");  lineNo06.add("0.3"); lineNo06.add("14");
        lineNo07.add("Mozzarella");     lineNo07.add("Dairy"); lineNo07.add("280"); lineNo07.add("28");   lineNo07.add("17");  lineNo07.add("3.1");
        lineNo08.add("Potato");         lineNo08.add("Plant"); lineNo08.add("77");  lineNo08.add("2");    lineNo08.add("0.1"); lineNo08.add("17");
        lineNo09.add("Cod Fillet");     lineNo09.add("Meat");  lineNo09.add("82");  lineNo09.add("17.8"); lineNo09.add("0.7"); lineNo09.add("0");
        lineNo10.add("Pork Chop");      lineNo10.add("Meat");  lineNo10.add("231"); lineNo10.add("24");   lineNo10.add("14");  lineNo10.add("0");
        lineNo11.add("Avocado");        lineNo11.add("Plant"); lineNo11.add("160"); lineNo11.add("2");    lineNo11.add("15");  lineNo11.add("9");
        lineNo12.add("Minced Beef");    lineNo12.add("Meat");  lineNo12.add("332"); lineNo12.add("14");   lineNo12.add("30");  lineNo12.add("0");
        lineNo13.add("Carrot");         lineNo13.add("Plant"); lineNo13.add("41");  lineNo13.add("0.9");  lineNo13.add("0.2"); lineNo13.add("10");
        
        // --- Add the lines to the stringArray to return
        strArray.add(lineNo01);
        strArray.add(lineNo02);
        strArray.add(lineNo03);
        strArray.add(lineNo04);
        strArray.add(lineNo05);
        strArray.add(lineNo06);
        strArray.add(lineNo07);
        strArray.add(lineNo08);
        strArray.add(lineNo09);
        strArray.add(lineNo10);
        strArray.add(lineNo11);
        strArray.add(lineNo12);
        strArray.add(lineNo13);
    }
    
    public ArrayList<ArrayList<String>> getStringArray(){
    	// return the constructed strArray which holds the data for validation
    	//   of your data structure
        return strArray;
    }
    
    public void printTestData(){    
        // --- Print the inputs
        for (int line=0; line<strArray.size(); line++){
            System.out.println("Name          :" + strArray.get(line).get(0));
            System.out.println("--Type        :" + strArray.get(line).get(1));
            System.out.println("--Calories    :" + strArray.get(line).get(2));
            System.out.println("--Protein     :" + strArray.get(line).get(3));
            System.out.println("--Fat         :" + strArray.get(line).get(4));
            System.out.println("--Carbohydrate:" + strArray.get(line).get(5));
        }
    }
}
