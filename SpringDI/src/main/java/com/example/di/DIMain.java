package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx
			= new AnnotationConfigApplicationContext(DIContainer.class);
		Greeting g1 = ctx.getBean("greeter",Greeting.class);
		System.out.println(g1);
		Greeting g2 = ctx.getBean("greeter",Greeting.class);
		System.out.println(g2);
		System.out.println(g1 == g2);
		
		MemberService service = ctx.getBean("service",MemberService.class);
		service.selectMember();
	}

}



