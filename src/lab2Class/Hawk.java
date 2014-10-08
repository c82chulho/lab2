/**
* Hawk.java
*
* DESCRIPTION:
* This file is Hawk Class
* It is an inheritance class from Animal 
* It sets object name as hawk and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Hawk extends Animal{
	Hawk(){
		setName("Hawk");
	}
	public String eat(){
		return "Mouse and Squirrel";
	}

}
