package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String fileName = "vedant.txt";
//        This called try with resource so we dont need to close the file
        try( FileWriter writer = new FileWriter(fileName);){

            writer.write("Vedant Gade Patil");
            for(int i=0;i<1000;i++)
            {
                writer.write("*");
            }
            writer.flush();
            System.out.println("File Written Succesfully");

        }catch (IOException e){
            System.out.printf("Exception Occured %d",e.getMessage());
        }
    }
}
