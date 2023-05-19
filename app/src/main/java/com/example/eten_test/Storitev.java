/***********************************************************************
 * Module:  Storitev.java
 * Author:  adrij
 * Purpose: Defines the Class Storitev
 ***********************************************************************/
package com.example.eten_test;
import java.util.*;

/** @pdOid 6d2739f8-3b59-46b8-bdc8-d500b1c55cac */
public class Storitev {

   /** @pdOid 6d8dd827-c786-4490-b190-050764d09987 */
   private static double povprecje;
   /** @pdOid 8886fb27-2fbb-41fd-b483-2b020acc5e8a */
   private static double hitrost;

   static Map<Integer, Double> vsaNarocila = new HashMap<Integer, Double>();     // ID -> ocena

   public Storitev(double hitrost) {
      Storitev.povprecje = hitrost;
      Storitev.hitrost = hitrost;
   }

   /** @pdOid 1eb58d8e-55be-428f-a448-62b5c936c8a4 */
   static public double Ocenastoritve() {
      vsaNarocila.put(ZmStrankaOddajaOcene.testno_narocilo.st, hitrost);
      nastaviPovprecje();
      return 0;
   }
   
   /** @pdOid 77631525-d78d-49e0-a2d9-1d8edd642609 */
   public static double nastaviPovprecje() {
      double vseSkup = 0;
      for (double vrednost : vsaNarocila.values()) {
         vseSkup += vrednost;
      }
      povprecje = vseSkup / vsaNarocila.size();
      System.out.println(povprecje);
      return povprecje;
   }

   public static void setHitrost(double hitrost) {
      Storitev.hitrost = hitrost;
   }

   public static void izbrisiOceno(int id) {
      vsaNarocila.remove(id);
   }
}