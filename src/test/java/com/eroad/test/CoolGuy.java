package com.eroad.test;

public class CoolGuy {

	public void walk(int meters) {
		System.out.println(String.format("A cool guy can walk for %sm ", meters));
	}
	
	public void walk(int meters, String with) {
		System.out.println(String.format("A cool guy can walk for %sm with %s so happy", meters, with));
	}
}
