package com.nfineweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class NfineWebApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(NfineWebApplication.class, args);
	}
}
