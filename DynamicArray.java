package com.greatlearning.corejava;

public class DynamicArray {
	int[] array;
	int capacity;
	int size;
	
	DynamicArray(int capacity){
		this.capacity = capacity;
		array = new int[capacity];
		size = 0;
	}
	void insert(int element) {
		if(size == capacity) {
			growCapacity();
		}
		array[size++] = element;
	}
	void growCapacity(){
		int[] newArr = new int[2*size];
		for(int i=0; i<size; i++) {
			newArr[i] = array[i];
		}
		array = newArr;
		capacity = 2*size; 
	}
	
	int delete(int index){
		if(index >= size){
			return -1;
		}
		int deletedEle = array[index];
		for(int i = index+1; i<size;i++) {
			array[i-1] = array[i];
		}
		size--;
		return deletedEle;
	}
	void display() {
		System.out.println("\n Size of array is ");
		for(int i=0; i<size;i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("\n Capacity of Array is ");
		for(int i=0; i<capacity;i++) {
			System.out.print(array[i] + ",");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		DynamicArray ob = new DynamicArray(8);
		ob.insert(1);
		ob.insert(2);
		ob.insert(3);
		ob.insert(4);
		ob.insert(5);
		ob.insert(6);
		ob.insert(1);
		ob.insert(2);
		ob.insert(3);
		ob.insert(4);
		ob.insert(5);
		ob.insert(6);
		ob.display();
		ob.delete(5);
		ob.display();
	}

}
