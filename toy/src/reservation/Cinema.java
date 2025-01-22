package reservation;

import java.util.Scanner;

class Cinema {
	// 싱글톤 객체 생성
	private static Cinema cinema1;
	
	private Cinema() {
	}
	
	// 객체 생성 메서드
	public static Cinema getInstance() {
		if(cinema1 == null) {
			cinema1 = new Cinema();
		}  return cinema1;
	}
	// 멤버변수
	private String theaterName;		// 영화관 이름
	
	// getter, setter
	public String getTheater_name() {
		return theaterName;
	}

	public void setTheater_name(String theaterName) {
		this.theaterName = theaterName;
	}

	@Override
	public String toString() {
		return "[" + theaterName + "] ";
	}
	// 영화관 선택
	public void cinemaSelect(Scanner scr) {
		System.out.println("=============영화관 선택==============");
		System.out.println("[1]영화관01, [2]영화관02, [3]영화관03"); 
        System.out.print("상영하실 영화관 번호를 입력해주세요 : ");
        
        int num = scr.nextInt();
        
    	switch (num) {
	        case 1:
	            this.theaterName = "영화관01";
	            break;
	        case 2:
	            this.theaterName = "영화관02";
	            break;
	        case 3:
	            this.theaterName = "영화관03";
	            break;
	        default:
	            System.out.println("잘못된 번호입니다. 다시 선택해 주세요. : ");
	            this.theaterName = null;
	            cinema1.cinemaSelect(scr);
    	}
	}
}
	


