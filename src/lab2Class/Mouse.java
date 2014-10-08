/**
* Mouse.java
*
* DESCRIPTION:
* This file is Mouse Class
* It is an inheritance class from Animal 
* It sets object name as mouse and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/
package lab2Class;

public class Mouse extends Animal{
	Mouse(){
		setName("Mouse");
	}
	
	public String eat(){
		return "Tree and Grass";
	}

}
