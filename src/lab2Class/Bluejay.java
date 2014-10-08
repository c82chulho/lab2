/**
* Bluejay.java
*
* DESCRIPTION:
* This file is Bluejay Class
* It is an inheritance class from Animal 
* It sets object name as bluejay and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/
package lab2Class;

public class Bluejay extends Animal{
	Bluejay(){
		setName("Bluejay");
	}
	public String eat(){
		return "Tree, Caterpillar and Grasshopper";
	}

}
