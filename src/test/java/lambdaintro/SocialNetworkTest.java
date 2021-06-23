package lambdaintro;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SocialNetworkTest {

    @Test
    void createMember() {
        Member member = new Member("John Doe", List.of("Java", "OOP"), Sex.MALE);
        assertEquals("John Doe", member.getName());
        assertEquals(List.of("Java", "OOP"), member.getSkills());
        assertEquals(Sex.MALE, member.getGender());
        assertEquals(0, member.getMessages().size());
    }

    @Test
    void testSendMessage() {
        Member member = new Member("John Doe", List.of("Java", "OOP"), Sex.MALE);
        member.sendMessage("Hello!");
        member.sendMessage("Dear John!");

        assertEquals(List.of("Hello!", "Dear John!"), member.getMessages());
    }

    @Test
    void testFindMembersBy() {
        SocialNetwork socialNetwork = new SocialNetwork(List.of(
                new Member("John Doe", List.of("Java", "OOP"), Sex.MALE),
                new Member("Jane Doe", List.of(".NET", "OOP"), Sex.FEMALE),
                new Member("James Doe", List.of("Python", "Java", "OOP"), Sex.MALE),
                new Member("Janet Doe", List.of("JavaScript", "scripting"), Sex.MALE)));

        List<Member> found = socialNetwork.findMembersBy(m -> m.getSkills().contains("Java"));
        assertEquals(2, found.size());
        assertEquals("John Doe", found.get(0).getName());
        assertEquals("James Doe", found.get(1).getName());
    }

    @Test
    void testApplyToSelectedMembers() {
        SocialNetwork socialNetwork = new SocialNetwork(List.of(
                new Member("John Doe", List.of("Java", "OOP"), Sex.MALE),
                new Member("Jane Doe", List.of(".NET", "OOP", "db"), Sex.FEMALE),
                new Member("James Doe", List.of("Python", "Java", "OOP"), Sex.MALE),
                new Member("Janet Doe", List.of("JavaScript", "scripting", "db"), Sex.FEMALE),
                new Member("Jenifer Doe", List.of("C", "C++", "ASM"), Sex.FEMALE)
        ));

        socialNetwork.applyToSelectedMembers(
                m -> m.getGender() == Sex.FEMALE && m.getSkills().contains("db"),
                m -> m.sendMessage("Dear " + m.getName() + "!") );

        assertEquals("Dear Jane Doe!", socialNetwork.findMembersBy(m -> m.getName().equals("Jane Doe")).get(0).getMessages().get(0));
        assertEquals("Dear Janet Doe!", socialNetwork.findMembersBy(m -> m.getName().equals("Janet Doe")).get(0).getMessages().get(0));
        assertEquals(0, socialNetwork.findMembersBy(m -> m.getName().equals("Jenifer Doe")).get(0).getMessages().size());
    }
}