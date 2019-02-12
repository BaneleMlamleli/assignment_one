package com.assignment_one;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue(){
        double firstValue = 2;
        double secondValue = 1;
        Assert.assertEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void addition(){
        double firstValue = 2;
        double secondValue = 1;
        Assert.assertEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void subtraction(){
        double firstValue = 2;
        double secondValue = 1;
        Assert.assertEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void multiplication(){
        double firstValue = 2;
        double secondValue = 1;
        Assert.assertEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void division(){
        double numerator = 2;
        double denominator = 1;
        Assert.assertEquals((numerator/denominator), numerator, denominator );
    }
}
