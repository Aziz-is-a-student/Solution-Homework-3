package Assignment2;

public class DoungenBoss extends NPC implements CloneableGameEntity{
    private String UltimateName;
    private int UltimateDamage;

    public DoungenBoss(String name, String description, int damage, String ultimateName, int ultimateDamage) {
        super(name, description, damage);
        UltimateName = ultimateName;
        UltimateDamage = ultimateDamage;
    }
    public DoungenBoss cloneEntity() {
        return  new DoungenBoss(this.getName(), this.getDescription(), this.getDamage(), this.UltimateName, this.UltimateDamage);

    }


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

    @Override
    public String toString() {
        return super.toString().replace("}","")  +
                " UltimateName='" + UltimateName + '\'' +
                ", UltimateDamage=" + UltimateDamage +
                '}';
    }
}
