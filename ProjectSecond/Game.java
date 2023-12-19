
import java.util.Random;

public class Game {
    private final Parser parser;
    private Room currentRoom;

    public Game() {
        createRooms();
        parser = new Parser();
    }

    private void createRooms() {
        Room outsideLC, helpDesk, chapel, cCenter, restRoom,
                coffeeShop, LibraryA_to_Z, CS_labs, IT_helpDesk;

        // create the rooms
        outsideLC = new Room("outside the main entrance of the Learning Center");
        helpDesk = new Room("at the Library Help Desk and Stairwell");
        chapel = new Room("in the Library Chapel");
        cCenter = new Room("in the Counseling Center");
        restRoom = new Room("in the Restroom");
        coffeeShop = new Room("at the University Coffee Shop");
        LibraryA_to_Z = new Room("in the A to Z Library section and Stairwell");
        CS_labs = new Room("in the Computer Science Lab Bay");
        IT_helpDesk = new Room("At the campus IT help desk");

        // initializing the room exits
        outsideLC.addExit("east", helpDesk);
        outsideLC.addExit("south", cCenter);
        outsideLC.addExit("west", chapel);
        outsideLC.addItem(new Item("rock", 0.5));
        outsideLC.addItem(new Item("rabbit", 3.0));

        helpDesk.addExit("north", outsideLC);
        helpDesk.addExit("south", restRoom);
        helpDesk.addExit("west", chapel);
        helpDesk.addExit("up", LibraryA_to_Z);
        helpDesk.addItem(new Item("Book", 2.0));
        helpDesk.addItem(new Item("Scantron", 0.5));

        chapel.addExit("north", outsideLC);
        chapel.addExit("east", helpDesk);
        chapel.addExit("south", cCenter);
        chapel.addItem(new Item("Bible", 2.0));
        chapel.addItem(new Item("Book: History of Baptists", 2.5));

        cCenter.addExit("north", chapel);
        cCenter.addExit("east", restRoom);
        cCenter.addItem(new Item("Bookmark", 0.25));
        cCenter.addItem(new Item("Pamphlet", 0.25));

        restRoom.addExit("north", helpDesk);
        restRoom.addExit("west", cCenter);
        restRoom.addItem(new Item("Soap", 0.5));
        restRoom.addItem(new Item("Roll of Paper Towels", 1.0));

        coffeeShop.addExit("east", LibraryA_to_Z);
        coffeeShop.addExit("south", CS_labs);
        coffeeShop.addItem(new Item("Coffee", 0.6));
        coffeeShop.addItem(new Item("Tea", 0.5));
        coffeeShop.addItem(new Item("Coffee Mug", 1.0));
        coffeeShop.addItem(new Item("Ham Sandwich", 1.0));

        LibraryA_to_Z.addExit("south", IT_helpDesk);
        LibraryA_to_Z.addExit("west", CS_labs);
        LibraryA_to_Z.addExit("down", helpDesk);
        LibraryA_to_Z.addItem(new Item("Book", 1.0));
        LibraryA_to_Z.addItem(new Item("Bow", 3.0));

        CS_labs.addExit("north", coffeeShop);
        CS_labs.addExit("east", IT_helpDesk);
        CS_labs.addItem(new Item("Windows XPS Laptop", 1.5));
        CS_labs.addItem(new Item("Satchel of 5 Arrows", 5.50));

        IT_helpDesk.addExit("north", LibraryA_to_Z);
        IT_helpDesk.addExit("west", CS_labs);
        IT_helpDesk.addItem(new Item("Paper", 0.25));
        IT_helpDesk.addItem(new Item("Stapler", 1.0));

        currentRoom = outsideLC; // start game
    }
}
