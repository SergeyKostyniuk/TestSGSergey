package ua.sergey.kostyniuk;

public class Test1 {
	private final long totalTime;
    private final long minTime;
    private final long maxTime;

    public Test1(long totalTime, long minTime, long maxTime) {
        this.totalTime = totalTime;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

   
    public long getMaxTime() {
        return maxTime;
    }

    public long getMinTime() {
        return minTime;
    }

   
    public long getTotalTime() {
        return totalTime;
    }
}


