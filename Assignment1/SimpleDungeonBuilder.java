package Assignment1;

import java.util.ArrayList;
import java.util.List;
//Создание простого подземелья для примера
public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;               // Название подземелья
    private ArrayList<Room> rooms = new ArrayList<>();    // Список комнат
    private ArrayList<NPC> npcs = new ArrayList<>();      // Список NPC
    private ArrayList<Trap> traps = new ArrayList<>();    // Список ловушек

    //Создание подземелья используя паттерн builder
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }
    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }
    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    @Override
    public IDungeonBuilder addTrap(Trap trap) {
        traps.add(trap);
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name,rooms,npcs,traps);
    }
}
