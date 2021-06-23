package lambdaoptional;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SocialNetworkTest {

    @Test
    public void testCreateMember() {
        Member member = new Member("John Doe", List.of("Java", "OOP"), Sex.MALE);
        assertEquals("John Doe", member.getName());
        assertEquals(List.of("Java", "OOP"), member.getSkills());
        assertEquals(Sex.MALE, member.getGender());
    }

    @Test
    public void testFindFirst() {
        SocialNetwork socialNetwork = new SocialNetwork(List.of(
                new Member("John Doe", List.of("Java", "OOP"), Sex.MALE),
                new Member("Jane Doe", List.of(".NET", "OOP"), Sex.FEMALE),
                new Member("James Doe", List.of("Python", "Java", "OOP"), Sex.MALE),
                new Member("Janet Doe", List.of("JavaScript", "scripting"), Sex.MALE)));

        assertFalse(socialNetwork.findFirst(m -> m.getName().equals("Joe")).isPresent());
        assertTrue(socialNetwork.findFirst(m -> m.getName().equals("John Doe")).isPresent());
        assertEquals("John Doe", socialNetwork.findFirst(m -> m.getName().equals("John Doe")).get().getName());
    }

    @Test
    public void testAvg() {
        assertFalse(new SocialNetwork(Collections.emptyList()).averageNumberOfSkills().isPresent());

        SocialNetwork socialNetwork = new SocialNetwork(List.of(
                new Member("John Doe", List.of("Java", "OOP"), Sex.MALE),
                new Member("Jane Doe", List.of(".NET", "OOP"), Sex.FEMALE),
                new Member("James Doe", List.of("Python", "Java", "OOP"), Sex.MALE),
                new Member("Janet Doe", List.of("JavaScript", "scripting"), Sex.MALE)
        ));
        assertEquals(2.25, socialNetwork.averageNumberOfSkills().get());
    }
}