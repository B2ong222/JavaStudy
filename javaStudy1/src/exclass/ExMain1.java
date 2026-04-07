package exclass;

public class ExMain1 {
    static void main() {
        Job1 developer = new Job1("개발자", "IT 회사");
        Person1 person1 = new Person1("홍길동", 18, developer);
        person1.introduce();
    }
}
