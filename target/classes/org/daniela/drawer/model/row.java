/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import java.util.ArrayList;
import java.util.List;

import org.daniela.drawer.model.col;
import org.daniela.drawer.model.elementoSintactico;

/**
 *
 * @author dani0
 */
public class row extends elementoSintactico {

  private List<col> col;

  public row(List<col> col) {
    col = new ArrayList<>();
    this.col = col;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}
