package unit.inheritance_challenge;

import org.inheritance_challenge.Worker;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class TestWorkerShould {
    @Test
    public void have_name_and_birth_date_assigned() throws Exception {
        String name = "Maria";
        LocalDate birthDate = LocalDate.of(1994, Month.MARCH, 8);
        Worker worker = new Worker(name, birthDate);

        Assert.assertEquals(name, worker.getName());
        Assert.assertTrue(birthDate.isEqual(worker.getBirthDate()));
    }

    @Test
    public void have_its_age_assigned() throws Exception {
        Worker worker = new Worker("Maria", LocalDate.of(1994, Month.MARCH, 8));

        Assert.assertEquals(29, worker.getAge());
    }

    @Test
    public void be_able_to_terminate_their_work() throws Exception {
        Worker worker = new Worker("Maria", LocalDate.of(1994, Month.MARCH, 8));
        LocalDate endDate = LocalDate.of(2025, Month.MAY, 24);

        worker.terminate(endDate);

        Assert.assertTrue(endDate.isEqual(worker.getEndDate()));
    }
}
