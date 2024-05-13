
package com.company;

public class MainThread extends Thread 
{
    private final int id;
    private final BreakThread breakThread;

    public MainThread(int id, BreakThread breakThread) 
    {
        this.id = id;
        this.breakThread = breakThread;
    }

    @Override
    public void run() 
    {
        long sum = 0;
        long elementsUsed = 0; // Змінна для відстеження кількості використаних елементів
        boolean isStop = false;
        do 
        {
            sum += getNextElement(); // Додати наступний елемент до суми
            elementsUsed++; // Збільшити лічильник використаних елементів
            isStop = breakThread.isCanBreak();
        } 
        while (!isStop);
        System.out.println(id + " - Сума " + sum + " - Кiлькiсть доданкiв: " + elementsUsed); // Вивести кількість використаних елементів
    }

    private long getNextElement() 
    {
      return 1;
    }
}
