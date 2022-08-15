package MyeongPoom_Java.ch04_class_and_object.challenge;

import java.util.Scanner;

class Player2 {
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private String word;

    public Player2(String name) {
        this.name = name;
    }

    public String getWordFromUser() {
        System.out.print(name + ">> ");
        this.word = sc.next();
        return word;
    }

    public boolean checkSuccess(String lastWord) {
        int lastIndex = lastWord.length() - 1;
        return lastWord.charAt(lastIndex) == this.word.charAt(0);
    }

    public String getName() {
        return name;
    }
}

public class WordGameApp2 {
    private Scanner sc;
    private Player2[] players;
    private String startWord;

    public WordGameApp2() {
        sc = new Scanner(System.in);
        startWord = "아버지";
    }

    private void createPlayers() {
        System.out.print("게임에 참가하는 인원은 몇 명입니까? >>");
        int people = sc.nextInt();
        players = new Player2[people];

        // Player 인스턴스 생성
        for (int i = 0; i < people; i++) {
            System.out.print("참가자의 이름을 입력하세요 >> ");
            String name = sc.next();
            players[i] = new Player2(name);
        }
    }

    private void gameStart() {
        String lastWord = startWord;
        System.out.println("시작하는 단어는 " + startWord + " 입니다.");

        // players 배열을 순회하며 끝말 잇기 시작
        int player = 0;

        while (true) {
            String word = players[player].getWordFromUser();

            // 게임 종료 조건
            if (!players[player].checkSuccess(lastWord)) {
                System.out.println(players[player].getName() + "이 졌습니다.");
                return;
            }

            lastWord = word;
            player++; // 다음 순번
            player %= players.length; // 순번이 배열의 크기를 넘어가는 것을 방지
        }
    }

    public void run() {
        System.out.println("끝말잇기 게임을 시작합니다...");

        // Player 배열 생성
        createPlayers();

        // 게임 시작
        gameStart();

        // 게임 종료
        System.out.println("게임이 종료되었습니다...");
    }

    public static void main(String[] args) {
        WordGameApp2 game = new WordGameApp2();
        game.run();
    }
}
