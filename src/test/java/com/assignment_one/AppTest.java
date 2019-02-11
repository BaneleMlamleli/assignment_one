package com.assignment_one;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue(double firstValue, double secondValue){
        Assert.assertEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void addition(double firstValue, double secondValue){
        Assert.assertEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void subtraction(double firstValue, double secondValue){
        Assert.assertEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void multiplication(double firstValue, double secondValue){
        Assert.assertEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void division(double numerator, double denominator){
        Assert.assertEquals((numerator/denominator), numerator, denominator );
    }
}
