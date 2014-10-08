/**
* Deer.java
*
* DESCRIPTION:
* This file is Deer Class
* It is an inheritance class from Animal 
* It sets object name as deer and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Deer extends Animal{
	Deer(){
		setName("Deer");
	}
	
	public String eat(){
		return "Tree and Grass";
	}

}
