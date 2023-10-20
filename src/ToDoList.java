import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static int getChoice(Scanner scanner){
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static void displayMenu() {
        System.out.println("Welcome to your To-Do List!");
        System.out.println("Press 1 to create a new item");
        System.out.println("Press 2 to delete an item");
        System.out.println("Press 3 to view all items");
        System.out.println("Press 4 to mark an item as done");
        System.out.println("Press 5 to exit");
    }

    public static void main(String[] args) {
        ToDoFunction toDoFunction = new ToDoFunction();
        ToDoFunction toDoList = new ToDoFunction();
        ArrayList<ToDoItem> list = new ArrayList<>();
        boolean isExit = false;
        int choice;

        Scanner scanner = new Scanner(System.in); // Create one Scanner for user input

        while (!isExit) {
            displayMenu();
            choice = getChoice(scanner); // Pass the scanner to the getChoice method

            switch(choice) {
                case 1:
                    System.out.println("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.println("Enter item description: ");
                    String itemDescription = scanner.nextLine();
                    list = toDoFunction.createToDoItem(itemName, itemDescription);
                    break;
                case 2:
                    toDoList.viewToDoList(list);
                    System.out.println("Enter item index to be deleted: ");
                    int index = scanner.nextInt();
                    list = toDoFunction.deleteToDoItem(list, index);
                    break;
                case 3:
                    toDoList.viewToDoList(list);
                    break;
                case 4:
                    toDoList.viewToDoList(list);
                    System.out.println("Enter item index to be marked as done: ");
                    int index2 = scanner.nextInt();
                    list = toDoFunction.markAsDone(list, index2);
                    break;
                case 5:
                    isExit = true;
            }
        }

        scanner.close(); // Close the scanner after you're done with it
        toDoList.terminate();
    }
}
