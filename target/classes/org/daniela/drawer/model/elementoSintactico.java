/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daniela.drawer.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.TreeNode;

/**
 *
 * @author dani0
 */
public abstract class elementoSintactico implements TreeNode {

  private List<elementoSintactico> hijos = new ArrayList<>();

  public void addHijo(elementoSintactico hijo) {

    hijos.add(hijo);
  }

  public abstract String parse();

  @Override
  public TreeNode getChildAt(int childIndex) {
    return hijos.get(childIndex);
  }

  @Override
  public int getChildCount() {
    return hijos.size();
  }

  @Override
  public TreeNode getParent() {
    return this;
  }

  @Override
  public int getIndex(TreeNode node) {
    return 0;
  }

  @Override
  public boolean getAllowsChildren() {
    return true;
  }

  @Override
  public boolean isLeaf() {
    return hijos.isEmpty();
  }

  @Override
  public Enumeration children() {
    return Collections.enumeration(hijos);
  }

}
