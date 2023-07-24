package Reflection;

import java.lang.reflect.Field;

//Створіть 2 класи, Animal та Cat. У класі Animal ініціалізуйте 3 поля різних модифікаторів.
// У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
public class HomeWork4 {

    public static class Cat {
        public static void main(String[] args) throws IllegalAccessException {
            Field[] fields = Animal.class.getDeclaredFields();
            //тут ми дізнались про найменування полів
            for (Field field : fields) {
                System.out.println(field.getName());
            }
            Animal animal = new Animal();
            Class cl = animal.getClass();
            try {
                Field field = cl.getDeclaredField("age");
                field.setAccessible(true);
                System.out.println("age before : " + field.get(animal));
                System.out.println("_____________");
                field.setInt(animal, 10);
                System.out.println("age after : " + field.get(animal));
                Field field1 = cl.getDeclaredField("name");
                System.out.println("name before : " + field1.get(animal));
                System.out.println("_____________");
                field1.set(animal, "Oksana");
                System.out.println("name after : " + field1.get(animal));
                Field field2 = cl.getDeclaredField("color");
                System.out.println("colour before : " + field2.get(animal));
                System.out.println("_____________");
                field2.set(animal, "white");
                System.out.println("colour after : " + field2.get(animal));
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
