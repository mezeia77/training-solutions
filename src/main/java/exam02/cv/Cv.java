package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;

    private List<Skill> skillList = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skillList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    @Override
    public String toString() {
        return "Cv{" +
                "name='" + name + '\'' +
                ", skill=" + skillList +
                '}';
    }

    public void addSkills(String...strings) {
        for(String s:strings){
            int space = s.lastIndexOf(" ");
            String skillName = s.substring(0, space);
            int level = Integer.parseInt(s.substring(space+2, space+3));
            skillList.add(new Skill(skillName, level));
        }
    }

    public int findSkillLevelByName(String skill) {
        int result = 0;
        for (Skill s:skillList){
            if(s.getName().equals(skill)){
                result = s.getLevel();
            }
        }
        if(result==0){
            throw new SkillNotFoundException("Skill not found");
        }
        return result;
    }
}
