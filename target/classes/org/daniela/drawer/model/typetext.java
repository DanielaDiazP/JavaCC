/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import org.daniela.drawer.model.elementoSintactico;

/**
 *
 * @author dani0
 */
public class typetext extends elementoSintactico {

  private String id;
  private String values;

  public typetext(String id, String values) {
    this.id = id;
    this.values = values;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}
