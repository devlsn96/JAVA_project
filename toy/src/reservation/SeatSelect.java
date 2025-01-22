package reservation;

import java.util.Scanner;

public class SeatSelect {
		// 멤버변수
		private int selectedRow;	// 행
		private int selectedCol;	// 열
	
		public SeatSelect() {
		}
		
		// getter, setter
		public int getSelectedRow() {
			return selectedRow;
		}
		public int getSelectedCol() {
			return selectedCol;
		}
		public void setSelectedRow(int selectedRow) {
			this.selectedRow = selectedRow;
		}
		public void setSelectedCol(int selectedCol) {
			this.selectedCol = selectedCol;
		}

		@Override
		public String toString() {
			return selectedRow + " 행 " + selectedCol + " 열 좌석입니다.";
		}
		// 좌석을 배열
		public void selectSeats(Scanner scr) {
	    	String[][] seatArray = new String[3][4];
	        for (int i = 0; i < seatArray.length; i++) {
	            for (int j = 0; j < seatArray[i].length; j++) {
	                seatArray[i][j] = "[o]";
	            }
	        }
	     // 좌석 선택 
	        while (true) {
	            System.out.println("____|screen|___");
	            // 현재 좌석 상태 출력
	            for (int i = 0; i < seatArray.length; i++) {
	                for (int j = 0; j < seatArray[i].length; j++) {
	                    System.out.print(seatArray[i][j] + " ");
	                }
	                System.out.println();
	            }

	            System.out.println("===========영화관 좌석선택============");
	            System.out.println("좌석을 선택해주세요. : ");

	            System.out.print("행 번호를 입력해주세요 (1행부터 3행까지): ");
	            int row = scr.nextInt();
	            System.out.print("열 번호를 입력해주세요 (1열부터 4열까지): ");
	            int col = scr.nextInt();

	            if (row >= 1 && row <= 3 && col >= 1 && col <= 4) {
	                if (seatArray[row - 1][col - 1] == "[o]") {
	                    seatArray[row - 1][col - 1] = "[x]"; 
	                    this.selectedRow = row;
	                    this.selectedCol = col;
	                    System.out.println("좌석 선택이 완료되었습니다.");
	                    break;  
	                } else {
	                    System.out.println("이미 선택된 좌석입니다. 다른 좌석을 선택해주세요 : ");
	                }
	            } else {
	                System.out.println("올바른 좌석 번호를 다시 입력해주세요 : ");
	                row = scr.nextInt();
	                System.out.print("행 번호를 입력해주세요 (1행부터 3행까지): ");
	                col = scr.nextInt();
	                System.out.print("열 번호를 입력해주세요 (1열부터 4열까지): ");
	            }
	        }
	    }
	}