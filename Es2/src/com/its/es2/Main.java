package com.its.es2;

public class Main {

	public static void main(String[] args) {		
		BT t = new BT(2); // condizione di esistenza dell'albero � l'esistenza della root 
		Node root = t.getRoot();
		t.insertLeft(root, 3);
		Node nx = t.insertRight(root, 3);
		t.insertLeft(nx, 5);
		
		Node n5 = t.searchFirst(5);
		t.deleteNode(n5);
		
		t.updateNode(nx, 10);
		Node n3  = t.searchFirst(3);
		System.out.println("n3 != nx" + (n3 != nx));
	}
}
