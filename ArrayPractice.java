package com.company;

public class ArrayPractice{

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,5,8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 1) {
                System.out.println(arr[i]);
            }
        }
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrOfStr = str.split(" ", 0 );
        for(String a : arrOfStr)
         System.out.println(a);


	// write your code here
    }
}
