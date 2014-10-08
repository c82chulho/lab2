/**
* Lab2App.java
*
* DESCRIPTION:
* This file is package test class
* It creates all name classes and shows detail of each class
* 
*
* AUTHOR: Chul ho Choi
*/

package lab2Class;

public class Lab2App {
	public static void main(String[] args){
		Tree t = new Tree();
		if(t.isMoving())
			System.out.println(t.getName() + " can move");
		else
			System.out.println(t.getName() + " cannot move");

		
		Grass g = new Grass();
		if(g.isMoving())
			System.out.println(g.getName() + " can move");
		else
			System.out.println(g.getName() + " cannot move");		
		
		
		Caterpillar c = new Caterpillar();
		if(c.isMoving())
			System.out.println(c.getName() + " can move and it eats " + c.eat());
		else
			System.out.println(c.getName() + " cannot move and it eats " + c.eat());
		
		
		Bluejay b = new Bluejay();
		if(b.isMoving())
			System.out.println(b.getName() + " can move and it eats " + b.eat());
		else
			System.out.println(b.getName() + " cannot move and it eats " + b.eat());
		
		
		Hawk h = new Hawk();
		if(h.isMoving())
			System.out.println(h.getName() + " can move and it eats " + h.eat());
		else
			System.out.println(h.getName() + " cannot move and it eats " + h.eat());
		
		
		Grasshopper gh = new Grasshopper();
		if(gh.isMoving())
			System.out.println(gh.getName() + " can move and it eats " + gh.eat());
		else
			System.out.println(gh.getName() + " cannot move and it eats " + gh.eat());
			
		Mouse m = new Mouse();
		if(m.isMoving())
			System.out.println(m.getName() + " can move and it eats " + m.eat());
		else
			System.out.println(m.getName() + " cannot move and it eats " + m.eat());
		
		Squirrel s = new Squirrel();
		if(s.isMoving())
			System.out.println(s.getName() + " can move and it eats " + s.eat());
		else
			System.out.println(s.getName() + " cannot move and it eats " + s.eat());
		
		Fox f = new Fox();
		if(f.isMoving())
			System.out.println(f.getName() + " can move and it eats " + f.eat());
		else
			System.out.println(f.getName() + " cannot move and it eats " + f.eat());
		
		Rabbit r = new Rabbit();
		if(r.isMoving())
			System.out.println(r.getName() + " can move and it eats " + r.eat());
		else
			System.out.println(r.getName() + " cannot move and it eats " + r.eat());
		
		Deer d = new Deer();
		if(d.isMoving())
			System.out.println(d.getName() + " can move and it eats " + d.eat());
		else
			System.out.println(d.getName() + " cannot move and it eats " + d.eat());
		
		
		Wolf w = new Wolf();
		if(w.isMoving())
			System.out.println(w.getName() + " can move and it eats " + w.eat());
		else
			System.out.println(w.getName() + " cannot move and it eats " + w.eat());
		
		
	}

}
