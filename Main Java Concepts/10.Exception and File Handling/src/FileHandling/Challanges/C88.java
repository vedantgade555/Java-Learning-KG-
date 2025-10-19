package FileHandling.Challanges;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class C88 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter File name");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName))
        {
            int read;
            while((read=reader.read())!=-1)
            {
                System.out.print((char)read);
            }
        }catch (FileNotFoundException e){
            System.out.printf(" %s File not found",fileName);
        }
        catch(IOException e){
            System.out.printf("Exception Occur %s",e.getMessage());
        }
    }
}
