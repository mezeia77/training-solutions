package exam02.cv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Cv{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }

    public void addSkills(String... newSkill) {
        for (String s:newSkill){
            String skillname = s.substring(0,s.length()-4);
            int skillLevel = Integer.parseInt(s.substring(s.length()-2, s.length()-1));
            skills.add(new Skill(skillname, skillLevel));
        }
    }

    public int findSkillLevelByName(String skillName) {
        int result = 0;
        for (Skill skill:skills){
            if(skill.getName().equals(skillName)){
                result = skill.getLevel();
            }
        }
        if(result==0){
            throw new SkillNotFoundException("Skill not found");
        }
        return result;
    }
}
