package com.mtzz.ms.controller;

import com.mtzz.ms.models.Email;
import com.mtzz.ms.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("email/api")
public class EmailController
{

    @Autowired
    private EmailService emailService;


    @PostMapping
    public void sendEmail(@RequestBody Email email) throws MessagingException
    {
        emailService.sendEmail(email);
    }
}
