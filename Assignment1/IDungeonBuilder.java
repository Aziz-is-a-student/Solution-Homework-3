package Assignment1;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String dungeonName);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder addTrap(Trap trap);

    Dungeon build();
}
