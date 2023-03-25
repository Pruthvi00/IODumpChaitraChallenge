
// Find the area of triangle

import java.util.Scanner;
class day3_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of sides of triangle :");
        int height = sc.nextInt();
        int base = sc.nextInt();
        int Area_of_triangle = (height * base)/2 ; 
        System.out.println("The area of triangle is : " + Area_of_triangle);
    }
}