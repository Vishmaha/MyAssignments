package week1.day2;

public class Palindrome {

    public static void main(String[] args) {
        
        int input = 121; 
        int output = 0;
        int original = input;

        for (int i = input; i != 0; i /= 10) {
            int digit = i % 10;  
            output = output * 10 + digit;
        }

        if (original == output) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }
}
