package com.cong.springboot.task;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    JavaMailSenderImpl javaMailSender;
    public void sendEmail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("通知");
        message.setText("学习spring boot.");
        message.setFrom("1292480579@qq.com");
        message.setTo("xiuc_shi@163.com");
        javaMailSender.send(message);
    }
}
