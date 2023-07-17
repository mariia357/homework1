package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork2 {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
