/***********************************************************************
 * Module:  Narocilo.java
 * Author:  adrij
 * Purpose: Defines the Class Narocilo
 ***********************************************************************/
package com.example.eten_test;
import java.util.*;

/** @pdOid f4ecf703-9641-4c40-8dfc-513e0c33a7a2 */
public class Narocilo {
   /** @pdOid 5d959b2b-c571-49b0-ab85-ddfc1dbbb8cc */
   public int st;
   /** @pdOid 3d94bba1-72d6-48f2-8ef0-29e36cccdd28 */
   private int strankaID;
   /** @pdOid 8e4000ef-49fd-423a-82d9-1f12e31a3715 */
   private boolean jeOddana;
   
   /** @pdOid a8e32a1a-02ce-4168-a387-c43260a3e838 */
   public boolean preveriCeOcenaObstaja() {
      return jeOddana;
   }
   
   /** @pdOid 75ac171e-9fbb-40f8-bc63-a2116b0a7c99 */
   public boolean zbrisiOceno() {

      this.jeOddana = false;
      return false;
   }

   public Narocilo(int st, int strankaID, boolean jeOddana) {
      this.st = st;
      this.strankaID = strankaID;
      this.jeOddana = jeOddana;
   }


   public void setJeOddana(boolean jeOddana) {
      this.jeOddana = jeOddana;

   }

   public int getSt() {
      return st;
   }

}