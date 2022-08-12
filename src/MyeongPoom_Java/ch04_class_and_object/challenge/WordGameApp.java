package MyeongPoom_Java.ch04_class_and_object.challenge;

import java.util.Scanner;

class Player {
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private String word;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getWord() {
        return this.word;
    }

    // 단어 입력
    public void getWordFromUser() {
        System.out.print(this.name + " >> ");
        this.word = sc.next();
    }

    // 이전 순번 player의 단어 중 마지막 글자와 현재 player의 단어를 비교하여 끝말잇기 성공여부 반환
    public boolean checkSuccess(Player prevPlayer) {
        String prevWord = prevPlayer.getWord();

        // 게임 중 가장 처음 단어를 입력 받은 경우는 성공여부를 검사하지 않는다.
        if (prevWord == null) {
            return true;
        }
        
        char prevLastChar = prevWord.charAt(prevWord.length() - 1);
        char currentFirstChar = this.word.charAt(0);

        return prevLastChar == currentFirstChar;
    }
}

public class WordGameApp {
    static Scanner sc = new Scanner(System.in);
    private Player[] players;
    private int playerCount;

    public void run() {
        System.out.println("끝말잇기 게임을 시작합니다...");
        // 참가자 생성
        createPlayers();

        // 게임 시작
        startGame();

        System.out.println("게임이 종료되었습니다...");
    }

    // 참가자 수를 입력하고, 참가자 배열에 할당
    public void createPlayers() {
        System.out.print("게임에 참가하는 인원은 몇 명입니까? >>");
        playerCount = sc.nextInt();
        players = new Player[playerCount];

        // player객체를 생성하여 players[]에 할당
        for (int i = 0; i < playerCount; i++) {
            System.out.print("참가자의 이름을 입력하세요. >>");
            String name = sc.next();
            players[i] = new Player(name);
        }
    }

    public void startGame() {
        int currentPlayerTurn = 0;

        while (true) {
            // 단어 입력
            players[currentPlayerTurn].getWordFromUser();

            // 성공 여부 검사
            int prevPlayerTurn = getPrevPlayerTurn(currentPlayerTurn);
            boolean isSuccess = players[currentPlayerTurn].checkSuccess(players[prevPlayerTurn]);

            if (!isSuccess) {
                System.out.println(players[currentPlayerTurn].getName() + "이 졌습니다.");
                return;
            }

            // 다음 player에게로 순번 넘어가기
            currentPlayerTurn++;
            if (currentPlayerTurn == playerCount) {
                currentPlayerTurn = 0;
            }
        }
    }

    public int getPrevPlayerTurn(int currentPlayerTurn) {
        if (currentPlayerTurn == 0) {
            return playerCount - 1;
        }

        return currentPlayerTurn - 1;
    }

    public static void main(String[] args) {
        WordGameApp wordGameApp = new WordGameApp();
        wordGameApp.run();
    }
}
