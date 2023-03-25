
// Check whether given character is vowel or consonant.


import java.util.Scanner;
class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sc.next().charAt(0);
        if((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')){
            System.out.println("The given character is vowel");
        }
        else{
            System.out.println("The given character is consonant");
        }
        
    }
}