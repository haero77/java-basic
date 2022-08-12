package MyeongPoom_Java.ch04_class_and_object.exercise.ex10;

import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        // 한글 단어 검색
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return word + "은 " + eng[i];
            }
        }

        // 한글 단어가 사전에 없는 경우
        return word + "는 저의 사전에 없습니다.";
    }
}

public class DicApp {
    Scanner sc;

    public DicApp() {
        sc = new Scanner(System.in);
    }

    public void run() {
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.print("한글 단어? ");
            String word = sc.next();

            if (word.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println(Dictionary.kor2Eng(word));
        }
    }

    public static void main(String[] args) {
        DicApp dicApp = new DicApp();
        dicApp.run();
    }
}
