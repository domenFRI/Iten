/***********************************************************************
 * Module:  Hrana.java
 * Author:  adrij
 * Purpose: Defines the Class Hrana
 ***********************************************************************/
package com.example.eten_test;
import java.util.*;

/** @pdOid 70b79d68-fcca-4be2-bdb2-26dcc917adf3 */
public class Hrana {
   /** @pdOid f3703cc2-ee1c-4a07-b42f-d45215ea4339 */
   private static double povprecje;
   /** @pdOid b1c5aa03-ec37-4764-97bc-91df3b904c9f */
   private static double okus;
   /** @pdOid 075aca39-70ed-49c5-aa99-54edbbee729b */

   static Map<Integer, Double> vsaNarocila = new HashMap<Integer, Double>();     // ID -> ocena

   public Hrana(double okus) {
      this.povprecje = okus;     //začetno povprečje
      Hrana.okus = okus;

   }

   /** @pdOid d617e35a-d780-4bc2-bda2-ea5355229083 */
   public static double Ocenahrane() {

      vsaNarocila.put(ZmStrankaOddajaOcene.testno_narocilo.st, okus);
      nastaviPovprecje();
      ZmStrankaOddajaOcene.testno_narocilo.setJeOddana(true);
      return 0;
   }
   
   /** @pdOid 08c22c85-c4bc-44dd-b050-072aae824b4c */
   public static double nastaviPovprecje() {

      double vseSkup = 0;
      for (double vrednost : vsaNarocila.values()) {
         vseSkup += vrednost;
      }
      povprecje = vseSkup / vsaNarocila.size();
      System.out.println(povprecje);

      return povprecje;
   }


   public static void setOkus(double okus) {
      Hrana.okus = okus;
   }

   public static void izbrisiOceno(int id) {
      vsaNarocila.remove(id);
   }
}