package com.tes;

import org.junit.Test;

public class CalcTeste {

    @Test
    public void testSomar(){
        Calculadora calculadora = new Calculadora();
        int sum = calculadora.somar("1+2+3");

    }
}
