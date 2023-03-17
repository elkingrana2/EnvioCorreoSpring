package com.sendmail.controller;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.sendmail.service.*;
import org.springframework.http.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/email")
public class EmailController {

  @Autowired
  private EmailService emailService;

  private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

  @PostMapping(path = "/enviar")
  public String enviarCorreo(@RequestParam String email,
      @RequestParam String placa,
      @RequestParam String mensaje,
      @RequestParam Long idParqueadero) {

    // Loguear la información del socio y la placa
    logger.info("Socio: {}", idParqueadero);
    if (placa != null) {
      logger.info("Placa: {}", placa);
    }
    logger.info("Mensaje: {}", mensaje);

    return "{\"mensaje\": \"Correo enviado\"}";
  }
}
