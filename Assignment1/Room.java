package Assignment1;

public class Room {
    private String name;
    private int capacity;
    private String description;
    public Room(String name, int capacity,String description) {
        this.name = name;
        this.capacity = capacity;
        this.description = description;

    }
    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
