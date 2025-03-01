package Assignment1;

public class MUDBuilderDemo {
    public static void main(String[] args) {

        Dungeon dungeon = new SimpleDungeonBuilder().setDungeonName("Doungen of Dragon").
                addRoom(new Room("Treasury","A room with a treasure chest"))
                .addNPC(new DoungenBoss("Dragon","Boss of This Doungen",25,"Fireball", 15))
                .addTrap(new Trap("arrows",5,"Arrows fly out of the walls"))
                .build();
        System.out.println(dungeon);
    }
}
