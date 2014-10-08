/**
* Caterpillar.java
*
* DESCRIPTION:
* This file is Caterpillar Class
* It is an inheritance class from Animal 
* It sets object name as caterpillar and what it can eat
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Caterpillar extends Animal{
	Caterpillar(){
		setName("Caterpillat");
	}
	public String eat(){
		return "Tree";
	}

}
