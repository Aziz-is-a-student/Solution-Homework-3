package Assignment1;

public interface IDungeonBuilder {
    // Метод для задания имени подземелья.
    IDungeonBuilder setDungeonName(String dungeonName);
    // Метод для добавления комнаты в подземелье.
    IDungeonBuilder addRoom(Room room);
    // Метод для добавления NPC в подземелье
    IDungeonBuilder addNPC(NPC npc);
    // Метод для добавления ловушки в подземелье.
    IDungeonBuilder addTrap(Trap trap);
    // Метод для создания итогового объекта Dungeon.
    Dungeon build();
}
