/**
* Grasshopper.java
*
* DESCRIPTION:
* This file is Grasshopper Class
* It is an inheritance class from Animal 
* It sets object name as grasshopper and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Grasshopper extends Animal{
	Grasshopper(){
		setName("Grasshopper");
	}
	
	public String eat(){
		return "Grass";
	}

}
