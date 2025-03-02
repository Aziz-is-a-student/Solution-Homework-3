package Assignment2;

public class DoungenBoss extends NPC implements CloneableGameEntity{
    private String UltimateName;// Имя ультимативной атаки
    private int UltimateDamage; // Урон от ультимативной атаки
    // Конструктор для создания NPC DungeonBoss
    public DoungenBoss(String name, String description, int damage, String ultimateName, int ultimateDamage) {
        super(name, description, damage);// Инициализация полей родительского класса
        UltimateName = ultimateName;
        UltimateDamage = ultimateDamage;
    }

    // Реализация метода клонирования. Создаёт новый объект DoungenBoss с теми же параметрами.
    public DoungenBoss cloneEntity() {
        return  new DoungenBoss(this.getName(), this.getDescription(), this.getDamage(), this.UltimateName, this.UltimateDamage);

    }

    //геттреы и сеттеры
    public int getUltimateDamage() {
        return UltimateDamage;
    }

    public void setUltimateDamage(int ultimateDamage) {
        UltimateDamage = ultimateDamage;
    }

    public String getUltimateName() {
        return UltimateName;
    }

    public void setUltimateName(String ultimateName) {
        UltimateName = ultimateName;
    }
    // Переопределение метода toString() для вывода информации о NPC
    @Override
    public String toString() {
        return super.toString().replace("}","")  +
                " UltimateName='" + UltimateName + '\'' +
                ", UltimateDamage=" + UltimateDamage +
                '}';
    }
}
