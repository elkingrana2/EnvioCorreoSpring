package com.sendmail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorreoDTO {

  private String email;
  private String mensaje;
  private String placa;
  private Long idParqueadero;

}
