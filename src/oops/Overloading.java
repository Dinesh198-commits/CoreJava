package oops;

public class Overloading {
	public int getArea(int l,int b) {
		return l*b;
	}
	public int getArea(int l) {
		return l*l;
	}
	public double getArea(double l) {
		return (double)l*l;
	}
	
}
