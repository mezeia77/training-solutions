package collectionsqueue.collectionsdeque;

import collectionsqueue.job.*;

import java.util.ArrayDeque;
import java.util.Deque;

public class JobQueue {
    public Deque<Job> addJobByUrgency(Job...jobs){
        Deque<Job> jobDeque = new ArrayDeque<>();
        for (Job job:jobs){
            if (job.isUrgent()){
                jobDeque.addFirst(job);
            } else {
                jobDeque.addLast(job);
            }
        }
        return jobDeque;
    }

    public Job dispatchUrgentJob(Deque<Job> jobs) throws NoJobException {
        if(jobs.isEmpty()){
            throw new NoJobException("No job");
        }
        return jobs.getFirst();
    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) throws NoJobException{
        if(jobs.isEmpty()){
            throw new NoJobException("No job");
        }
        return jobs.getLast();
    }

}
