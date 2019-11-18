/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import org.daniela.drawer.model.body;
import org.daniela.drawer.model.elementoSintactico;
import org.daniela.drawer.model.head;

/**
 *
 * @author dani0
 */
public class html extends elementoSintactico {

  private head head;
  private body body;

  public html(head head, body body) {
    this.head = head;
    this.body = body;
  }

  @Override
  public String parse() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

}