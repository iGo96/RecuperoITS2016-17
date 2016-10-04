package com.its.es2;

public class Node<T> {
	//: where t is int;
	// nodo vuoto => NON ESISTE
	
	private T value;
	private Node sx;
	private Node dx;
	private Node father;
	
	public Node(T newValue, Node newFather){
		value = newValue;
		sx = null;
		dx = null;
		father = newFather;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setValue(T newValue){
		value = newValue;
	}

	public void delete(){
		this.father = null;
	}
	
	// Figlio DX
	public Node getDx(){
		return dx;
	}
	
	public void setDx(Node newDx){
		if(dx != null)
			dx = newDx;
	}
	
	public void setDx(T newDxValue){
		if(dx != null)
			dx = new Node(newDxValue, this);
	}
	
	// Figlio SX
	public Node getSx(){
		return sx;
	}
	
	public void setSx(Node newSx){
		if(sx == null)
			sx = newSx;
	}

	public void setSx(T newSxValue){
		if(sx == null)
			sx = new Node(newSxValue, this);
	}
	
	// Father
	public Node getFather(){
		return this.father;
	}
	
	// La root non ha un genitore :'(, quindi esiste la fx hasFather
	public boolean hasFather(){
		return (this.father != null);
	}
	
	// Generics
	public boolean isEmpty(){
		return (value == null);
	}
	
	public boolean exists(){
		return !(value == null);
	}
	
	public boolean hasChildrens(){
		// return (dx.isEmpty() && sx.isEmpty());
		return (dx.exists() && sx.exists());
	}
}
