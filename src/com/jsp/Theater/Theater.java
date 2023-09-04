package com.jsp.Theater;

public class Theater {
	private String theater_name;
	static int no_of_seats=500;
	private Ticket ticket;

	//no arg cons
	public Theater() {}
	
	//para cons
	public Theater(String theater_name) {
		this.theater_name=theater_name;
	}

	public String getTheater_name() {
		return theater_name;
	}

	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}
	
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	//methods
	public void bookTicket() {
		System.out.println("Booking In Progress");
		if(ticket.getNo_of_seats()<=Theater.no_of_seats) {
			int remaining=Theater.no_of_seats-ticket.getNo_of_seats();
			Theater.no_of_seats=remaining;
			System.out.println("Your Ticket Has Been Booked");
		}
		else {
			System.out.println("No Book Due To Technicle Issue");
			}
		}
		
	public void cancleTicket(int n) {
		System.out.println("Cancelling in progress");
		int remaining=Theater.no_of_seats+n;

		Theater.no_of_seats=remaining;
		System.out.println("Cancelled");
		System.out.println(no_of_seats+" left for booking");	
        }
	
	public void checkAvailability(int n) {
		System.out.println("The Total Available Seats Are, ");
		
	}
}








