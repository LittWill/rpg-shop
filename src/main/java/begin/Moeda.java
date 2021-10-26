/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package begin;

/**
 *
 * @author hecto
 */
public enum Moeda {
    GOLD, SAPHIRE;
    
   public static String getUrlImage(Moeda moeda){
       if (moeda == Moeda.GOLD){
           return "/gold (1).png";
       }
       return "/saphire (1).png";
   }
}
