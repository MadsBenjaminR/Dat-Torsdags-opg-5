import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        Room room1 = new Room(1, 2, 3);
        Room room2 = new Room(1, 3, 1);
        Room room3 = new Room(1, 1, 5);


        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(0, 10, true, rooms);

        int i = countLampsInBuilding(building1);
        System.out.println(i);

        boolean k = isNormal(building1);
        System.out.println("This is an odd building");

    }

    public static int countLampsInBuilding(Building building) {

    int resault = 0;

    for(Room rooms : building.getRooms()){
       resault +=  rooms.getNumberOfLamps();
    }

    return resault;

    }

    public static boolean isNormal(Building building){

        if(building.getNumberOfFloors() > building.getRooms().size()){
            return true;
        } else{
            return false;
        }
    }
}
