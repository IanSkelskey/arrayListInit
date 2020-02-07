//CLASS: H01_31
//AUTHOR: Ian Skelskey, iskelske, ianskelskey@gmail.com

package h01_31;

import java.util.*;

public class H01_31 {

    //Initializes an integer array list [0,1,2,3,4,0,1,2,3,4]
    public static ArrayList<Integer> arrayListInit() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                list.add(j);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> someList = new ArrayList<Integer>();
        someList = arrayListInit();
        System.out.print(someList);
    }
}
