/**
* Wolf.java
*
* DESCRIPTION:
* This file is Wolf Class
* It is an inheritance class from Animal 
* It sets object name as wolf and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Wolf extends Animal{
	Wolf(){
		setName("Wolf");
	}
	
	public String eat(){
		return "Deer";
	}

}
