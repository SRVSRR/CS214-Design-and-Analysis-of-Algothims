package labs1;

public class Labs1CallerV4{
    public caller(String phoneNumber){
        this.phoneNumber = phoneNumber
    }

    @Override
    public String toString() {
        return this.phoneNumber;
    }

    public String phoneNumber;
}