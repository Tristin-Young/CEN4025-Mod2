//import libraries
import java.util.ArrayList;

//create class
public class ToDoFunction {

    //create array list
    private ArrayList<ToDoItem> toDoList = new ArrayList<>();

    //create method to convert boolean to human readable
    public String boolToHuman(boolean isDone) {
        if (isDone) {
            return "Yes";
        } else {
            return "No";
        }
    }

    //create method to create new item
    public ArrayList<ToDoItem> createToDoItem(String itemName, String itemDescription) {
        //create new item
        ToDoItem item = new ToDoItem(itemName, itemDescription);
        //add item to array list
        toDoList.add(item);
        System.out.println("Item created successfully!");
        //return array list
        return toDoList;
    }

    //create method to delete item
    public ArrayList<ToDoItem> deleteToDoItem(ArrayList<ToDoItem> toDoList, int index) {

        try {
            //get item from array list
            ToDoItem item = toDoList.get(index);
            //remove item from array list
            toDoList.remove(index);
            System.out.println("Item deleted successfully!");

        } catch (IndexOutOfBoundsException e) {
            //item DNE
            System.out.println("Item not found!");
        }
        //return array list
        return toDoList;
    }
    //create method to view to do list
    public void viewToDoList(ArrayList<ToDoItem> toDoList) {
        //loop through array list
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " : " + toDoList.get(i).getItemName());
            System.out.println("\tDescription: " + toDoList.get(i).getItemDescription());
            System.out.println("\t\tCompleted: " + boolToHuman(toDoList.get(i).getIsDone()));
            System.out.println();
        }
        //if array list is empty
        if(toDoList.size() == 0) {
            System.out.println("No items found!");
        }

    }

    //create method to mark item as done
    public ArrayList<ToDoItem> markAsDone(ArrayList<ToDoItem> toDoList, int index) {
        try {
            //get item from array list
            ToDoItem item = toDoList.get(index);
            //set item as done
            item.setIsDone(true);
            System.out.println("Item marked as done!");
        } catch (IndexOutOfBoundsException e) {
            //item DNE
            System.out.println("Item not found!");
        }
        return toDoList;
    }

    //create method to terminate program
    public void terminate() {
        System.out.println("Don't forget to complete everything!");
        System.exit(0);
    }
}
