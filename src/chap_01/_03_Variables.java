package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "cudo";
        int hour = 3;
        System.out.println(name +" 배송이 시작. "+ hour + "시에 방문 예정.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 "+ score + "점입니다");
        System.out.println("학점은" + grade +"입니다");

        boolean Pass = true;
        System.out.println("이번 시험에 합격 했을까요?" + Pass);

        double d = 3.1412356789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);


//      int i = 1000000000000;
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

    }

}



