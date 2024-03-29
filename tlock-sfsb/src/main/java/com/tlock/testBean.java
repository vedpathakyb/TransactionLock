package com;
import javax.ejb.Local;
import javax.ejb.Stateful;
@Local
@Stateful
public class  testBean implements testInt {
public void test()
{
        System.out.println("Inside SFSB");
}
}

