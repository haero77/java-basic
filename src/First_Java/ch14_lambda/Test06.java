package First_Java.ch14_lambda;

@FunctionalInterface
interface MyFunc<T> {
    T modify(T t);
}

public class Test06 {
    public static void main(String[] args) {
        MyFunc<String> mf1 = (String str) -> str + "test";

        System.out.println(mf1.modify("Hi"));
    }
}
