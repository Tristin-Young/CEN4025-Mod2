//ToDoItem class
public class ToDoItem {

    // Fields
    private String itemName;
    private String itemDescription;
    private boolean isDone;

    // Constructor
    public ToDoItem(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.isDone = false;
    }

    // Methods
    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    // Override toString method
    public String toString() {
        return "Item Name: " + itemName + "\nItem Description: " + itemDescription + "\nIs Done: " + isDone;
    }

}
