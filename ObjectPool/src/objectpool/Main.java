/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpool;


public class Main{

  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    OliphauntPool pool = new OliphauntPool();
    System.out.println(pool.toString());
    Oliphaunt oliphaunt1 = pool.checkOut();
    System.out.println("Checked out"+ oliphaunt1);
    System.out.println(pool.toString());
    Oliphaunt oliphaunt2 = pool.checkOut();
    System.out.println("Checked out"+ oliphaunt2);
    Oliphaunt oliphaunt3 = pool.checkOut();
    System.out.println("Checked out"+ oliphaunt3);
    System.out.println(pool.toString());
    System.out.println("Checking in"+ oliphaunt1);
    pool.checkIn(oliphaunt1);
    System.out.println("Checking in"+ oliphaunt2);
    pool.checkIn(oliphaunt2);
    System.out.println(pool.toString());
    Oliphaunt oliphaunt4 = pool.checkOut();
    System.out.println("Checked out"+ oliphaunt4);
    Oliphaunt oliphaunt5 = pool.checkOut();
    System.out.println("Checked out"+ oliphaunt5);
    System.out.println(pool.toString());
  }
}