/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

/**
 *
 * @author dani0
 */
public class cuerpo extends elementoSintactico {

  private String value;
  private String identificador;

  public cuerpo(String value, String identificador) {
    this.value = value;
    this.identificador = identificador;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}
