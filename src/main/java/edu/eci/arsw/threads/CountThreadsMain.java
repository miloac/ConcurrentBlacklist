/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread Hilo1 = new CountThread(0,99);
        CountThread Hilo2 = new CountThread(99,199);
        CountThread Hilo3 = new CountThread(200,299);
        Hilo1.run();
        Hilo2.run();
        Hilo3.run();
    }
    
}
