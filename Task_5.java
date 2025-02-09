import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] seats = new boolean[5][5]; // 5x5 theatre seating
        int choice;

        do {
            System.out.println("\n1. Display available seats");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available seats (false = available, true = reserved):");
                    for (boolean[] row : seats) {
                        for (boolean seat : row) {
                            System.out.print(seat + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter row number (0-4): ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    int col = scanner.nextInt();

                    if (row < 0 || row >= 5 || col < 0 || col >= 5) {
                        System.out.println("Invalid seat selection.");
                    } else if (seats[row][col]) {
                        System.out.println("Seat is already reserved.");
                    } else {
                        seats[row][col] = true;
                        System.out.println("Seat reserved successfully.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }
}