import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Labs1CallerV2{
    int phoneNumber;
    string name, message, location;
    boolean onhold;

    // Constructor for users that answer the call
    public Labs1CallerV2(int phoneNumber){
        this.phoneNumber = phoneNumber;
        this.onhold = true;
        this.name = null;
        this.message = null;
    }

    // constructor for callers that pick up
    public Labs1CallerV2(int phoneNumber, string name, string location, string message, boolean onhold){
        this.phoneNumber = phoneNumber;
        this.onhold = false;
        this.name = name;
        this.message = message;
        this.location = location;
    }

    @Override
    public String toString(){
        return "Caller name:" + name +
                "/nPhone Number" + phoneNumber +
                "/nLocation: " + location +
                "/nMessage: " + message;
    }

}

class