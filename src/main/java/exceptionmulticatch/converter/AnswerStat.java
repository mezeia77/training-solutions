package exceptionmulticatch.converter;

import java.util.logging.Logger;

public class AnswerStat {

//    private static final Logger LOGGER =Logger.getLogger(AnswerStat.class);
    private BinaryStringConverter bsc;

    public AnswerStat(BinaryStringConverter bsc) {
        this.bsc = bsc;
    }

    public int answerTruePercent(String answers){
        boolean[] booleans = convert(answers);
        int trueQuantity=0;
        for (int i = 0; i< booleans.length; i++){
            if(booleans[i]){
                trueQuantity++;
            }
        } return (int) Math.round((double) trueQuantity / booleans.length*100);
    }

    public boolean[] convert(String checkBoxes){
        try {
            return bsc.binaryStringToBooleanArray(checkBoxes);
        } catch (NullPointerException | IllegalArgumentException exception){
            throw new InvalidBinaryStringException("" + exception);
        }
    }
}
