package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder{
    private String name;
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<NPC> npcs = new ArrayList<>();
    private ArrayList<Trap> traps = new ArrayList<>();

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
