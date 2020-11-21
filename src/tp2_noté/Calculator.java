/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_noté;

import java.util.Arrays;

/**
 *
 * @author mathis
 */
public class Calculator {

    public static int compute(String[] tokens) throws CalculatorExeption {

        int temp = tokens[0].length();
        int compteur = 0;

        for (int i = 0; i < tokens.length; i++) {
            if ("quit".equals(tokens[i])) {
                compteur++;
            }
        }

        for (int i = 1; i < tokens.length; i++) {
            if (temp != tokens[i].length()) {
                if (compteur == 1) {
                    throw new CalculatorExeption("tockens lenth different and one quit", true);
                } else {
                    throw new CalculatorExeption("tokens lenth different");
                }
            }
        }
        return tokens.length;
    }

    public static boolean parseAndCompute(String input) {

        String[] tokens = input.split(" ");
        System.out.println(Arrays.toString(tokens));

        try {
            System.out.println(compute(tokens));
        } catch (CalculatorExeption e) {
            System.out.println(e.getMessage());
            if (e.isQuit() == false){
                return false;
            }
            if (e.isQuit() == true) {
                
            return true;
            }
            
            
        }

        return false;
    }
}
