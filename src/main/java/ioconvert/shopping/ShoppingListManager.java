package ioconvert.shopping;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream outputStream, List<String> shoppingList){
        Path path = Path.of("src\\main\\resources\\ioconvert\\shoppinglist.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream))) {
            for(String s:shoppingList) {
                bufferedWriter.write(s + "\n");
//                bufferedWriter.newLine();
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file ", ioe);
        }
    }

    public List<String> loadShoppingList(InputStream is) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

}
