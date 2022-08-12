package com.collor.hello;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
//ctrl+alt+o 를 누르면


// ComponentScan Annotation 을 이용하여 class 를 scan 하여 bean으로 생서하도록 하는 지시어
// 여러개의 scan 이 필요할 경우 문자열 배열을 사용하여 주입한다
/*
* SpringBootServletInitializer 클래스
* Boot Projext 에서 root-context.xml, servlet-context 를 대신하는 클래스로서 여기에서 HelloApplication.class.main() method 를 내부에서 호출한다
* */
@ComponentScan(
		{"com.callor.hello.controller","com.callor.hello.service"}
)
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloApplication.class);
	}

}
