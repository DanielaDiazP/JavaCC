/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import org.daniela.drawer.model.alt;
import org.daniela.drawer.model.elementoSintactico;
import org.daniela.drawer.model.src;

/**
 *
 * @author dani0
 */
public class imagen extends elementoSintactico {

  private alt alt;
  private src src;

  public imagen(alt alt, src src) {
    this.alt = alt;
    this.src = src;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}
