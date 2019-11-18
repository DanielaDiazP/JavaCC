/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dani0
 */
public class body extends elementoSintactico {

  private List<layout> listaLayaout;

  public body(List<layout> listaLayaout) {
    this.listaLayaout = new ArrayList<>();
    this.listaLayaout = listaLayaout;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}
