public class Room {

    private int numberOfDoors;
    private int numberOfWindows;
    private int numberOfLamps;

    public Room(int numberOfDoors, int numberOfWindows, int numberOfLamps){
    this.numberOfDoors=numberOfDoors;
    this.numberOfWindows=numberOfWindows;
    this.numberOfLamps=numberOfLamps;

    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;

    }
    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }

    public int getNumberOfLamps() {
        return this.numberOfLamps;
    }
}
