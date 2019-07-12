/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpool;

/**
 *
 * @author Estudiante
 */

public class OliphauntPool extends ObjectPool<Oliphaunt> {

  @Override
  protected Oliphaunt create() {
    return new Oliphaunt();
  }
}