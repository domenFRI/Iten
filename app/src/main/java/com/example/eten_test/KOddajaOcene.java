/***********************************************************************
 * Module:  KOddajaOcene.java
 * Author:  adrij
 * Purpose: Defines the Class KOddajaOcene
 ***********************************************************************/
package com.example.eten_test;
import java.util.*;

/** @pdOid 24d28a24-c261-40af-b6d1-3a9e46b34394 */
public class KOddajaOcene {
   /** @pdOid 31893654-e7f6-45da-ac31-43bf2cb9ae6a */


   public void pricniOcenjevanje(double ocenaHrane, double ocenaStoritve) {
      Ocena ocena = new Ocena();

      ocena.pricniOcenjevanje(ocenaHrane, ocenaStoritve);
   }
   
   /** @pdOid 64af2dc3-82e5-490b-b968-ac29c57c4ca5 */
   public boolean spremeniObstojecoCeno() {
      return false;
   }
   
   /** @pdOid 3b01fd33-482d-4984-b244-a29bdb811e0a */
   public boolean zbrisiOceno(Narocilo narocilo) {

      //v objektu tega narocila nastavi na false
      Ocena ocena_izbris = new Ocena();
      ocena_izbris.zbrisiOceno(narocilo);

      return false;
   }

}