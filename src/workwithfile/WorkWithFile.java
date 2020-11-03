package workwithfile;

import java.io.*;
import java.util.Arrays;

public class WorkWithFile {

    public static void main(String[] args) throws IOException {

        System.out.println(Arrays.asList(args));

        FileOutputStream fos = new FileOutputStream("xxx.txt");

        fos.write("Hello World!\n".getBytes("UTF-8"));
        fos.write("Hello World!".getBytes("UTF-8"));

        fos.close();

        FileInputStream fis = new FileInputStream("xxx.txt");

//        Reader reader = new InputStreamReader(fis);

//        char[] chars = new char[20];
//        reader.read(chars);
//        String s = new String(chars);

        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

        System.out.println(reader.readLine());

    }
}
