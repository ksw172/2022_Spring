package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx
			= new AnnotationConfigApplicationContext(DIContainer.class);
		Greeting g1 = ctx.getBean("greeter",Greeting.class);
		System.out.println(g1);
	}

}
