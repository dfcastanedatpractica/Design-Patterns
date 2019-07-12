/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * Oliphaunts are expensive to create
 *
 */
public class Oliphaunt {

  private static AtomicInteger counter = new AtomicInteger(0);

  private final int id;

  /**
   * Constructor
   */
  public Oliphaunt() {
    id = counter.incrementAndGet();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return String.format("Oliphaunt id=%d", id);
  }
}
