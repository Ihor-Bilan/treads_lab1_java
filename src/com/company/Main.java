package com.company;

import java.util.Scanner;

public class Main 
{
            public static void 
            main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Введiть кiлькiсть потокiв: ");
            int threadCount = scanner.nextInt();
    
            BreakThread breakThread = new BreakThread();
    
            for (int i = 0; i < threadCount; i++)
            {
                new MainThread(i + 1, breakThread).start();
            }
    
            new Thread(breakThread).start();
        } 
        finally 
        {
            scanner.close(); 
        }
    }
}
    


