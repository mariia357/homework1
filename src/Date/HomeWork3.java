package Date;

import java.sql.Timestamp;
import java.util.Date;
import java.util.GregorianCalendar;

public class HomeWork3 {

    //Спроектуйте та розробте метод, який визначає, скільки часу пройшло із заданої дати.
    //
    //За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження у зручному для сприйняття вигляді,
    // наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».

    public static void main(String[] args) {
        timeFromBirthDay();
    }

    public static void timeFromBirthDay(){
        GregorianCalendar birthDay = new GregorianCalendar(1990, 11, 12, 12, 12, 12);
        GregorianCalendar now = new GregorianCalendar();
        long time = now.getTimeInMillis() - birthDay.getTimeInMillis();
        Date date = new Date(time);
        System.out.println("Вам виповнилося " + (date.getYear()-70) + " років, " + date.getMonth() + " місяців, " + date.getDay() + " днів, " + date.getHours() + " годин, " + date.getMinutes() + " хвилин та " + date.getSeconds() + " секунд");

    }
}
