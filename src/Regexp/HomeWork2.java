package Regexp;

public class HomeWork2 {

    //Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники слово «Java».

    public static void main(String[] args) {
        String sentence = "у мене вдомв на столі в вазі стоять квіти";
        String result = sentence.replaceAll("(?<!\\S)(у|в|на)(?!\\S)", "Java ");
        System.out.println(result);
    }
}
