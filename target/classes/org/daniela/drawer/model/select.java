/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import java.util.ArrayList;
import java.util.List;

import org.daniela.drawer.model.cuerpo;

/**
 *
 * @author dani0
 */
public class select {

  private String name;
  private List<cuerpo> listaCuerpo;

  public select(String name, List<cuerpo> listaCuerpo) {
    this.listaCuerpo = new ArrayList<>();
    this.name = name;
    this.listaCuerpo = listaCuerpo;
  }

}
