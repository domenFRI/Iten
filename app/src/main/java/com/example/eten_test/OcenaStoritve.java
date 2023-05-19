/***********************************************************************
 * Module:  OcenaStoritve.java
 * Author:  adrij
 * Purpose: Defines the Class OcenaStoritve
 ***********************************************************************/
package com.example.eten_test;
import java.util.*;

/** @pdOid 9575b55c-9014-426b-849f-7a8589382e57 */
public class OcenaStoritve extends Ocena {
   /** @pdOid 698a7795-14ab-460b-8a59-389c45a317b2 */
   private double ocena;
   private boolean jeOcenjeno = false;

   public OcenaStoritve(double ocena) {
      this.ocena = ocena;
   }

   /** @pdOid e94c98d7-09e3-414c-a8f2-03a28d871db3 */
   public void Ocenistoritev() {

      Storitev.setHitrost(ocena);
      Storitev.Ocenastoritve();
      jeOcenjeno = true;
   }
   
   /** @pdOid b0038733-26c3-4a82-9e71-0c079ddfb123 */
   public boolean storitevOcenjena() {
      return jeOcenjeno;
   }

   static void zbrisiOceno1(Narocilo narocilo) {

      Storitev.izbrisiOceno(narocilo.getSt()); //iz slovarja odstrani vrednost
      narocilo.zbrisiOceno(); //boolean nastavi na false

   }

}