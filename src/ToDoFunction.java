import java.util.ArrayList;

public class ToDoFunction {

    private ArrayList<ToDoItem> toDoList = new ArrayList<>();


    public String boolToHuman(boolean isDone) {
        if (isDone) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public ArrayList<ToDoItem> createToDoItem(String itemName, String itemDescription) {
        ToDoItem item = new ToDoItem(itemName, itemDescription);
        toDoList.add(item);
        System.out.println("Item created successfully!");
        return toDoList;
    }


    public ArrayList<ToDoItem> deleteToDoItem(ArrayList<ToDoItem> toDoList, int index) {
        try {
            ToDoItem item = toDoList.get(index);
            toDoList.remove(index);
            System.out.println("Item deleted successfully!");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Item not found!");
        }
        return toDoList;
    }

    public void viewToDoList(ArrayList<ToDoItem> toDoList) {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " : " + toDoList.get(i).getItemName());
            System.out.println("\tDescription: " + toDoList.get(i).getItemDescription());
            System.out.println("\t\tCompleted: " + boolToHuman(toDoList.get(i).getIsDone()));
            System.out.println();
        }
        if(toDoList.size() == 0) {
            System.out.println("No items found!");
        }

    }

    public ArrayList<ToDoItem> markAsDone(ArrayList<ToDoItem> toDoList, int index) {
        try {
            ToDoItem item = toDoList.get(index);
            item.setIsDone(true);
            System.out.println("Item marked as done!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Item not found!");
        }
        return toDoList;
    }

    public void terminate() {
        System.out.println("Don't forget to complete everything!");
        System.exit(0);
    }
}
