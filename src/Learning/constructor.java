package Learning;

public class constructor {
    String color;
    String name;
    int id;

    constructor(){
        color="blue";
        name="cat";
        id=1;
    }
    public void printData(){
        System.out.println("id : "+id);
        System.out.println("Color : "+color);
        System.out.println("Name : "+name);
    }

    public static void main(String[] args) {
        constructor c=new constructor();
        c.printData();
    }
}
