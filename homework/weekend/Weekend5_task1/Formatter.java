package com.xebia.weekend5.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Formatter {{

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");

    public String formatDate(){
        Date date = new Date();
        String dateStr = simpleDateFormat.format(date);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                parseDate(dateStr);
            }
        };

        for(int i = 0; i < 1; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        return dateStr;
    }

    private synchronized static void parseDate(String dateStr) {
        System.out.println(dateStr);
       // return dateStr;
    }

}
}
