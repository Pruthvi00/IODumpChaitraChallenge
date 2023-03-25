
// Find largest number and smallest number between given 5 numbers .

import java.util.Scanner;
class day1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers :");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0; i<5;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Largest No. is :" + largest);
        System.out.println("smallest No. is :" + smallest);
    }
}