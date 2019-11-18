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
public class table extends elementoSintactico {

  private List<listaTR> listaTr;
  private String id;

  public table(List<listaTR> listaTr, String id) {
    this.listaTr = new ArrayList<>();
    this.listaTr = listaTr;
    this.id = id;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}
