package com.greatlearning.corejava;

//public class ClassA {
//
//	public ClassA(int value){
//	System.out.println(value);
//	}
//
//	public static void main(String args[]){
//	ClassA classA = new ClassA('1');
//	}
//}
//public class ClassA {
//    public ClassA() {
//        System.out.println("default constructor");
//    }
//
//    public ClassA(int a){
//        System.out.println("Parameterized constructor with int argument "+a);
//    }
//
//    public ClassA(char a){
//        System.out.println("Parameterized constructor with char argument "+a);
//    }
//
//    public static void main(String args[]){
//        ClassA classA = new ClassA('1');
//        classA = new ClassA(1);
//    }
//}
//
//class ClassB{
//      public int x;
//      private int y;                                                    
//      void cal(int a, int b){
//       x =  a + 1;
//       y =  b;                                                    
//       }
//}
// public class ClassA {
//        public static void main(String args[]){
//        ClassB obj = new ClassB();   
//        obj.cal(2, 3);
//        System.out.println(obj.x + " " + obj.y);   
//        }
// }
//package com.greatlearning.corejava;

class ClassB

{

    public int x;

    static int y = 6;

    void cal(int a, int b)

    {

        x =  a + 1;

        y =  24;

    }        

    void print() {
//    	y = 26;

     System.out.println(" "+y);

    }

}    

public class ClassA 

{

    public static void main(String args[])

    {

     ClassB obj = new ClassB();   

        obj.cal(10, 20);

        System.out.print(obj.x);   

        obj.print();

    }

}

 