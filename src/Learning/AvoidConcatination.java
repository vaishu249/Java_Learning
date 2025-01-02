package Learning;

public class AvoidConcatination {
    int hotelCode;
    String hotelName;
    String location;

    public AvoidConcatination(int hotelCode,String hotelName,  String location) {
        this.hotelName = hotelName;
        this.hotelCode = hotelCode;
        this.location = location;
    }
    public void display(){
        System.out.println("Hotel name is "+hotelName+" Hotel Code is "+hotelCode);// instead of this type of concatination go with acess specifier
        System.out.printf("Hotel name is %s Hotel Code is %d",hotelName,hotelCode);
    }

    public static void main(String[] args) {
        AvoidConcatination a=new AvoidConcatination(1,"Kanha","Handewadi");
        a.display();
    }
}
