package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // Q. 한 사람의 [회원] 정보를 저장할 [객체를 생성]하세요.
        PersonVO vo=new PersonVO();
        vo.setName("홍길동");
        vo.setAge(30);
        vo.setPhone("010-2222-2222");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+ vo.getPhone());
        // vo.name="홍길동";
        //vo.age=50; // 정보은닉이 되지 않음
        //vo.phone="010-1111-1111";

        //System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone);
    }
}
