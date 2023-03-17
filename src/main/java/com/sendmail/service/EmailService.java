package com.sendmail.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  private JavaMailSender javaMailSender;

  @Autowired
  public EmailService(JavaMailSender javaMailSender) {
    this.javaMailSender = javaMailSender;
  }

  /*
   * public void enviarCorreo(String email, String placa, String mensaje, Long
   * idParqueadero) throws MessagingException {
   * 
   * MimeMessage mensajeFinal = javaMailSender.createMimeMessage();
   * MimeMessageHelper helper = new MimeMessageHelper(mensajeFinal, true);
   * 
   * helper.setTo(email);
   * helper.setSubject(placa);
   * helper.setText(mensaje, true);
   * 
   * javaMailSender.send(mensajeFinal);
   * }
   */
}
