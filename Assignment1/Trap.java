package Assignment1;

public class Trap {
    private String name;
    private int damage;
    private String description;

    public Trap(String name, int damage, String description) {
        this.name = name;
        this.damage = damage;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Trap{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", description='" + description + '\'' +
                '}';
    }
}

