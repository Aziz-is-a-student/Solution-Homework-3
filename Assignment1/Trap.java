package Assignment1;

public class Trap {
    private String name;//название ловушки
    private int damage;// урон от ловушки
    private String description;// описание действия ловушки
    //Констуктор для создания ловушки
    public Trap(String name, int damage, String description) {
        this.name = name;
        this.damage = damage;
        this.description = description;
    }
    //Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getDescription() {
        return description;
    }
    //Переопределение метода toString() для удобной проверки работаспосообности кода в дальнейшем
    @Override
    public String toString() {
        return "Trap{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", description='" + description + '\'' +
                '}';
    }
}

