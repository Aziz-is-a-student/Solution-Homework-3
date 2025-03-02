package Assignment2;

public class Room implements CloneableGameEntity{
    private String name;
    private int floor;
    private String description;

    public Room(String name, int floor, String description) {
        this.name = name;
        this.floor = floor;
        this.description = description;
    }

    @Override
    public Room cloneEntity() {
        return new Room(this.name,this.floor,this.description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", description='" + description + '\'' +
                '}';
    }
}
