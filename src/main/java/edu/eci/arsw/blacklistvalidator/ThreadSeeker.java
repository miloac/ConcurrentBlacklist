/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.LinkedList;
import java.util.logging.Level;

/**
 *
 * @author 2116177
 */
public class ThreadSeeker extends Thread {
    private String ipAddress;
    private int min;
    private int tot;
    
    @Override
    public void run() {
        LinkedList<Integer> blackListOcurrences=new LinkedList<>();
        
        int ocurrencesCount=0;
        
        int checkedListsCount=0;
        
        for (int i=min;i<min+tot;i++){
            checkedListsCount++;
            
            if (skds.isInBlackListServer(i, ipAddress)){
                
                blackListOcurrences.add(i);
                
                ocurrencesCount++;
            }
        }
    }

    public ThreadSeeker(String ipAddress, int min, int tot) {
        this.ipAddress = ipAddress;
        this.min = min;
        this.tot = tot;
    }
    
   

}
