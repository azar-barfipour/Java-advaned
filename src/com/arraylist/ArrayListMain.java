package com.arraylist;
import java.util.*;

public class ArrayListMain {

	static ArrayList<String> listNames = new ArrayList<>();
	public static void main(String[] args) {
//		ArrayList arrayList =new ArrayList();
//		arrayList.add(12);
//		arrayList.add(new Integer (12))
		
		listNames.add("Azar");
		listNames.add("Masoud");
		listNames.add("Armin");
		listNames.add("Avan");
		listNames.add("Aryan");
		
		ArrayListMain app = new ArrayListMain();
		app.displayList(listNames);
		
		 int position =app.search("Azar");
		 if(position != -1) {
			 System.out.println(listNames.get(position));
		 }else {
			 System.out.println("false");
		 }
		 System.out.println("###########");
		 app.modifyName(1, "Mas");
		 app.displayList(listNames);
		 


	}

	void displayList(ArrayList<String> names) {
		for(String name:names) {
			System.out.println(name);
		}
	}
	int search (String name) {
		return listNames.indexOf(name);
	}
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}
	}


