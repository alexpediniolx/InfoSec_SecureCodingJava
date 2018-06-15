package com.ticketmagpie.infrastructure.security;

import static java.lang.String.format;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ticketmagpie.User;
import com.ticketmagpie.infrastructure.MailService;

@Component
public class ForgotPasswordService {
  @Autowired
  private MailService mailService;

  public void userForgotPassword(User user) {
    mailService.sendEmail(
        user.getEmail(),
        "Your Ticketmagpie password is...",
        format(
            "Hello %s! Have you lost your password? Screw you! :P",
            user.getUsername()));
  }
}
