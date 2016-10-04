package com.its.exceptions;

public class NodeDoesNotExistException extends Exception{
	
	public NodeDoesNotExistException(){
		super("Il nodo che stai cercando di elminare non esiste");
	}
	
}
