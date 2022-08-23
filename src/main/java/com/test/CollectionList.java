package com.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionList {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		List<String> lt=new ArrayList<String>();
		lt.add("Ritu");
		lt.add("Vidya");
		lt.add("Rama");
		lt.add("Sita");
		lt.add("Laxman");
		lt.add("Bharat");
		System.out.println(lt.size());
		System.out.println(lt.get(0));
		System.out.println(lt);
		lt.add("Krishna");
		lt.add("Radha");
		System.out.println(lt);
		Iterator<String> ite = lt.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		

	}

}
