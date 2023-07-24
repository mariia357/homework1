package Reflection;

import testCoding.MultipleInharitanceJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class HomeWork3 {

    //Створіть клас, в ньому визначте 3 поля, до цих полів створіть конструктори та методи.
    //Використовуючи рефлексію отримайте всю інформацію про поля, методи, конструктори, а також модифікатори доступу.

    public static void main(String[] args) {
        Constructor[] constructors = Test.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + " " + constructor.getModifiers());
        }
        Field[] fields = Test.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType() + " " + field.getModifiers());
        }

        Method[] methods = Test.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getReturnType() + " " +
                    method.getParameterCount() + " " + method.getModifiers() + " " + Arrays.toString(method.getParameterTypes()));
        }

        Test test = new Test();
        Class cl = test.getClass();
        try {
            Field field = cl.getDeclaredField("name");
            System.out.println(field.get(test));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static class Test{
        private String name = "Maria";
        private int age = 25;
        private boolean isStudent = true;


        public Test(){

        }
        public Test(String name){
            this.name = name;
        }

        private Test(String name, int age, boolean isStudent){
            this.name = name;
            this.age = age;
            this.isStudent = isStudent;
        }

        private String getName(){
            return name;
        }
        private void setName(String name){
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        protected boolean isIsStudent() {
            return isStudent;
        }

        protected void setIsStudent(boolean isStudent) {
            this.isStudent = isStudent;
        }

    }
}
