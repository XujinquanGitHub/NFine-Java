package com.nfineweb;

import com.sun.org.apache.xpath.internal.objects.XNull;
import org.hibernate.validator.internal.util.privilegedactions.LoadClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.swing.text.Utilities;
import java.sql.SQLException;

@SpringBootApplication
public class NfineWebApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(NfineWebApplication.class, args);
		// 获取当前程序的类加载器
		ClassLoader classLoader = SpringApplication.class.getClassLoader();
		ClassLoader parent = classLoader.getParent().getParent();
		Class<?> aClass = parent.loadClass("com.mysql.jdbc.Driver");
		if (aClass == null) {
			return;
		}
		if (StringUtils.isEmpty(aClass.toString())) {
			return;
		}

	}
}
