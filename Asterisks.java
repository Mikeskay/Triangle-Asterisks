package asterisks.base;

public class Asterisks{

    public static void printAsterisks (int num){


        // A nested For loop for the numbeer or spaces and stars
        for (int i = 1; i <= num; i++){
            int numberOfSpaces = num - i;
            int numberOfAsterix = i;

            for (int j = 1; j <=numberOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=numberOfAsterix; j++){
                System.out.print("*");
            }
            // Creates a new line for the asterisks to sit on
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // Take's in an argument and changes it into an int
        int num = Integer.parseInt(args[0]);

        // Take's in an argument and changes it into an int
        printAsterisks(num);


    }

}
