package ss4_oop.bai_tap.stopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        System.currentTimeMillis();
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}


