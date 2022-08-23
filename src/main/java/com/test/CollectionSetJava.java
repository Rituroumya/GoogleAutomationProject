package com.test;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st = new HashSet<String>();
		st.add("rama");
		st.add("krishna");
		st.add("gopal");
		st.add("murali");
		st.add("radha");
		st.add("meera");
		System.out.println(st.size());
		System.out.println(st);
		st.add("ritu");
		st.add("vidya");


	}

}
