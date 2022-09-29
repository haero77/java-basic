package jungsuk_of_java.ch14_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class UtilFunctionEx2 {
    public static void main(String[] args) {
        Supplier<Integer> getRandomNumber = () -> (int) (Math.random() * 100 + 1); // 1 ~ 100
        Consumer<Integer> printItself = i -> System.out.print(i + ", ");
        Predicate<Integer> isEvenNumber = i -> i % 2 == 0;
        Function<Integer, Integer> removeLastDigit = i -> i / 10 * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(getRandomNumber, list);
        System.out.println(list);
        printEvenNum(isEvenNumber, printItself, list);
        List<Integer> newList = doSomething(removeLastDigit, list);
        System.out.println(newList);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T> (list.size());

        for (T i : list) {
            newList.add(f.apply(i));
        }

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for (T i : list) {
            if (p.test(i)) { // isEvenNumber.test()
                c.accept(i); // printItself.accept()
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get()); // getRandomNumber.get()
        }
    }
}
