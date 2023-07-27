package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Завдання 2
//
//Створити список та заповнити рандомними числами 10 осередків,
// потрібно вивести суму квадратів усіх елементів списку.
// Ми використовуємо метод map() для зведення квадрат кожного елемента,
// а потім застосовуємо метод reduce() для згортки всіх елементів в одне число.
public class HomeWork2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        list.stream().map((x) -> x * x).reduce(Integer::sum).ifPresent(System.out::println);

    }

}
