package Learning;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String fileName="Example.txt";
        try(FileWriter writer=new FileWriter(fileName)){
            writer.write("Hello vaishnavi");
            for(int i=0;i<=10;i++){
                writer.write("*");
            }
            writer.flush();
            System.out.println("File get write successfully");
        }catch (IOException exception){
            System.out.println("The Exception occured "+exception.getMessage());
        }
    }
}
