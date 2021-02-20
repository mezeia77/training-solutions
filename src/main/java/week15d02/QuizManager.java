package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class QuizManager {

    private static List<Quiz> quizList = new ArrayList<>();

    public List<String> fillFromFile(String filename) {
        Path filePath = Path.of("src/main/resources/week15d02" + "\\" + filename);
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(filePath)) {
            String line;
                while ((line = br.readLine()) != null) {
                    strings.add(line);
                }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file ", e);
        }
        return strings;
    }

    public void process(String filename){
        List<String> strings = fillFromFile(filename);
        String question = "";
        String answer = "";
        int score = 0;
        String topic = "";
        for (int i = 0; i< strings.size(); i++){
            if (i%2==0){
                question = strings.get(i);
            } else {
                String[] secondLine = strings.get(i).split(" ");
                answer = secondLine[0];
                score = Integer.parseInt(secondLine[1]);
                topic = secondLine[2];
                quizList.add(new Quiz(question, answer, score, topic));
            }
        }
    }

    public List<String> questionsByTopic(String topic){
        List<String> result = new ArrayList<>();
        for (Quiz quiz: quizList){
            if(quiz.getTopic().equals(topic)){
                result.add(quiz.getQuestion());
            }
        }
        return result;
    }

    public Quiz getRandomQuiz(){
        List<Quiz> quizListCopy = new ArrayList<>(quizList);
        Collections.shuffle(quizListCopy);
        return quizListCopy.get(0);
    }

    public Map<String, List<Quiz>> summaryByTopic(){
        Map<String, List<Quiz>> result = new HashMap<>();
        for (Quiz quiz:quizList){
            if(result.containsKey(quiz.getTopic())){
                result.get(quiz.getTopic()).add(quiz);
            } else {
                result.put(quiz.getTopic(), new ArrayList<>(Collections.singleton(quiz)));
            }
        }
        return result;
    }

    public String getMaxScoreTopic(){
        int max = 0;
        String result = "";
        for (Map.Entry entry:summaryByTopic().entrySet()){
            int count = 0;
            for (Quiz quiz:summaryByTopic().get(entry.getKey())){
                count += quiz.getScore();
            }
            if(max<count){
                max = count;
                result = entry.getKey().toString();
            }
        }
        return result;
    }



    public static void main(String[] args) {
        new QuizManager().process("kerdesek.txt");
//        System.out.println(quizList);
        System.out.println(new QuizManager().questionsByTopic("tortenelem"));
        System.out.println(new QuizManager().getRandomQuiz());
        System.out.println(new QuizManager().summaryByTopic());
        System.out.println(new QuizManager().getMaxScoreTopic());
    }
}
