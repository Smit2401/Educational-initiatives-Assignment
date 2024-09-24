import java.util.*;
public class RLS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        while (true) {
            System.out.print("give command: ");
            String command = sc.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break;
            }

            controller.executeCommand(command);
        }
        sc.close();
    }
}
