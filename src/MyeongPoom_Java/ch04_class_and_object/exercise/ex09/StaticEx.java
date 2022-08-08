package MyeongPoom_Java.ch04_class_and_object.exercise.ex09;

class ArrayUtil {
    // 배열 a와 b를 연결한 새로운 배열 리턴
    public static int[] concat(int[] a, int[] b) {
        int[] concatArray = new int[a.length + b.length];

        // 배열 a를 복사
        for (int i = 0; i < a.length; i++) {
            concatArray[i] = a[i];
        }

        // a를 끝까지 복사했으면 b를 붙여서 복사
        for (int i = 0; i < b.length; i++) {
            concatArray[i + a.length] = b[i];
        }

        return concatArray;
    }

    // 배열 a 출력
    public static void print(int[] a) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }
}

public class StaticEx {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}


