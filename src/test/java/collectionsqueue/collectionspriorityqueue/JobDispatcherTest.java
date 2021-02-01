package collectionsqueue.collectionspriorityqueue;

import collectionsqueue.job.*;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class JobDispatcherTest {

    JobDispatcher dispatcher = new JobDispatcher();

    @Test
    public void emptyQueueShouldThrowException() throws NoJobException {
        assertThrows(NoJobException.class, ()-> dispatcher.dispatchNextJob(new PriorityQueue<>()));
    }

    @Test
    public void highestPriorityShouldComeFirst() throws NoJobException {
        Job mostImportant = new Job(1, "mostImportant");
        Job leastImportant = new Job(10, "leastImportant");
        Job mediumImportant = new Job(5, "mediumImportant");

        Queue<Job> availableJobs = dispatcher.addJob(mediumImportant, leastImportant, mostImportant);
        Job nextJob = dispatcher.dispatchNextJob(availableJobs);

        assertEquals("mostImportant", nextJob.getJobDescription());
        assertEquals(1, nextJob.getPriority());
    }

}