package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class DependencyManagementTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
//get target class
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String result=generator.generateWishMessage ("raja");
		System.out.println("Output::"+result);
		// close ioc conmtainer
		ctx.close();
		
	}

}
