package ua.sergey.kostyniuk;

import java.util.*;

public class Tester {
	    private Long[] map
	    (final Runnable task, final int executionCount, int threadPoolSize)
	    		throws InterruptedException {
        final Map<Thread, Long[]> calculationResults = new HashMap<>();

        
        for (int i = 0; i < threadPoolSize; i++) {
            Thread thread = new Thread() {


                public void run() {
                    Long[] calcs = calculationResults.get(this);
                    for (int j = 0; j < calcs.length; j++) {
                        long startTime = System.currentTimeMillis();
                        task.run();
                        calcs[j] = System.currentTimeMillis() - startTime;
                    }
                }
            };
            calculationResults.put(thread, new Long[executionCount]);
        }

       
        for (Thread thread : calculationResults.keySet()) {
            thread.start();
        }

       
        Long[] results = new Long[0];
        for (Map.Entry<Thread, Long[]> entry : calculationResults.entrySet()) {
            entry.getKey().join();
            results = ArrayUtils.addAll(results, entry.getValue());
        }
        return results;
    }
	    private Test1 reduce(Long[] values) {
	        long totalTime = 0;
	        long minTime = 0;
	        long maxTime = 0;

	        for (Long result : values) {
	            totalTime += result;
	            minTime = minTime==0 ? result : Math.min(result, minTime);
	            maxTime = Math.max(result, maxTime);
	        }

	        return new Test1(totalTime, minTime, maxTime);
	    }
   
}



