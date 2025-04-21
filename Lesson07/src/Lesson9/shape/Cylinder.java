package Lesson9.shape;

public class Cylinder extends Shape implements Shape2D {
    Circle circle;
    int z;
    Cylinder(){
    	
    }
    
    Cylinder(Circle circle, int z){
    	this.circle=circle;
    	this.z=z;
    }
    public double area() {
    	return circle.area()*2+circle.circum() * z;
    }
  
    public double volume() {
    	return circle.area()*z;
    }

	@Override
	public double circum() {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
}
