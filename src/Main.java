import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                    Song List:
                    1. Track 1
                    2. Track 2
                    3. Track 3
                    4. Track 4
                    """);
            System.out.print("Pick one you like: ");
            choice = scanner.nextInt();

            if(choice < 1 || choice > 4){
                System.out.println("\nEnter your choice between 1-4\n");
            }

        } while (choice < 1 || choice > 4);

        Audify player = new Audify(choice - 1);
        player.run();
    }
}
