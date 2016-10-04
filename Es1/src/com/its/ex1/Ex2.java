package com.its.ex1;

import java.util.Random;

public class Ex2 {
	
	public static void main(String[] args){
		Random r = new Random(47362); // iea:D it's a fuckin strange number
		
		// Creo l'array e lo valorizzo
		// int[] array = new int[10];
		int nElements = Integer.parseInt(args[0]);
		int[] array = new int[nElements];
		
		for (int i = 0; i < array.length; i++){
			array[i] = r.nextInt();
		}
		
		double averageFor = avgFor(array);
		double averageWhile = avgWhile(array);
		double averageForeach = avgForeach(array);
		double averageDoWhile = avgDoWhile(array);
		
		System.out.println("averageFor: " + averageFor);
		System.out.println("averageWhile: " + averageWhile);
		System.out.println("averageForeach: " + averageForeach);
		System.out.println("averageDoWhile: " + averageDoWhile);
	}
	
	private static double avgFor(int[] array){
		double sum = 0;
		for (int i = 0; i < array.length; i++){
			sum += array[i];
		}
		
		double media = sum / array.length;
		
		return media;
	}
	
	private static double avgWhile(int[] array){
		double sum = 0;
		int index = 0;
		
		while (index < array.length){
			sum += array[index];
			index++;
		}
		
		double media = sum / array.length;
		
		return media;
	}
	
	private static double avgForeach(int[] array){
		double sum = 0;
		for (int val : array){
			sum += val;
		}
		
		double media = sum / array.length;
		
		return media;
	}
	
	private static double avgDoWhile(int[] array){
		double sum = 0;
		int index = 0;
		
		do {
			sum += array[index];
			index++;
		} while (index < array.length);
		
		double media = sum / array.length;
		
		return media;
	}
}
