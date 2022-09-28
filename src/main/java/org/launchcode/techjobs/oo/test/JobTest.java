package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId () {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job3 instanceof Job);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(job3.getName(), "Product tester");
        assertEquals(job3.getEmployer().toString(), "ACME");
        assertEquals(job3.getLocation().toString(), "Desert");
        assertEquals(job3.getPositionType().toString(), "Quality control");
        assertEquals(job3.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job4.getId() == job5.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobStr = job6.toString();

        assertEquals(jobStr.charAt(0), '\n');
        assertEquals(jobStr.charAt(jobStr.length() - 1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobStr = job7.toString();

        assertEquals(jobStr,"\nID: " + 1 +
                "\nName: " + "Product tester" +
                "\nEmployer: " + "ACME" +
                "\nLocation: " + "Desert" +
                "\nPosition Type: " + "Quality control" +
                "\nCore Competency: " + "Persistence" +
                '\n');

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job8 = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobStr = job8.toString();

        assertEquals(job8.getEmployer().toString(), "Data not available");
    }




}

