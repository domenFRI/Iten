package com.example.eten_test;


import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;

/***********************************************************************
 * Module:  ZmStrankaOddajaOcene.java
 * Author:  adrij
 * Purpose: Defines the Class ZmStrankaOddajaOcene
 ***********************************************************************/

/** @pdOid 4423342f-e577-46aa-b2ee-c32ac45c321d */


public class ZmStrankaOddajaOcene extends AppCompatActivity{
   /** @pdRoleInfo migr=no name=KOddajaOcene assc=association2 mult=1..1 */
   private SeekBar seek_ocenaHrane;
   private SeekBar seek_ocenaStoritve;
   private int indeksNarocila;
   private Button izbrisiOcenoButton;
   private Button oddajOcenoButton;
   private TextView naslovNarocila;
   private TextView podrobnostiNarocila;
   private TextView oddanaOcena;
   public static Narocilo testno_narocilo;


   /** @pdOid de760b9d-699f-45e1-8974-37e21dec3fdf */
   public double spremeniObstojecoOceno() {
      return 0;
   }
   
   /** @pdOid 0e80dcbe-ae3e-4d2f-8da7-2359c5bbf711 */
   public boolean zbrisiOceno(Narocilo narocilo) {

      KOddajaOcene kodd = new KOddajaOcene();
      kodd.zbrisiOceno(narocilo);
      return false;
   }
   
   /** @pdOid 12ad6351-812d-42e1-b591-d15a91c64797 */
   public boolean ocenaOddana() {
      return false;
   }
   
