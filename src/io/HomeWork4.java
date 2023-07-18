package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HomeWork4 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/io/someFile");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)){
            bufferedWriter.write("Hello world second attempt!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            while (bufferedReader.ready()){
                System.out.print((char)bufferedReader.read());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
