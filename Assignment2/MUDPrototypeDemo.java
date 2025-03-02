package Assignment2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Создание оригинальной комнаты (Boss Room)
        Room originalRoom = new Room("Boss Room", 15, "The Gloomy Boss Room");

        // Клонирование оригинальной комнаты
        Room clonedRoom1 = originalRoom.cloneEntity(); // Клонируем originalRoom в clonedRoom1

        // Клонирование clonedRoom1 и изменения данных
        Room clonedRoom2 = clonedRoom1.cloneEntity(); // Клонируем clonedRoom1 в clonedRoom2
        clonedRoom2.setName("Mini Boss Room"); // Переименовываем комнату
        clonedRoom2.setDescription("The dimly lit chamber where a smaller but still dangerous version of the boss awaits."); // Описание для новой комнаты
        clonedRoom2.setFloor(14); // Устанавливаем новый этаж для clonedRoom2

        // Перезаписываем clonedRoom1 с новыми данными
        clonedRoom1 = new Room("Initial Room", 0, "A large and spacious room with skeletons");

        // Выводим информацию о всех комнатах
        System.out.println("Original Room: " + originalRoom);
        System.out.println("Cloned Room 1: " + clonedRoom1); // Клонированная комната с изменениями
        System.out.println("Cloned Room 2: " + clonedRoom2); // Клонированная комната с изменениями

        // Создание оригинального NPC (DoungenBoss)
        NPC originalDoungenBoos = new DoungenBoss("Dragon", "King of dragons", 14, "fireball", 10);

        // Клонирование NPC (DoungenBoss)
        NPC clonedDoungenBoos = originalDoungenBoos.cloneEntity(); // Клонируем originalDoungenBoos в clonedDoungenBoos
        clonedDoungenBoos.setName("Inferno Dragon"); // Переименовываем NPC
        clonedDoungenBoos.setDescription("A fearsome dragon from the depths of the volcano."); // Описание для нового дракона

        // Выводим информацию о NPC
        System.out.println("Original Doungen Boss: " + originalDoungenBoos);
        System.out.println("Cloned Doungen Boss: " + clonedDoungenBoos); // Клонированный NPC с изменениями
    }
}
