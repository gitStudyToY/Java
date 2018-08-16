package method;


/**************
 * compare to () 进行的时ASCII码值的比较，而不是数字的比较，切记！！！！！
 */
public class CompareTo {


    public static void main(String[] args) {

        /**
         * java中的compareto方法，比较的是前后两个字符串的asc码的差值
         * 如果指定的数与参数相等返回0。
         * 如果指定的数小于参数返回 -1。
         * 如果指定的数大于参数返回 1。
         */
        System.out.println("************单个字符串************");

        String a = "a";

        String b = "b";

        String c = "a";

        System.out.println(a.compareTo(b));

        System.out.println(a.compareTo(c));

        System.out.println(b.compareTo(a));

        /**对于长字符串来说，
         * 如果两个字符串首字母不同，则该方法返回首字母的asc码的差值
         * 反之，参与比较的两个字符串如果首字符相同，则比较下一个字符，直到有不同的为止，返回该不同的字符的asc码差值，如果两个字符串不一样长，可以参与比较的字符又完全一样，则返回两个字符串的长度差值
         */
        System.out.println("*********长字符串***************");

        System.out.println("************首字母不同*************");

        String ab = "ab";

        String ba = "ba";

        System.out.println(ab.compareTo(ba));

        System.out.println("*****************首字母相同************");

        String abcdef = "abcdef";

        String abcfegro = "abceegro";

        System.out.println(abcdef.compareTo(abcfegro));

        /**
         * 数字想要使用compare to（），必须先转换为字符串才可以
         */
        System.out.println("**********数字字符串的compare to 方法*************");

        int a1 = 23;

        int a2 = 2332;

        System.out.println(String.valueOf(a1).compareTo(String.valueOf(a2)));


    }


}
