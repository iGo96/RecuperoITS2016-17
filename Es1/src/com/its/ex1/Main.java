package com.its.ex1;

public class Main {

	public static void main(String[] args) {
		// Array che contiene i valori
		int[] array = new int[10];
		
		//Carica i dati nell'array
		for (int i = 0; i < array.length; i++){
			array[i] = i;
		}
		
		int sum = 0;
		for (int i = 0; i < array.length; i++){
			sum += array[i];
		}
		
		double media = (double)sum / array.length;
		
		//System.out.println(media);
		System.out.println(media());
		
	}
	
	static double media(){
		// Array che contiene i valori
		int[] array = new int[10];
			
		// Carica i dati nell'array
		int elem = 0;
		for (int val : array){
			val = elem;
			elem++; 
		}
		
		int sum = 0;
		for (int val : array){
			sum += val;
		}
		
		double media = (double)sum / array.length;
		
		return media;
	}
}