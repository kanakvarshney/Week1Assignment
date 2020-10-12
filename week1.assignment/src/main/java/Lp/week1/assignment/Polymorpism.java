//7. Write a java program to showCase static and runtime Polymorphism.
package Lp.week1.assignment;

class Shape{
	void draw() {
		System.out.println("Drawing Shapes");
	}
	
}

class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Draw rectangle Shape");
	}
	
	public static void printArea(int x,int y){
	    System.out.println(x*y);
	  }
	  public static void printArea(int x){
	    System.out.println(x*x);
	  }
	  public static void printArea(int x,double y){
	    System.out.println(x*y);
	  }
	  public static void printArea(double x){
	    System.out.println(x*x);
	  }
}

class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Draw Circle Shape");
	}
}

public class Polymorpism {
	
	public static void main(String[] args) {
		
		Shape s;
		s=new Rectangle();
		s.draw();
		Rectangle r=new Rectangle();
		Rectangle.printArea(2,4);
		Rectangle.printArea(2,5.1);
	    Rectangle.printArea(10);
	    Rectangle. printArea(2.3);
		s=new Circle();
		s.draw();
		
	}

}
