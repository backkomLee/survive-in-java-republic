package com.example.javarepublic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.javarepublic.question.QuestionService;

@SpringBootTest
class JavarepublicApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 50; i++) {
			String subject = String.format("테스트", i);
			String content = "";
			this.questionService.create(subject, content, null, null);
		}
	}
}