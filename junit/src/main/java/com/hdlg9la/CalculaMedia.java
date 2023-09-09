package com.hdlg9la;

public class CalculaMedia {

         public int calculaMediaDeDois(int a , int b){

                  int media = ( a+b ) / 2 ;


                  return media;
         }

         public static void main(String[] args) {
                  
                  CalculaMedia calculaMedia = new CalculaMedia();

                  int a = calculaMedia.calculaMediaDeDois(10, 20);

                  System.out.println(a);
         }
         
}
