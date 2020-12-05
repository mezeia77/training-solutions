package stringmethods;

import java.util.Locale;

public class FileNameManipulator {

    private boolean isEmpty(String str){
        return str == null || str.isBlank();
    }

    public char findLastCharacter (String str){
        if (isEmpty(str) == true){
            throw new IllegalArgumentException("Empty String!");
        }
        str = str.trim();
        return str.charAt(str.length()-1);
    }

    public String findFileExtension(String fileName){
        if (isEmpty(fileName) == true){
            throw new IllegalArgumentException("Empty Filename!");
        }
        fileName = fileName.trim();
        int index = fileName.lastIndexOf(".");
        if (index < 1 || index == fileName.length()-1){
            throw new IllegalArgumentException("Invalid Filename!");
        }
        return fileName.substring(index);
    }

    public boolean identifyFilesByExtension(String fileName, String ext){
        if (isEmpty(fileName) || isEmpty(ext)){
            throw new IllegalArgumentException("Invalid argument!");
        }
        fileName = fileName.trim();
        ext = ext.trim();

        int index = fileName.lastIndexOf(".");
        if (index < 1 || index == fileName.length()-1){
            throw new IllegalArgumentException("Invalid argument!");
        }
        return fileName.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        if (isEmpty(searchedFileName) || isEmpty(actualFileName)){
            throw new IllegalArgumentException("Invalid argument!");
        }

        searchedFileName = searchedFileName.trim();
        actualFileName = actualFileName.trim();



        return searchedFileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName){
        if (isEmpty(fileName) == true){
            throw new IllegalArgumentException("Empty Filename!");
        }
        fileName = fileName.trim();
        int index = fileName.lastIndexOf(".");
        if (index < 1 || index == fileName.length()-1){
            throw new IllegalArgumentException("Invalid Filename!");
        }

        String namePart = fileName.substring(0, index);
        String extension = fileName.substring(index);
        return namePart + extension.toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target){
        if (isEmpty(fileName)){
            throw new IllegalArgumentException("Invalid argument!");
        }
        fileName = fileName.trim();
        present = present.trim();
        target = target.trim();

        if (fileName.contains(present)){
            fileName = fileName.replace(present, target);
        }
        return fileName;
    }

}
