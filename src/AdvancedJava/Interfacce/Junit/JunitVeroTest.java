package AdvancedJava.Interfacce.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;





class JunitVeroTest {




        @Test
        public void test1sottr()
{
        int mol=JunitVero.Substraction(21,15);
        Assertions.assertEquals(4,6);

    }



        @Test
        public void test2sottr() {
        int mol=JunitVero.Substraction(10,5);
        Assertions.assertEquals(34,24);

    }



    @Test
    public void test1molt() {
//nome classe.nome metodo
        int res = JunitVero.Substraction(10, 2);
        Assertions.assertEquals(5,5);

    }
    @Test
    public void test2molt() {
        int mol=JunitVero.Multipication(20,5);
        Assertions.assertEquals(4,6);

    }




    }
