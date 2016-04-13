/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.time;

/**
 *
 * @author Kuba
 */
public class FakeClock implements Time{
    private long change;
    public FakeClock(){
        
    }
    public void setChange(long change){
        this.change = change;
    }
    @Override
    public long getCurrentTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
