package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Напишіть програму, яка виводитиме всю інформацію про клас, користувач сам вибирає, який саме клас цікавить.
public class HomeWork2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String string = new String();
        Class cl = string.getClass();
        Method[] methods = cl.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }
        System.out.println("______________________");
        Field [] fields = cl.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }

        System.out.println("______________________");
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor.getName());
        }
    }



}
