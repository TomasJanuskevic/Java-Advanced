package homewoks.homework2021_01_17;

import java.util.ArrayList;

public class Exeption_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        try{
            System.out.println(arrayList.get(9));
            System.out.println(arrayList.get(11));
            System.out.println(arrayList.get(1));
        } catch (IndexOutOfBoundsException e){
            System.out.println("Wrong array index");
        } finally {
            System.out.println("Finally block");
        }
    }
}
