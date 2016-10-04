package com.its.es2;

public class BT {
	private Node node;
	
	public BT(int value){
		node = new Node(value, null);
	}
	
	public Node getRoot(){
		return node;
	}
	
	public Node getNode(){
		return node;
	}
	
	public Node searchFirst(int element){
		Node foundElement = search(node.getDx(), element);
		if (foundElement == null)
			foundElement = search(node.getSx(), element);
		
		return foundElement;
	}
	
	private Node search(Node node, int element){
		// CONTROLLARE SE IL NODO HA FIGLI. NON PUO' FARE GETDX SE NON HA FIGLI.
		
		if (this.node.getValue() == new Integer(element))
			return this.node;
		else
			return search(node.getDx(), element);
	}
	
	public Node insertRight(Node node, int value){
		if (node.getDx() == null){
			node.setDx(value);
			return node.getDx();
		}
		else
			return null;
	}
	
	public Node insertLeft(Node node, int value){
		if (node.getSx() == null){
			node.setSx(value);
			return node.getSx();
		}
		else
			return null;
	}
	
	public void updateNode(Node n, int val){
		n.setValue(val);
	}
	
	public void deleteNode(Node n) throws Exception{
		if (n == null)
			throw new Exception("Il nodo che stai cercando di elminare non esiste");
		if (n.getFather().getDx() == n)
			n.getFather().setDx(null);
		if (n.getFather().getSx() == n)
			n.getFather().setSx(null);
	}
}
