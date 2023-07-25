package Serialization;

import Reflection.Animal;

import java.io.*;

//Необхідно здійснити десеріалізацію з файлу попереднього проекту (Animal) та вивести на екран вміст.
public class HomeWork2 {
public static void main(String[] args) {

    File file = new File("src/Serialization/output.txt");
    Animal animal = new Animal();
    System.out.println(file.exists());

    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){

        objectOutputStream.writeObject(animal);
        animal = (Animal) objectInputStream.readObject();
        System.out.println(animal);

    } catch (IOException |ClassNotFoundException e) {
        throw new RuntimeException(e);
    }

}



}
