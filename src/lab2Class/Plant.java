/**
* Plant.java
*
* DESCRIPTION:
* This file is Plant Class
* It is an inheritance class from lab2Object 
* It sets object cannot move
* 
*
* AUTHOR: Chul ho Choi
*/
package lab2Class;

public class Plant extends Lab2Object{
	private boolean moving;

	Plant(){
		this.moving = false;
	}
	
	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	

}
