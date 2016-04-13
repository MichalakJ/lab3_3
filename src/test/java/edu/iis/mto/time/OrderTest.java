/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.time;

import org.junit.Test;

/**
 *
 * @author Kuba
 */
public class OrderTest {
    
    
    @Test(expected = OrderExpiredException.class)
    public void givenTimeExpired_whenConfirm_thenThrowException(){
        FakeClock validTime = new FakeClock();
        FakeClock cheatedTime = new FakeClock();
        cheatedTime.setChange(1000*60*60*30);
        Order order = new Order(validTime);
        order.submit();
        order.setTime(cheatedTime);
        order.confirm();
        
    }
}
