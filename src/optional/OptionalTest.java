package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
 Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。
 Optional 类的引入很好的解决空指针异常。
 */
public class OptionalTest {

    public static void main(String[] args) {
        OptionalTest java8Tester = new OptionalTest();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);
        System.out.println(java8Tester.sum(a,b));

        String ss = null;
        String s2 = new String("111");


        Optional<String> a1 = Optional.ofNullable(ss);
        Optional<String> a2 = Optional.of(s2);
        System.out.println(java8Tester.str(a1,a2));

        List<String> list = new ArrayList<>();
        Optional<List> list1 = Optional.ofNullable(list);
        System.out.println(list1.isPresent() );


    }


    public Integer sum(Optional<Integer> a, Optional<Integer> b){

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }

    public String str(Optional<String> s1,Optional<String> s2) {

        System.out.println("第一个字符串存在：" + s1.isPresent());
        System.out.println("第二个字符串存在：" + s2.isPresent());

        String a = s1.orElse("q");
        String b = s2.get();

        return a + b;

    }


}