package reservation;

import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	    	Scanner scr = new Scanner(System.in);
	        // 회원정보입력  
	        UserLogin ul = UserLogin.getInstance();
	        ul.loginGuide(scr);
	        
	        // 영화관 선택
	        Cinema c = Cinema.getInstance();
	        c.cinemaSelect(scr);
	        
			// 영화관 좌석 선택
	        SeatSelect s = new SeatSelect();
	        s.selectSeats(scr);
	        
	        // 최종 예매확인
	        System.out.println("==========================");
	        System.out.println("예매가 완료되었습니다.");
	        System.out.println(ul.toString());
	        System.out.print(c.toString());
	        System.out.println(s.toString());
	        System.out.println("즐거운 관람시간 되세요");
	        scr.close();
	    }
	}
