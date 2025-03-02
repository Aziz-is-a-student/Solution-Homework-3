package Assignment1;

public class NPC {
    private String name; // Имя NPC
    private String description; // Описание NPC
    private int damage;// Урон, который наносит NPC


    // Конструктор для создания NPС
    public NPC(String name, String description, int damage) {
        this.name = name;
        this.description = description;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    //Переопределение метода toString() для удобной проверки работаспосообности кода в дальнейшем
    @Override
    public String toString() {
        return "NPC{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", damage=" + damage +
                '}';
    }
}
