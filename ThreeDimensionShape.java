package com.greatlearning.corejava;

class ThreeDimensionShape {
	double width, height, depth;
	
	ThreeDimensionShape(){
		height = 0;
		width = 0;
		depth = 0;
	}
	ThreeDimensionShape(double x){
		height = x;
		System.out.println(height);
	}
	ThreeDimensionShape(double x, double y, double z){
		height = x;
		width = y;
		depth = z;
		System.out.println(height + " "+ width + " " + depth);
	}
	void volume() {
		double vol =  width*height*depth;
		System.out.println("The volume is " + vol);
	}

	public static void main(String[] args) {
		ThreeDimensionShape shape = new ThreeDimensionShape();
		ThreeDimensionShape shape1 = new ThreeDimensionShape(10);
		ThreeDimensionShape shape2 = new ThreeDimensionShape(20,30,40);
		shape.volume();
		shape1.volume();
		shape2.volume();
		

	}

}
