package shittyLabyrinth;

public class Labyrinth {

    private int currentRoom;
    private final String[] roomNames = {
        "Viking Hall", 
        "Fjord of Sorrows", 
        "Dragon's Lair", 
        "Asgard's Gate", 
        "Valhalla"
    };

    public Labyrinth() {
        currentRoom = 0;
    }

    public String getCurrentRoomName() {
        return roomNames[currentRoom];
    }

    public boolean move(String direction) {
    	
        if (direction.equals("north")) {
        	if (currentRoom != 0) {
        		currentRoom--;
        	}
        } else if (direction.equals("south")) {
        		currentRoom++;
        } else if (direction.equals("east")) {
        		currentRoom++;
        } else if (direction.equals("west")) {
        	if (currentRoom != 0) {
        		currentRoom--;
        	}
        }

        if (currentRoom == 4) {
            return true;
        } else {
            return false;
        }
    }
}

