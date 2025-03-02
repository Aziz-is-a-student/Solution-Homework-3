package Assignment2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Boss Room",15,"The Gloomy Boss Room");


        Room clonedRoom1 = originalRoom.cloneEntity();

        Room clonedRoom2= clonedRoom1.cloneEntity();
        clonedRoom2.setName("Mini Boss Room");
        clonedRoom2.setDescription("The dimly lit chamber where a smaller but still dangerous version of the boss awaits.");
        clonedRoom2.setFloor(14);


        clonedRoom1 = new Room("Initial Room",0,"A large and spacious room with skeletons");
        System.out.println("Original Room: " + originalRoom);
        System.out.println("Cloned Room: " + clonedRoom1);
        System.out.println("Cloned Room: " + clonedRoom2);


        NPC originalDoungenBoos = new DoungenBoss("Dragon","King of dragons", 14,"fireball",10);

        NPC clonedDoungenBoos = originalDoungenBoos.cloneEntity();
        clonedDoungenBoos.setName("Inferno Dragon");
        clonedDoungenBoos.setDescription("A fearsome dragon from the depths of the volcano.");

        System.out.println("Original Doungen Boos: " + originalDoungenBoos);
        System.out.println("Cloned Doungen Boos: " + clonedDoungenBoos);

    }
}
