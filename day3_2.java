
//Find the area of rectangle

import java.util.Scanner;
class day3_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of sides of rectangle :");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int Area_of_rectangle = length * breadth ; 
        System.out.println("The area of rectangle is : " + Area_of_rectangle);
    }
}