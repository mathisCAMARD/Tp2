/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_noté;

/**
 *
 * @author mathis
 */
public class CalculatorExeption extends Exception{

    
    private boolean quit;
    
    public CalculatorExeption(String message) {
        this.quit = false;
        System.out.println(message);
    }

    public CalculatorExeption(String message, boolean quit) {
        System.out.println(message);
        this.quit = quit;
    }
    
    public boolean isQuit(){
        return quit;
    }
    
}
