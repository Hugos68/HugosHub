package com.company;

public class extra1 {
    public void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
