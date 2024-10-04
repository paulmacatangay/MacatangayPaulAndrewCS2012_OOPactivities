import java.util.Scanner;

class GettingGreater 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting the Greater Value");

        System.out.print("Enter first character: ");
        char first_char = scanner.next().charAt(0);

        System.out.print("Enter second character: ");
        char second_char = scanner.next().charAt(0);

        char greater_char = (char) Math.max(first_char, second_char);

        System.out.println("--------------------------------------------------");
        System.out.println("The character with greater value is: " + greater_char);
        System.out.println("--------------------------------------------------");
    
        System.out.println("Showing the ASCII Codes");
        System.out.println(first_char + ": " + (int) first_char);
        System.out.println(second_char + ": " + (int) second_char);
    }
}
