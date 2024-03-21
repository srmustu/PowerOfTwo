import java.util.Scanner;
public class PowersOf4And5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message1;
        int number1, number2;
        message1 = "Enter number : ";
        number2 = 0;

        System.out.print(message1);
        number1 = input.nextInt();
        for (int i = 0; i <= number1; i = i += 10) {
            if (i<number1){
                number2 += 1;
                System.out.println(i);
            }

        }
        System.out.println("Piece : " + (number2 -1) );

    }
}
