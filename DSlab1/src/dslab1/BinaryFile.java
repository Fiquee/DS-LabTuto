package dslab1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinaryFile implements FileIO {

    @Override
    public void write() {
        System.out.println("Write to binary file");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("text.bin"));
            String[] arr = {"Welcome to FSKTM!", "Please register your matric number.", "Please register your UMMail account."};
            for (int i = 0; i < arr.length; i++) {
                out.writeUTF(arr[i] + "\n");
                System.out.println(arr[i]);
            }
            out.close();
        } catch (IOException e) {

        }
    }

    @Override
    public void read() {
        int line = 0;
        System.out.println("Read from binary file");
        try {
            try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("text.bin"));
            while(true){
                System.out.print(in.readUTF());
            }
            }catch(EOFException e){
                
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }

    }

}
