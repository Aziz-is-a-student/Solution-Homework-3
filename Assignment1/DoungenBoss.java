package Assignment1;
public class DoungenBoss extends NPC {
    private String UltimateName;  // Имя ультимативной атаки
    private int UltimateDamage;   // Урон от ультимативной атаки

    // Конструктор для создания NPC DungeonBoss
    public DoungenBoss(String name, String description, int damage, String ultimateName, int ultimateDamage) {
        super(name, description, damage);
        UltimateName = ultimateName;
        UltimateDamage = ultimateDamage;
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
}
