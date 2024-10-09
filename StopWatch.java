import java.time.Instant;

public class StopWatch {
    private long startTime;
    private long endTime;
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = Instant.now().toEpochMilli();
    }

    public void start() {
        this.startTime = Instant.now().toEpochMilli();
    }

    public void stop() {
        this.endTime = Instant.now().toEpochMilli();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}