/**
* Animal.java
*
* DESCRIPTION:
* This file is Animal Class
* It is an inheritance class from lab2Object 
* It sets object can move
* 
*
* AUTHOR: Chul ho Choi
*/
package lab2Class;

public class Animal extends Lab2Object{
	private boolean moving;

	Animal(){
		this.moving = true;
	}
	
	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	

}
