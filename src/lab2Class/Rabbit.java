/**
* Rabbit.java
*
* DESCRIPTION:
* This file is Rabbit Class
* It is an inheritance class from Animal 
* It sets object name as rabbit and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Rabbit extends Animal{
	Rabbit(){
		setName("Rabbit");
	}
	
	public String eat(){
		return "Grass";
	}

}
