package anonymous;

import java.util.Scanner;

public class ComputeFramework {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ComputationDB cDb = new ComputationDB();

        // .... previously defined operations ....

        System.out.println("Want to add a division op? Y/N");
        if (sc.next().equalsIgnoreCase("Y")) {
            System.out.println("Give the operands separated by whitespace:");
            int operand1 = sc.nextInt();
            int operand2 = sc.nextInt();

            cDb.addOperation(new ComputationDB.IBinaryOperation() {
                @Override
                public void execute() {
                    System.out.println("DIV(" + operand1 + ", " + operand2 + ") = " +
                            (operand1 / operand2));
                }
            });
        }

        cDb.executeAll();
    }
}