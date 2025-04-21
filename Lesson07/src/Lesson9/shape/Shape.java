package Lesson9.shape;

public abstract  class Shape {
//    public/*애가접근제한자*/abstract double Circum();
    public abstract  double area();
    public String toString() {
    	return "넓이:" + area();
    }
}
