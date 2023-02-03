public class Player {
    private Labyrinth labyrinth;
    private String name;
    public Player(Labyrinth labyrinth, String name) {
        this.labyrinth = labyrinth;
        this.name = name;
    }
    public boolean move(String direction) {
        return labyrinth.move(direction);
    }
    public String getCurrentRoomName() {
        return labyrinth.getCurrentRoomName();
    }
    public String getName() {
        return name;
    }
}
