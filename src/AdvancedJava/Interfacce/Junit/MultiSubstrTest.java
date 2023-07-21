package AdvancedJava.Interfacce.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MultiSubstrTest {

        @Test
        public void test1sottr()
{
        //int mol= JunitVero.Substraction(21,15);
      assertEquals(4,MultiSubstr.Substraction(2,2));

    }
        @Test
        public void test2sottr() {
       // int mol=JunitVero.Substraction();
       assertEquals(10,MultiSubstr.Substraction(15,5));

    }

    @Test
    public void test1molt() {
//nome classe.nome metodo
      //  int res = JunitVero.Substraction(10, 2);
        assertEquals(24,MultiSubstr.Multipication(6,24));

    }
    @Test
    public void test2molt() {
      //  int mol=JunitVero.Multipication(20,5);
        assertEquals(40,MultiSubstr.Multipication(5,8));

    }

    }
