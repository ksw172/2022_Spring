package com.student.di;
import java.rmi.StubNotFoundException;

import org.springframework.context.annotation.Bean;

import com.student.config.DBManager;
import com.student.controller.HandlerMapping;
import com.student.dao.StudentDAO;
import com.student.service.StudentService;

public class DIContainer {
	@Bean
	public HandlerMapping handler() {
		return new HandlerMapping();
	}
	@Bean
	public DBManager dbmanager() {
		return new DBManager();
	}
	@Bean
	public StudentService service() {
		return new StudentService();
	}
	@Bean
	public StudentDAO dao() {
		return new StudentDAO();
	}
}








