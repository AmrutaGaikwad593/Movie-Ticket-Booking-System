package com.jsp.Theater;

import java.util.Scanner;

public class BoxOffice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Theater theater=new Theater("INOX");
		
		boolean flag=true;
		while(flag) {
		System.out.println("Press 1-Book_Ticket,2-Check_Availability,3-Show_Ticket_Details,4-Cancle_Ticket,5-Exit");
		int n=sc.nextInt();
		switch(n) {
		case 1:{
			System.out.println("Enter The Movie Name");
			String mname=sc.next();
			
			System.out.println("Enter The Number Of Seats");
			int seat=sc.nextInt();
			theater.setTicket(new Ticket(mname, seat));
			theater.bookTicket();
			
		}
		break;
		
		case 2:{
			System.out.println("Check Availability of Seats");
			theater.checkAvailability(n);
			
		}
		break;
		
		case 3:{
			System.out.println("Ticket_Details");
		}
		break;
		
		case 4:{
			System.out.println("Cancle Ticket");
			System.out.println("Your booking has "+theater.getTicket().getNo_of_seats()+ " bookings");
			System.out.println("Enter Number Of Tickets To Cancel");
			int cancle=sc.nextInt();
			if(cancle<=theater.getTicket().getNo_of_seats()) {
                theater.cancleTicket(cancle);
            }else {
           	 System.out.println("Could not cancel your bookings");
            }
		}
		break; 

		case 5:{
			System.out.println("Exit");
			flag=false;
		}
	
		default:{
			System.out.println("worng choice");
		}
		}
	}
	}
}
