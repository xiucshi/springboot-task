package com.cong.springboot;

import com.cong.springboot.task.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTaskApplicationTests {
	@Autowired
	EmailService emailService;
	@Autowired
	JavaMailSenderImpl javaMailSender;
	@Test
	public void contextLoads() {
		emailService.sendEmail();
	}
	//复杂邮件发送
	@Test
	public void test() throws Exception{
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setSubject("带附件的邮箱发送");
		helper.setText("sprintboot发送邮箱附件");
		helper.setFrom("1292480579@qq.com");
		helper.setTo("xiuc_shi@163.com");
		helper.addAttachment("application.properties",new File("E:\\JavaFile\\springboot-task\\src\\main\\resources\\application.properties"));
		javaMailSender.send(message);
	}


}
