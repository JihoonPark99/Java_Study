public class Game {
    private Parser parser;
    private Room currentRoom;

    /**
     * Create the game and initialise its internal map.
     */
    public Game() {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms() {
        // Room outside, theater, pub, lab, office;
        Room downstairs, restroom, kitchen, shoecase, entrance, upstairs, roomA, roomB, storage;

        // create the rooms
        downstairs = new Room("outside the main entrance of the my home");
        restroom = new Room("in a restroom");
        kitchen = new Room("in the kitchen");
        shoecase = new Room("in a shoecase");
        entrance = new Room("in the entrance");

        upstairs = new Room("in a upstairs");
        roomA = new Room("in the roomA");
        roomB = new Room("in the roomB");
        storage = new Room("in the storage");

        // initialise room exits
        downstairs.setExit("east", restroom);
        downstairs.setExit("south", shoecase);
        downstairs.setExit("west", kitchen);
        downstairs.setExit("up", upstairs);

        restroom.setExit("west", downstairs);

        kitchen.setExit("east", downstairs);

        shoecase.setExit("north", downstairs);
        shoecase.setExit("east", entrance);

        entrance.setExit("west", shoecase);

        upstairs.setExit("down", downstairs);
        upstairs.setExit("east", roomB);
        upstairs.setExit("west", roomA);
        upstairs.setExit("south", storage);

        roomB.setExit("west", upstairs);

        roomA.setExit("east", upstairs);

        storage.setExit("north", upstairs);

        currentRoom = downstairs; // start game outside
    }

    /**
     * Main play routine. Loops until end of play.
     */
    public void play() {
        printWelcome();

        // Enter the main command loop. Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to My home!");
        System.out.println("My home is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * 
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) {
        boolean wantToQuit = false;

        if (command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        } else if (commandWord.equals("go")) {
            goRoom(command);
        } else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        // else command not recognised.
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp() {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the home.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /**
     * Try to in to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        } else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * 
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) {
        if (command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        } else {
            return true; // signal that we want to quit
        }
    }
}
