package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {
    List<State> states = new ArrayList<>();
    private static final String directory = "src/main/resources/ioreader/";

    public List<State> getStates() {
        return states;
    }

    public void readStatesFromFile(String filename){
        Path filePath = Path.of(directory+filename);
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String line;
            while ((line = br.readLine()) != null) {
//                String[] temp= line.split("-");
//                State s = new State(temp[0],temp[1]);
//                states.add(s);

                String[] temp = new String[line.length()];
                int split = line.indexOf("-");
                temp[0] = line.substring(0, split);
                temp[1] = line.substring(split+1);
                states.add(new State(temp[0], temp[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can't read ", e);
        }
    }

    public String findCapitalByStateName(String stateName){
        for(State state : states){
            if(state.getStateName().equals(stateName)){
                return state.getCapital();
            }
        } throw new IllegalArgumentException("No such state");
    }

    public String findCapitalByStateName2(String stateName){
        String result;
        for(int i = 0; i<states.size(); i++){
            if(states.get(i).getStateName().equals(stateName)){
                result = states.get(i).getCapital();
                return result;
            }
        } throw new IllegalArgumentException("No such state");
    }
}
