package C;
import java.util.Scanner;

public class Tokenring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Nodes you want in the Ring: ");
        int n = sc.nextInt();

        System.out.println("\nRing Formed is as below: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("0\n");

        int choice = 0;
        do {
            System.out.print("Enter Sender: ");
            int sender = sc.nextInt();

            System.out.print("Enter Receiver: ");
            int receiver = sc.nextInt();
            sc.nextLine();  // Clear the newline character

            System.out.print("Enter data to be sent: ");
            String data = sc.nextLine();

            int token = 0;
            System.out.print("\nToken Passing: ");
            for (int i = token; i < receiver; i++) {
                System.out.print(" " + i + " ->");
            }
            System.out.println(" " + receiver);

            System.out.println("Sender: " + sender + " , Sending Data: " + data);

            for (int i = sender; i != receiver; i = (i + 1) % n) {
                System.out.println("Data: " + data + " , Forwarded By: " + i);
            }

            System.out.println("Receiver: " + receiver + " , Received the Data: " + data);
            token = sender;

            System.out.print("\nDo you want to send data again? If YES enter 1, If NO enter 0: ");
            choice = sc.nextInt();

        } while (choice == 1);

        sc.close();
    }
}
