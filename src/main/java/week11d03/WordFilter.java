package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c){
        List <String> result = new ArrayList<>();

        for (int i = 0; i< words.size(); i++){
            String word = words.get(i).toLowerCase();
            for(int j = 0; j<word.length(); j++){
                if(word.charAt(j)==c){
                    result.add(words.get(i));
                    break;
                }
            }
        }
        return result;
    }

    public List<String> wordsWithChar2(List<String> words, char c){
        List <String> result = new ArrayList<>();

        for (String word : words){
            for(int j = 0; j<word.length(); j++){
                if(word.toLowerCase().charAt(j)==c){
                    result.add(word);
                    break;
                }
            }
        }
        return result;
    }

    public List<String> wordsWithChar3(List<String> words, char c){
        List <String> result = new ArrayList<>();

        for (String word : words){
                if(word.toLowerCase().contains(String.valueOf(c))){
                    result.add(word);
                }
        }
        return result;
    }

    public List<String> wordsWithChar4(List<String> words, char c){
        List <String> result = new ArrayList<>();

        for (String word : words){
                if(word.toLowerCase().indexOf(c)!=-1){
                    result.add(word);
                }
        }
        return result;
    }

}
