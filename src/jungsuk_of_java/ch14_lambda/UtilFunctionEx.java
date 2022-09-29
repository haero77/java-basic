package jungsuk_of_java.ch14_lambda;

import java.util.function.*;

public class UtilFunctionEx {
    public static void main(String[] args) {
        Predicate<String> isEmptyStr = str -> str.length() == 0;

        System.out.println(isEmptyStr.test("")); // true
        System.out.println(isEmptyStr.test("what?")); // false

        if (isEmptyStr.test("")) {
            System.out.println("Empty String");
        }

        Consumer<Integer> printAsItis = (i) -> System.out.println(i);
        printAsItis.accept(365); // 365

        Supplier<String> createStringAAA = () -> "AAA";
        System.out.println(createStringAAA.get()); // AAA

        Function<Integer, String> addStringAAA = (number) -> number + "AAA";
        System.out.println(addStringAAA.apply(365)); // 365AAA
    }
}
