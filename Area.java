package com.greatlearning.corejava;

class Area {

	final double pi = 22/7;
	double radius;
	Area(double r){
		radius = r;
//		area();
	}
	void area() {
		double area = pi*radius*radius;
		System.out.println("The area of the circle is " + area);
	}
	public static void main(String[] args) {
		Area circle1 = new Area(2.5);
		circle1.area();
	}

}
