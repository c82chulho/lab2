/**
* Fox.java
*
* DESCRIPTION:
* This file is Fox Class
* It is an inheritance class from Animal 
* It sets object name as fox and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Fox extends Animal{
	Fox(){
		setName("Fox");
	}

	public String eat(){
		return "Bluejay, Rabbit, Mouse and Squirrel";
	}
}
