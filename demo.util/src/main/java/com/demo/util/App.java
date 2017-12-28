package com.demo.util;

// import com.demo.util.Child;
import com.demo.util.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{    
    public static void main( String[] args )
    {
        // diamondPlus();
        // Child childname = new Child("陆林");
        // System.out.print(childname.getName() + new Child().getName());
        // Student student = new Student();
        // student.setName("老王");
        // student.setAge(16);
        // student.setGrade("高一");
        // student.setClassNum("21班");
        // System.out.println(student.toString());
        // student.test();
        // Test01 test01 = new Test01Impl();
        // test01.eat();
        // test01.dream();

        // Test02 test001 = new Test01Impl();
        // test001.sleep();
        // test001.running();

        // Test01 test02 = new Test02Impl();
        // test02.eat();
        // test02.dream();

        // System.out.println(sum2());

        DBUtils.getConnection();
    }

    public static int sum2() {
        List<Integer> listnum = Arrays.asList(1, 2, 3, 4, 5);
        return listnum.stream()
            .filter(item -> item > 4)
            .map(item -> item + 2)
            .reduce(0, (sum, item) -> sum + item);
    }

    public static int sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOdd() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%2 != 0) continue;
            sum += i;
        }
        return sum;
    }

    public static void multiplicationFormulas() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }

    public static void diamond() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondPlus() {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if ((i + j >= 3 && i + j <= 9) && (i - j >= -3 && i - j <= 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
