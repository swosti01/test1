package com.mycompany.testproject1;

public class functionname {
    static void MyName(){
        System.out.println("Swastika");
    }
    static int sum(int a, int b){
        return a+b;
    }
    
    static float division( float a,float b){
        return a/b;
    }

    public static void main(String[] args) {
        int arr[] = {12,22,32,42,52,62,72};
        int i = 0 ;
        int sum = 0;
        //sum = sum + arr[i];
        for(i=0; i<arr.length; i++){
            
            sum = sum + arr[i];
           // System.out.println(" sum : " + sum);
        }
        System.out.println(" sum : " + sum);
//        int arr[] = { 1,2,3,4,5 };
//        int i;
//        int sum= 0;
//        for (i=0; i<arr.length; i++){
//            //System.out.println("Before sum : " + sum);
//            sum = sum + arr[i];
//            //System.out.println("After sum : " +sum);
//        }
//         System.out.println(" sum : " + sum);
        MyName();
        int addition = sum(5,7);
        float division = division(9, 3);
        System.out.println("Addition is " + addition);
        System.out.println("Sum is "+(sum(4,5)));
        System.out.println("Division is " + division);
        
    }
    
}
