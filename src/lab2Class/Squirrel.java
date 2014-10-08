/**
* Squirrel.java
*
* DESCRIPTION:
* This file is Squirrel Class
* It is an inheritance class from Animal 
* It sets object name as squirrel and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Squirrel extends Animal{
	Squirrel(){
		setName("Squirrel");
	}
	
	public String eat(){
		return "Tree";
	}

}
