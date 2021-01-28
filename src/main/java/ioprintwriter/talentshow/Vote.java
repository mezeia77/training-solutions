package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Vote {
    private List<Production> productions = new ArrayList<>();

    private List<String> talents = new ArrayList<>();
    private List<Integer> voteList = new ArrayList<>();

    public List<String> getTalents() {
        return talents;
    }

    public void talents(Path talents, Path votes){
        addTalentsToList(talents);
        votesList(votes);
        resultUpLoad();
    }

    private void addTalentsToList(Path talents){
        try (BufferedReader br = Files.newBufferedReader(talents)) {
            String line;
            while ((line=br.readLine())!=null) {
                this.talents.add(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found", e);
        }
    }

    private List<Integer> votesList(Path votes){
        try (BufferedReader br = Files.newBufferedReader(votes)) {
            String line;
            while((line=br.readLine())!=null){
                voteList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found", e);
        }
        return voteList;
    }

    private void resultUpLoad(){
        int[] talentPoints = new int[talents.size()];
        for(int i = 0; i< voteList.size(); i++){
            talentPoints[voteList.get(i)-1]++;
        }
        int winnerPoint= talentPoints[0];
        int winnerId = 0;
        for (int i=0; i<talentPoints.length; i++){
            if(talentPoints[i] > winnerPoint){
                winnerPoint = talentPoints[i];
                winnerId = i;
            }
        }
        for(int i = 0; i< talents.size()-1;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(talents.get(i)).append(" ").append(talentPoints[i]).append("\n");
            try {
                Files.writeString(Path.of("src\\main\\resources\\ioprintwriter\\result.txt"), sb, StandardOpenOption.APPEND);
                if(i == talents.size()-2){
                    Files.writeString(Path.of("src\\main\\resources\\ioprintwriter\\result.txt"), sb.append("Winner: ").append(talents.get(winnerId)), StandardOpenOption.APPEND);
                }
            } catch (IOException e) {
                throw new IllegalStateException("Cant write file", e);
            }
        }
    }

    public static void main(String[] args) {
        Vote vote = new Vote();
        vote.talents(Path.of("src\\main\\resources\\ioprintwriter\\talents.txt"), Path.of("src\\main\\resources\\ioprintwriter\\votes.txt"));
    }
}
