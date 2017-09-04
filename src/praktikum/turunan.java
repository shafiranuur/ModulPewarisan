/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author WINDOWS 8.1
 */
class turunan extends induk{
    public void test(String s){
        System.out.println("Method overload di dalam kelas turunan");
        System.out.println("s : \"" +s+ "\"");
    }
    public void test(){
        System.out.println("method override di dalam kelas turunan");
    }
}