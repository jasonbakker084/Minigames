/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.minigames;

/**
 *
 * @author jasonbakker
 */
public class Field {
    
     private char value;
     private char defaultValue;
     private int location;
  
  public Field(int location) {
    this.location = location;
    this.defaultValue = this.value = (char)('0' +location);
  }
  
  public Field(int location, char defaultValue) {
    this.location = location;
    this.defaultValue = this.value = defaultValue;
  }

  
  public char getValue() { return this.value; }

  
  public boolean setValue(String playerPawn) {
    if (isSet()) return false; 
    playerPawn = this.value + "";
    return true;
  }

  
  public boolean isSet() { return (this.value != this.defaultValue); }


  
  public String toString() { return this.value + ""; }
}
