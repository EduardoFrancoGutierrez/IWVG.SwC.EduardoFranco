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

    @Test
    public void testSubtract() {
          int numerador=5;
          int denominador=4;
          Fraction fraction= new Fraction(numerador,denominador);
          
          numerador=2;
          denominador=5;
          Fraction fraction2= new Fraction(numerador,denominador);
          fraction.subtract(fraction2);
          
          assertEquals(20, fraction.getDenominator());
          assertEquals(17, fraction.getNumerator());
    }
    
    @Test
    public void testMajor() {
        Fraction f = new Fraction();
        Fraction fraction1= new Fraction(2,4);
        Fraction fraction2= new Fraction(10,2);
        assertEquals(fraction2, f.Major(fraction1,fraction2));
    }
}
