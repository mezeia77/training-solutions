package lambdaintro;

import stringbasic.Gender;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private List<String> skills;
    private Sex gender;
    private List<String> messages = new ArrayList<>();

    public Member(String name, List<String> skills, Sex gender) {
        this.name = name;
        this.skills = skills;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Sex getGender() {
        return gender;
    }

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                ", gender=" + gender +
                ", messages=" + messages +
                '}';
    }

    public void sendMessage(String message) {
        messages.add(message);
    }
}
