package MyeongPoom_Java.ch04_class_and_object.exercise.ex07;

// 실습 7번 - 한 달의 할 일 표현
class Day {
    private String work;

    public void set(String work) {
        this.work = work;
    }

    public String get() {
        return work;
    }

    public void show() {
        if (work == null) {
            System.out.println("할 일이 없습니다.");
        } else {
            System.out.println(work + "입니다. ");
        }
    }
}
