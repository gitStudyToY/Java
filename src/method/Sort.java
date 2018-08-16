package method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

    public static void main(String[] args) {


        /**
         * Collections.sort(param)
         * 一个参数时，使用该方法进行排序
         */
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(50);

        numbers.add(1);

        numbers.add(2);

        numbers.add(5);

        numbers.add(6);

        //升序   s1 compareTO s2
        Collections.sort(numbers);

        /**
         * 两个参数时，Collections.sort(param，param)
         * 注意：两个参数时，第二个参数的类型为int型
         */
        //降序 s2 compareTo s1
        Collections.sort(numbers,(s1,s2) -> String.valueOf(s2).compareTo(String.valueOf(s1)));

        System.out.println(numbers);




    }

}
