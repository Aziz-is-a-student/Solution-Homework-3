package Assignment1;


import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;               // Название подземелья
    private ArrayList<Room> rooms;     // Список комнат подземелья
    private ArrayList<NPC> npcs;       // Список NPC в подземелье
    private ArrayList<Trap> traps;     // Список ловушек в подземелье

    // Конструктор для создания подземелья
    public Dungeon(String name, ArrayList<Room> rooms, ArrayList<NPC> npcs, ArrayList<Trap> traps) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
        this.traps = traps;
    }
    //геттреы и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<NPC> getNpcs() {
        return npcs;
    }

    public void setNpcs(ArrayList<NPC> npcs) {
        this.npcs = npcs;
    }

    public ArrayList<Trap> getTraps() {
        return traps;
    }

    public void setTraps(ArrayList<Trap> traps) {
        this.traps = traps;
    }
    //Переопределение метода toString() для удобной проверки работаспосообности кода в дальнейшем
    @Override
    public String toString() {
        return "Dungeon{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                ", npcs=" + npcs +
                ", traps=" + traps +
                '}';
    }
}
