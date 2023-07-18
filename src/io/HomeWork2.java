package io;

import java.io.*;

public class HomeWork2 {
    public static void main(String[] args) {
        readWriteFile();

    }

    public static void readWriteFile()  {
        File file = new File("src/io/someFile");
        try (Writer writer = new FileWriter(file)){
            writer.write("Hello world first attempt!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Reader reader = new FileReader(file)) {
         int c;
            while((c =reader.read()) != -1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
