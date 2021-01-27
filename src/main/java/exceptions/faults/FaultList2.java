package exceptions.faults;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FaultList2 {

    public List<String> processLines(List<String> lines){
        if(lines==null){
            throw new IllegalArgumentException("No data found");
        }
        List<String> faults =new ArrayList<>();
        for (String line: lines){
            String[] linePart=line.split(",");
            int lineNumber =readLineNumber(linePart[0]);
            if(lineNumber!=1){
                ProcessingResult processingResult = processingResult(linePart);
                if(processingResult != ProcessingResult.NO_ERROR){
                    faults.add(result(lineNumber, processingResult.getCode()));
                }
            }
        } return faults;
    }

    private int readLineNumber(String linePart){
        try {
            return Integer.parseInt(linePart);
        } catch (NumberFormatException ne){
            return ProcessingResult.COMMENT.getCode();
        }
    }

    private ProcessingResult processingResult(String[] linePart){
        if(linePart.length!=3){
            return ProcessingResult.WORD_COUNT_ERROR;
        }

        if(!isValueValid(linePart[1]) && !isDateValid(linePart[2])){
            return ProcessingResult.VALUE_AND_DATE_ERROR;
        }
        if(!isValueValid(linePart[1])){
            return ProcessingResult.VALUE_ERROR;
        }
        if(!isDateValid(linePart[2])){
            return ProcessingResult.DATE_ERROR;
        }
        return ProcessingResult.NO_ERROR;
    }

    private boolean isValueValid (String linePart){
        try {
            Double.parseDouble(linePart);
            return true;
        } catch (NumberFormatException ne){
            return false;
        }
    }

    private boolean isDateValid(String linePart){
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.");
            dateFormat.parse(linePart);
            return true;
        } catch (ParseException pe){
            return false;
        }
    }

    private String result(int lineNumber, int resultCode){
        return lineNumber + "," + resultCode;
    }
}
