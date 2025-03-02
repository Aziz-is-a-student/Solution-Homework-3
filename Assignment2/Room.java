package Assignment2;
public class Room implements CloneableGameEntity {
    private String name;        // Название комнаты
    private int floor;          // Этаж, на котором находится комната
    private String description; // Описание комнаты

    // Конструктор для создания комнаты

    public Room(String name, int floor, String description) {
        this.name = name;
        this.floor = floor;
        this.description = description;
    }

    // Реализация метода клонирования. Создаёт новый объект Room с теми же параметрами.
    @Override
    public Room cloneEntity() {
        return new Room(this.name,this.floor,this.description);
    }

    // Геттеры и сеттеры
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
    //Переопределение метода toString() для вывода информации о комнате
    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", description='" + description + '\'' +
                '}';
    }
}
