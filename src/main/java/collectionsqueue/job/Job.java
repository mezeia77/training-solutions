package collectionsqueue.job;

public class Job implements Comparable<Job>{

    private int priority;
    private String jobDescription;
    private boolean urgent;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public int compareTo(Job o) { //"Note: this class has a natural ordering that is inconsistent with equals."
        return this.priority-o.priority;
    }
}
