package fc.java.model;

public class MemberDTO {
        public String name;
        private int age;
        public String phone;
        public void play(){
                System.out.println("운동을 한다.");
        }
        public void eat(){
                System.out.println("음식을 먹다.");
        }
        public void walk(){
                System.out.println("걷다.");
        }

}
