/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author WINDOWS 8.1
 */
public class montaintruck extends truck{
    public int seatheight;
    public montaintruck(int startheight, int startcadence, int startspeed, int startgear){
        super (startcadence, startspeed, startgear);
        seatheight = startheight;
        
    }
    
    public void setheight(int newvalue){
    seatheight=newvalue;
    }
    
    public static void main(String[]aku){
    System.out.println("mulai berjalan");
     montaintruck mb = new montaintruck(0,0,0,0);
    
        System.out.println("gear : "+mb.gear);
        System.out.println("speed : "+mb.speed);
        mb.setgear(2);
        mb.speedup(2);
        System.out.println("gear : "+mb.gear);
        System.out.println("speed : "+mb.speed);
        mb.speedup(2);
        System.out.println("gear : "+mb.gear);
        System.out.println("speed : "+mb.speed);
    }
}
