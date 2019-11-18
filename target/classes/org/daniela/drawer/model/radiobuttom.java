/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import java.util.ArrayList;
import java.util.List;

import org.daniela.drawer.model.elementoSintactico;
import org.daniela.drawer.model.radio;

/**
 *
 * @author dani0
 */
public class radiobuttom extends elementoSintactico {

  private List<radio> listaRadios;

  public radiobuttom(List<radio> listaRadios) {
    this.listaRadios = new ArrayList<>();
    this.listaRadios = listaRadios;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}
