package Assignment1;

public class Room {
    private String name;// название комнаты

    private String description;//описание комнаты

    // Конструктор для создания комнаты
    public Room(String name,String description) {
        this.name = name;

        this.description = description;

    }

    //Геттеры и сеттеры
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //Переопределение метода toString() для удобной проверки работаспосообности кода в дальнейшем
    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
