package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	//HAS-A PROPERTY
	@Autowired
	private LocalDateTime ldt; 

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	//b.method
	public String generateWishMessage(String user) {
		System.out.println(ldt);
		//generate current hour
		int hour=ldt.getHour();
		//Write b.logic
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon"+user;
		else if(hour<20)
			return "Good Evening"+user;
		else
			return "Good Night"+user;
			}
}
