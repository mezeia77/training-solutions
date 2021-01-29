package iostringwrites;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class Longwords {

    public void longWordManager(Writer writer, List<String> words){
        PrintWriter printWriter = new PrintWriter(writer);
        for(String word:words){
            printWriter.print(word + ": ");
            printWriter.print(word.length() + "\n");
        }
    }

    public String useStringWriter(List<String> words){
        try (StringWriter stringWriter = new StringWriter()){
            longWordManager(stringWriter, words);
            return stringWriter.toString();
        } catch (IOException e){
            throw new IllegalStateException("Can not write file, e");
        }
    }
}
