package collectionsqueue.collectionsdeque;

import collectionsqueue.job.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class JobQueueTest {

    @Test
    public void emptyQueueShouldThrowException() throws NoJobException {

        assertThrows(NoJobException.class, ()->new JobQueue().dispatchUrgentJob(new ArrayDeque<>()));
    }

    @Test
    public void urgentJobShouldComeFromHead() throws NoJobException {
        Job urgent = new Job(4, "urgent");
        Job notUrgent = new Job(5, "not urgent");

        JobQueue jobQueue = new JobQueue();

        Deque<Job> jobs = jobQueue.addJobByUrgency(urgent, notUrgent);
        Job firstJob = jobQueue.dispatchUrgentJob(jobs);

        assertEquals("urgent", firstJob.getJobDescription());
        assertFalse(firstJob.isUrgent());
    }

    @Test
    public void notUrgentJobShouldComeFromTail() throws NoJobException {
        Job urgent = new Job(4, "urgent");
        Job notUrgent = new Job(5, "not urgent");

        JobQueue jobQueue = new JobQueue();

        Deque<Job> jobs = jobQueue.addJobByUrgency(urgent, notUrgent);
        Job lastJob = jobQueue.dispatchNotUrgentJob(jobs);

        assertEquals("not urgent", lastJob.getJobDescription());
        assertFalse(lastJob.isUrgent());
    }
}