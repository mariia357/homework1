package io;

public class HomeWork3 {

    public static void main(String[] args) {
        String s = "Київ – це столиця України. Дуже велике і красиве місто. " +
                "Київ заснований більше 1500 років тому," +
                "це одне з найстаріших міст України та світу.\n" +
                "У Києві є багато цікавих місць, пам’ятників архітектури, парків, скверів, озер, річок. Найвідоміші локації – " +
                "це Майдан Незалежності, Хрещатик та Софіїївська площа, " +
                "які знаходяться у центрі столиці. Зазвичай там відбуваються великі заходи та святкування. " +
                "Тут є багато кафе та ресторанів, де можна скуштувати смачну їжу";

        String first = s.substring(0, s.length() / 2);
        String second = s.substring(s.length() / 2);
        String[] array1 = first.split("\\.");
        for (String r : array1) {
            System.out.println(r);
        }
        System.out.println("________________________________________");
        String[] array2 = second.split("\\.");
        for (String r : array2) {
            System.out.println(r);
        }
    }
}