   /** @pdOid 8cb99fda-8463-4613-babe-4e0e73d68db7 */
   public void prikaziObvestiloOcenaZbrisana() {

      AlertDialog.Builder builder = new AlertDialog.Builder(ZmStrankaOddajaOcene.this);
      builder.setTitle("Izbris")
              .setMessage("\nVaša ocena je odstranjena.")
              .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                 public void onClick(DialogInterface dialog, int id) {
                    // Handle OK button click
                 }
              });
      AlertDialog dialog = builder.create();
      dialog.show();

   }
   
   /** @pdOid fc9ec205-29c0-465d-b611-8405c43ec692 */
   public void prikaziObvestiloOOddaniOceni() {

      Double povprecjeH = Hrana.nastaviPovprecje();
      DecimalFormat decimalFormat = new DecimalFormat("0.00");
      String zaokrozenaHrana = decimalFormat.format(povprecjeH);

      Double povprecjeS = Storitev.nastaviPovprecje();
      DecimalFormat decimalFormat1 = new DecimalFormat("0.00");
      String zaokrozenaStoritev = decimalFormat1.format(povprecjeS);


      //prikazi dialog
      AlertDialog.Builder builder = new AlertDialog.Builder(ZmStrankaOddajaOcene.this);
      builder.setTitle("Hvala!")
              .setMessage("\nPovprečna ocena hrane je " + zaokrozenaHrana + "\n\nPovprečna ocena storitve je " + zaokrozenaStoritev)
              .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                 public void onClick(DialogInterface dialog, int id) {

                 }
              });
      AlertDialog dialog = builder.create();
      dialog.show();

   }
   
   /** @pdOid 62cbb30e-6756-4850-b76e-3248856d5b78 */
   public static String prikaziOcenaZeObstaja() {
      return null;
   }
   
   /** @pdOid 423c68f3-92fd-43c2-af2f-2a7f8aa9d667 */
   public void Oddajocene(double ocenaHrane, double ocenaStoritve) {

      KOddajaOcene kodd = new KOddajaOcene();
      kodd.pricniOcenjevanje(ocenaHrane, ocenaStoritve);
   }





   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_znotraj_narocila);


      int idButton = getIntent().getIntExtra("idButton", -1);

      oddajOcenoButton = findViewById(R.id.oddajOcenoButton);
      izbrisiOcenoButton=findViewById(R.id.izbrisiOcenoButton);
      seek_ocenaHrane = findViewById(R.id.ocenaHrana);
      seek_ocenaStoritve = findViewById(R.id.ocenaStoritev);
      naslovNarocila = findViewById(R.id.textView3);
      podrobnostiNarocila = findViewById(R.id.textView4);
      oddanaOcena = findViewById(R.id.textView7);

      // pridobi info s kerim buttonom si vstopil v second activity in shran kot indeks narocila + disablaj oddaj ocenobttn, če ta ze obstaja
      if (idButton == 1) {
         indeksNarocila=1; String dynamicOrderID = "1"; String dynamicOrderInfo = "- burger, Sprite, solata";

         String formatiranNarociloID = getString(R.string.dynamic_ime_narocila, dynamicOrderID);
         String formatiranNarociloInfo = getString(R.string.dynamic_podrobnosti_narocila, dynamicOrderInfo);
         naslovNarocila.setText(formatiranNarociloID); podrobnostiNarocila.setText(formatiranNarociloInfo);

         if (MainActivity.testno_narocilo1.preveriCeOcenaObstaja()) {
            oddajOcenoButton.setEnabled(false);
            seek_ocenaHrane.setEnabled(false);
            seek_ocenaStoritve.setEnabled(false);
            nastaviTextOddanaOcena();

         }
         else {
            izbrisiOcenoButton.setEnabled(false);
            seek_ocenaHrane.setEnabled(true);
            seek_ocenaStoritve.setEnabled(true);
         }

      } else if (idButton == 2) {
         indeksNarocila=2; String dynamicOrderID = "2"; String dynamicOrderInfo = "- rižota z morskimi sadeži, tiramisu";

         String formatiranNarociloID = getString(R.string.dynamic_ime_narocila, dynamicOrderID);
         String formatiranNarociloInfo = getString(R.string.dynamic_podrobnosti_narocila, dynamicOrderInfo);
         naslovNarocila.setText(formatiranNarociloID); podrobnostiNarocila.setText(formatiranNarociloInfo);

         if (MainActivity.testno_narocilo2.preveriCeOcenaObstaja()) {
            oddajOcenoButton.setEnabled(false);
            seek_ocenaHrane.setEnabled(false);
            seek_ocenaStoritve.setEnabled(false);

            nastaviTextOddanaOcena();

         }
         else {
            izbrisiOcenoButton.setEnabled(false);
            seek_ocenaHrane.setEnabled(true);
            seek_ocenaStoritve.setEnabled(true);
         }
      } else if (idButton == 3) {
         indeksNarocila=3; String dynamicOrderID = "3"; String dynamicOrderInfo = "- goveja juha, grška solata, limonada";

         String formatiranNarociloID = getString(R.string.dynamic_ime_narocila, dynamicOrderID);
         String formatiranNarociloInfo = getString(R.string.dynamic_podrobnosti_narocila, dynamicOrderInfo);
         naslovNarocila.setText(formatiranNarociloID); podrobnostiNarocila.setText(formatiranNarociloInfo);

         if (MainActivity.testno_narocilo3.preveriCeOcenaObstaja()) {
            oddajOcenoButton.setEnabled(false);
            seek_ocenaHrane.setEnabled(false);
            seek_ocenaStoritve.setEnabled(false);

            nastaviTextOddanaOcena();
         }
         else {
            izbrisiOcenoButton.setEnabled(false);
            seek_ocenaHrane.setEnabled(true);
            seek_ocenaStoritve.setEnabled(true);
         }
      }
   }


   public void pozeni_oddajCB(View view) {


      seek_ocenaHrane = findViewById(R.id.ocenaHrana);
      seek_ocenaStoritve = findViewById(R.id.ocenaStoritev);

      int ocenaHrane= seek_ocenaHrane.getProgress();
      int ocenaStoritve= seek_ocenaStoritve.getProgress();


      if (indeksNarocila == 1) {
         testno_narocilo = MainActivity.testno_narocilo1;
      }
      else if (indeksNarocila == 2) {
         testno_narocilo = MainActivity.testno_narocilo2;

      } else if (indeksNarocila == 3) {
         testno_narocilo = MainActivity.testno_narocilo3;
      }

      Oddajocene(ocenaHrane+1, ocenaStoritve+1);

      //dialog
      prikaziObvestiloOOddaniOceni();

      oddajOcenoButton.setEnabled(false);
      izbrisiOcenoButton.setEnabled(true);

      //disablaj seekbar-a in nastavi text oddane ocene
      seek_ocenaHrane.setEnabled(false);
      seek_ocenaStoritve.setEnabled(false);
      nastaviTextOddanaOcena();

   }


   public void izbrisiOcenoCB(View view) {


      if (indeksNarocila == 1) {
         zbrisiOceno(MainActivity.testno_narocilo1);
         oddajOcenoButton.setEnabled(true);
         izbrisiOcenoButton.setEnabled(false);

      } else if (indeksNarocila == 2) {
         zbrisiOceno(MainActivity.testno_narocilo2);
         oddajOcenoButton.setEnabled(true);
         izbrisiOcenoButton.setEnabled(false);

      } else if (indeksNarocila == 3) {
         zbrisiOceno(MainActivity.testno_narocilo3);
         oddajOcenoButton.setEnabled(true);
         izbrisiOcenoButton.setEnabled(false);
      }

      //dialog
      prikaziObvestiloOcenaZbrisana();

      //enablaj seekbar-a in brisi text oddane ocene
      seek_ocenaHrane.setEnabled(true);
      seek_ocenaStoritve.setEnabled(true);
      oddanaOcena.setText("");

   }

   public void nastaviTextOddanaOcena() {

      String oddanaOcenaString = "Oddana ocena za hrano: " + Hrana.vsaNarocila.get(indeksNarocila) + ", za storitev: " + Storitev.vsaNarocila.get(indeksNarocila);
      oddanaOcena.setText(oddanaOcenaString);

   }

   public void returnToPreviousPage(View view) {
      finish();
   }








}