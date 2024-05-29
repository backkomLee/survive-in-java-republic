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
		for (int i = 1; i <= 100; i++) {
			String subject = String.format("종강 언제하나요?", i);
			String content = "종강 시켜주세요";
			this.questionService.create(subject, content, null);
		}
	}
}