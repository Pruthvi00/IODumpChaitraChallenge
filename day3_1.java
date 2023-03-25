import java.util.Scanner;
class day3_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side of square :");
        int side = sc.nextInt();
        int Area_of_square = side * side ; 
        System.out.println("The area of square is : " + Area_of_square);
    }
}