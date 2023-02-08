/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrepository;

import java.util.Scanner;
//Testt--
/**
 *
 * @author onzou
 */
public class TestRepository {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("=========================================");       
    System.out.println("Judul Lagu Berdasarkan Nomor Urut");
    System.out.println("=========================================");
    System.out.println();
     
    int a;
     
    System.out.print("Input Nomor Urut (1-10): ");
    a = input.nextInt();
     
    if ( a == 1) {
      System.out.println("Weakness-Eli Noir");
    }
    else if ( a == 2) {
      System.out.println("Blue Haired Boy-Madilyn Mei");
    }
    else if ( a == 3) {
      System.out.println("Banana Shake-HUS");
    }
    else if ( a == 4) {
      System.out.println("People Watching-Conan Gray");
    }
    else if ( a == 5) {
      System.out.println("Shirayuki-Eve");
    }
    else if ( a == 6) {
      System.out.println("1994-Cavetown");
    }
    else if ( a == 7) {
      System.out.println("Video Girl-Abby Robersts");
    }
    else if ( a == 8) {
      System.out.println("Dark Red-Steve Lacy");
    }
    else if ( a == 9) {
      System.out.println("Hi-Temporex");
    }
    else if ( a == 10) {
      System.out.println("I Won't-AJR");
    }
    else {
      System.out.println("====Nomor Urut Lagu Tidak Ada Di Playlist====");
    }
  }
}