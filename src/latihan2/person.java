/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author WINDOWS 8.1
 */
public class person {
    private String nama;
    private int usia;
    
    public person(String nama, int usia){
        this.nama=nama;
        this.usia=usia;
    }
    public void info(){
        System.out.println("Nama : "+nama);
        System.out.println("Usia : "+usia);
    }
}
