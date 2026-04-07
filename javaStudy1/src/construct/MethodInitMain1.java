package construct;

public class MethodInitMain1 {
     static void main() {
        MemberInit1 member1 = new MemberInit1();
        member1.setName("user1");
        member1.setAge(15);
        member1.setGrade(90);

        MemberInit1 member2 = new MemberInit1();
        member2.setName("user2");
        member2.setAge(16);
        member2.setGrade(80);

        MemberInit1[] members = {member1, member2};
        for (MemberInit1 s : members) {
            System.out.println("이름:" + s.getName() + " 나이:" + s.getAge() + " 성적:" + s.getGrade());
        }
    }
}