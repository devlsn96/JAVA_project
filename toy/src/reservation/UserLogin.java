package reservation;

import java.util.Scanner;
import java.util.regex.Pattern;

// 회원등록 클래스
class UserLogin {
	// 싱글톤 객체생성 -> 고정 데이터영역으로 클래스 안에 간접적으로 생성 
	private static UserLogin user; 
	
	private UserLogin() {
	}
	
	// 객체 생성 메서드
	public static UserLogin getInstance() {
		if(user == null) {
			user = new UserLogin();
		}  return user;
	}
	
    // 멤버변수 
	private String username;			// 회원이름
	private String phoneNum;			// 전화번호 

    // getter, setter
	public String getUsername() {
		return username;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return  username + "( 등록된 번호 : " + phoneNum + " ) 고객님께서 예매하신 내역은 ";
	}
	
	// 회원입력 절차
	public void loginGuide(Scanner scr) {
		// 프로그램을 시작합니다. 
    	System.out.println("=======영화예매 시스템을 실행합니다.========"); 
        System.out.println(); 
        
        System.out.println("=============회원정보입력=============="); 
        while (true) {
            System.out.print("이름 입력 (한글로만 입력해주세요) : ");
            String str1 = scr.next();
            boolean isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str1);
            if (!isKor) {
                System.out.println("한글로만 입력해주세요");
                user.loginGuide(scr);
            } else {
                this.username = str1;
                break;
            }
        }
        while (true) {
            System.out.print("전화번호 ( - 없이 입력해 주세요) : ");
            String str2 = scr.next();
            boolean isNum = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str2);
            if (!isNum) {
                System.out.println("- 없이 입력해 주세요");
                user.loginGuide(scr);
            } else {
                this.phoneNum = str2;
                System.out.println("회원등록이 완료되었습니다!");
                break;
            }
        }
	} 
}