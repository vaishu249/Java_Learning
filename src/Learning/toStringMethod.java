package Learning;

public class toStringMethod {
    int hotelCode;
    String hotelName;
    String location;

    public toStringMethod(int hotelCode,String hotelName,  String location) {
        this.hotelName = hotelName;
        this.hotelCode = hotelCode;
        this.location = location;
    }

    @Override
    public String toString() {
        return "My Hotel Name is : "+hotelName;
    }

    public static void main(String[] args) {
        toStringMethod hotel=new toStringMethod(1,"Kanha","Katraj");
        System.out.println(hotel.toString());
    }
}
