import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> cofeeMenu = new ArrayList<>();

    //public Cafe(){
    //}

    public void loadMenuData(){
        File file = new File("C:\\Users\\benja\\OneDrive\\Documents\\Torsdagsopgaver\\Dat-Torsdags-opg-5\\Task 1\\Task 2\\src\\coffees.txt");

        try{

            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                cofeeMenu.add(line);
               //System.out.println(line);

            }


        }catch(FileNotFoundException e){

            System.out.println("File not found. Check path and filename");

        }
    }

    public void printMenu(){

        for(String k : cofeeMenu ){
            System.out.println(k);
        }
    }
}
