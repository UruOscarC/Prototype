package com.ogcg.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arguments = {"osc", "boris", "DIO"}; 
        for (String type : arguments) {
            Person prototype = Factory.getPrototype(type);
            if (prototype != null) {
                System.out.println(prototype);
            }
        }
	}
}
