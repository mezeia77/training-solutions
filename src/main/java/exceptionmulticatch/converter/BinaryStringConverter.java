package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String data) {
        if (data == null || data.isEmpty()) {
            throw new InvalidBinaryStringException("Empty file");
        }

        boolean[] result = new boolean[data.length()];

        for(int i = 0; i<=data.length()-1; i++){
            char digit = data.charAt(i);
            if(digit!='0' && digit!='1'){
                throw new InvalidBinaryStringException("Only 0-1 allowed");
            }

            if(digit=='0'){
                result[i] = false;
            } else {
                result[i] = true;
            }
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] data){
        if(data==null){
            throw new NullPointerException("File is Null");
        }
        if(data.length==0){
            throw new IllegalArgumentException("Empty file");
        }
        String result="";
        for (int i = 0; i< data.length; i++){
            if(data[i]){
                result += "1";
            } else {
                result +="0";
            }
        } return result;
    }

}
