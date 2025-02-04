package org.example;

public class Payroll 
{
    public double gross(double hours)
    {
        return hours * 16.78;
    }

    public double socSec(double p)
    {
        return p * 0.06;
    }

    public double fedIn(double p)
    {
        return p * 0.14;
    }

    public double stIn(double p)
    {
        return p * 0.05;
    }

    public double ins(int d)
    {
        if (d >= 3)
        {
            return 35.00;
        } else {
            return 15.00;
        }
    }

    public double netIn(double g, double ss, double fi, double si, double ins)
    {
        double net = g - (ss + fi + si + 10 + ins);
        return net;
    }

}