//import libraries
import java.util.ArrayList;
import java.util.Scanner;

//create class
public class ToDoList {

    //create method to parse choice into integer
    public static int getChoice(Scanner scanner){
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    //create method to display menu
    public static void displayMenu() {
        System.out.println("Welcome to your To-Do List!");
        System.out.println("Press 1 to create a new item");
        System.out.println("Press 2 to delete an item");
        System.out.println("Press 3 to view all items");
        System.out.println("Press 4 to mark an item as done");
        System.out.println("Press 5 to exit");
    }

    //main
    public static void main(String[] args) {
        //create objects
        ToDoFunction toDoFunction = new ToDoFunction();
        ToDoFunction toDoList = new ToDoFunction();
        ArrayList<ToDoItem> list = new ArrayList<>();

        //create variables
        boolean isExit = false;
        int choice;

        Scanner scanner = new Scanner(System.in);

        //loop until user exits
        while (!isExit) {
            //show menu and get choice
            displayMenu();
            choice = getChoice(scanner);

            //switch case
            switch(choice) {
                //create item
                case 1:
                    //get item name and description
                    System.out.println("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.println("Enter item description: ");
                    String itemDescription = scanner.nextLine();
                    //update list with new item
                    list = toDoFunction.createToDoItem(itemName, itemDescription);
                    break;
                //delete item
                case 2:
                    //show list and get index to delete
                    toDoList.viewToDoList(list);
                    System.out.println("Enter item index to be deleted: ");
                    int index = scanner.nextInt();
                    //update list with deleted item
                    list = toDoFunction.deleteToDoItem(list, index);
                    break;
                //view list
                case 3:
                    toDoList.viewToDoList(list);
                    break;
                //mark item as done
                case 4:
                    //show list and get index to mark as done
                    toDoList.viewToDoList(list);
                    System.out.println("Enter item index to be marked as done: ");
                    int index2 = scanner.nextInt();
                    //update list with marked item
                    list = toDoFunction.markAsDone(list, index2);
                    break;
                //exit
                case 5:
                    isExit = true;
            }
        }

        //close scanner and terminate program
        scanner.close();
        toDoList.terminate();
    }
}
