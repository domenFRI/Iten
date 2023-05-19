/***********************************************************************
 * Module:  Ocena.java
 * Author:  adrij
 * Purpose: Defines the Class Ocena
 ***********************************************************************/
package com.example.eten_test;
/** @pdOid 48a288a9-1c43-41c6-ac2f-38d753aea018 */
public class Ocena {


   /** @pdOid 155b1a13-7cfc-4af7-81ab-eec041843ce4 */
   public void pricniOcenjevanje(double ocenaHrane, double ocenaStoritve){

      // razdeli v eno za hrano i tadrugo za storitev
      if (vrniObstojOcene()) {
         //dalje
         OcenaHrane ocHr = new OcenaHrane(ocenaHrane);
         ocHr.Ocenihrano();
         OcenaStoritve ocSt = new OcenaStoritve(ocenaStoritve);
         ocSt.Ocenistoritev();
         boolean mamoOceno = true;


      } else {    //obvestilo ocena že oddana
         ZmStrankaOddajaOcene.prikaziOcenaZeObstaja();
      }

   }
   
   /** @pdOid e4fd42a2-17d7-4d79-b3ed-6aea3a459913 */
   public boolean vrniObstojOcene() {
      return !ZmStrankaOddajaOcene.testno_narocilo.preveriCeOcenaObstaja(); //!!
   }
   
   /** @pdOid 94c6a412-490c-4f45-bfe9-c97d0757f9f1 */
   public boolean hranaOcenjena() {
      return false;
   }
   
   /** @pdOid 505d4d4d-3515-4f82-97d3-12824fadd58e */
   public boolean storitevOcenjena() {
      return false;
   }
   
   /**
    * @pdOid 09b5dca4-432e-4339-8ba0-ce367ca2f93c
    */
   public static void  zbrisiOceno(Narocilo narocilo) {

      OcenaHrane.zbrisiOceno1(narocilo);
      OcenaStoritve.zbrisiOceno1(narocilo);

   }

}