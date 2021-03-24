
package dslab1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFile implements FileIO{

    @Override
    public void write() {
        System.out.println("Write to text file");
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("text.txt"));
            String[] arr = {"Welcome to FSKTM!","Please register your matric number.","Please register your UMMail account."};
            for(int i = 0 ; i < arr.length ; i++){
                out.println(arr[i]);
                System.out.println(arr[i]);
            }
            out.close();
        }catch(IOException e){
        }
    }

    @Override
    public void read() {
        System.out.println("Read from text file");
        try{
            Scanner in = new Scanner(new FileInputStream("text.txt"));
            while(in.hasNextLine()){
                String str = in.nextLine();
                System.out.println(str);
            }
            in.close();
        }catch(FileNotFoundException e){
        }
    }
    
}
