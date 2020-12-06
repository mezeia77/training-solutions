package w06d03;

public class WordEraser {

    public String eraseWord (String words, String word){

        StringBuilder sb = new StringBuilder();
        words = words.toLowerCase();
        sb.append(words);

        while (words.contains(word)){
            int start = sb.indexOf(word);
            int end = start + word.length();
            sb.delete(start, end);
            words=sb.toString();
        }
        return sb.toString();

    }

}
