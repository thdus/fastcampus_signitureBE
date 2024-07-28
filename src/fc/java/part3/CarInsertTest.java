package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로부터 입력을 받아서 DB저장을 하세요.(JDBC)
        Scanner scanner=new Scanner(System.in);
        System.out.print("자동차일년번호:");
        int carSn= scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차이름:");
        String carName= scanner.nextLine();

        System.out.print("자동차가격:");
        int carPrice= scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차소유자:");
        String carOwner= scanner.nextLine();

        System.out.print("자동차년식:");
        int carYear= scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차타입:"); // G(휘발유), D(경유)
        String carType= scanner.nextLine();

        // System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        // 자동차 데이터를 이동하기 위한 바구니가 필요하다.(DTO, VO)
        // 클래스로 CarDTO, CarVO 모델을 설계?
        // carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);\
        CarDTO car=new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
