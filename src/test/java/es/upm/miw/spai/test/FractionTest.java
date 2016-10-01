package es.upm.miw.spai.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.spai.ecp2.Fraction;

public class FractionTest {

    @Test
    public void testFractionIntInt() {
          int numerador=2;
          int denominador=5;
          Fraction fracion= new Fraction(numerador,denominador);
          assertEquals(2, fracion.getNumerator());
          assertEquals(5, fracion.getDenominator());
          
          
    }

    @Test
    public void testFraction() {
          Fraction fracion= new Fraction();
          assertEquals(1, fracion.getNumerator());
          assertEquals(1, fracion.getDenominator());
    }

    @Test
    public void testDecimal() {
          int numerador=2;
          int denominador=5;
          Fraction fracion= new Fraction(numerador,denominador);
          assertEquals(0.4, fracion.decimal(),0.1);
    }

}
