import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message1;
        int number1, number2;
        message1 = "Enter number : ";
        number2 = 0;

        System.out.print(message1);
        number1 = input.nextInt();
        for (int i = 1; i <= number1; i = i * 2) {
            if (i<number1){
                number2 += 1;
                System.out.println(i);
            }

        }
        System.out.println("Piece : " + (number2 -1) );


    }
}
