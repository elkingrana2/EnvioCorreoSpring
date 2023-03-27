package com.sendmail.controller;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import com.sendmail.dto.CorreoDTO;
import com.sendmail.response.MensajeResponse;
import com.sendmail.service.*;
import org.springframework.http.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1/correo")
public class EmailController {

  @Autowired
  private EmailService emailService;

  private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

  @PostMapping()
  @ResponseStatus(HttpStatus.OK)
  public MensajeResponse enviarCorreo(@RequestBody CorreoDTO correoDTO) {

    // Loguear la información del socio y la placa
    logger.info("Socio: {}", correoDTO.getIdParqueadero());
    if (correoDTO.getPlaca() != null) {
      logger.info("Placa: {}", correoDTO.getPlaca());
    }
    logger.info("Mensaje: {}", correoDTO.getMensaje());

    return new MensajeResponse("Correo enviado");
  }
}
