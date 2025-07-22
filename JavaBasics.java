import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class JavaBasics{

    public static void main(String[] args) {
        System.out.println("Java Data Types\n---------------");
        
        //Primitives (concrete data representations in memory)
        byte mybyteNum = 100;           
        int myintNum = 100000;          
        long mylongNum = 15000000000L;  
        float myfloatNum = 5.75f;       
        double mydoubleNum = 19.99d;    
        boolean myboolean = true;       
        char mychar = 'B';              
        
        // Non-primitives are Strings, Arrays, Classes, Interfaces, etc
        String myString = "Hello World";
        System.out.println(myString);
        
        String[] mycars = {"Volvo", "BMW", "Ford", "Mazda"}; //Array
        for (String i : mycars) {  
            System.out.println(i);
        }
        
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; //2d Array
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        
        //ArrayList Class  (import java.util.ArrayList;)
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars); //other methods like set(), remove(), clear,..
        //NOTE: the elements can only be objects (wrapper classes for primitives)
        
        //LinkedList Class (import java.util.LinkedList;)
        LinkedList<String> yourcars = new LinkedList<String>();
        yourcars.add("Volvo");
        yourcars.add("BMW");
        yourcars.add("Ford");
        yourcars.add("Mazda");
        System.out.println(yourcars);
        
        //HashMap Class (import java.util.HashMap;)
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        
        //HashSet (import java.util.HashSet;)
        HashSet<String> newcars = new HashSet<String>();
        newcars.add("Volvo");
        newcars.add("BMW");
        newcars.add("Ford");
        newcars.add("BMW");
        newcars.add("Mazda");
        System.out.println(newcars);
    }   
}