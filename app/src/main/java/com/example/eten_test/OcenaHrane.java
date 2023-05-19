/***********************************************************************
 * Module:  OcenaHrane.java
 * Author:  adrij
 * Purpose: Defines the Class OcenaHrane
 ***********************************************************************/
package com.example.eten_test;
/** @pdOid 2773fd42-b00f-4ddd-8a19-fdeb01cef7b0 */

public class OcenaHrane extends Ocena {

   /** @pdOid df2d4a7d-dc65-4c8b-be02-6d43ac5e2804 */
   private double ocena;
   private boolean jeOcenjeno = false;

   public OcenaHrane(double ocena) {
      this.ocena = ocena;
   }

   /** @pdOid befa8313-0f9a-482a-aa29-d4b9d6c99329 */
   public void Ocenihrano() {
      Hrana.setOkus(ocena);
      Hrana.Ocenahrane();
      jeOcenjeno = true;
   }
   
   /** @pdOid faa54d02-da92-422f-89e9-59596823506a */
   public boolean hranaOcenjena() {
      return jeOcenjeno;
   }


    static void zbrisiOceno1(Narocilo narocilo) {
      Hrana.izbrisiOceno(narocilo.getSt()); //iz slovarja odstrani vrednost

   }

}