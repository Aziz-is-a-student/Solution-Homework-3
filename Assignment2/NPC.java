package Assignment2;


public class NPC implements CloneableGameEntity {
    private String name;        // Имя NPC
    private String description; // Описание NPC
    private int damage;         // Урон, который наносит NPC

    // Конструктор для создания NPC

    public NPC(String name, String description, int damage) {
        this.name = name;
        this.description = description;
        this.damage = damage;
    }
    // Реализация метода клонирования. Создаёт новый объект NPC с теми же параметрами.
    public NPC cloneEntity() {
        ;
        return new NPC(name, description, damage);
    }
    //геттреы и сеттеры
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

    // Переопределение метода toString() для вывода информации о NPC
    @Override
    public String toString() {
        return "NPC{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", damage=" + damage +
                '}';
    }
}
