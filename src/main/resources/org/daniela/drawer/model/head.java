/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import org.daniela.drawer.model.elementoSintactico;
import org.daniela.drawer.model.tamano;
import org.daniela.drawer.model.titulo;

/**
 *
 * @author dani0
 */
public class head extends elementoSintactico {

  private tamano tamano;
  private titulo titulo;

  public head(tamano tamano, titulo titulo) {
    this.tamano = tamano;
    this.titulo = titulo;
  }

  public head(titulo titulo) {
    this.titulo = titulo;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}
