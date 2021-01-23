package exceptionmulticatch.trainer;

public class TrainerParser {

    public Trainer parse(String line){
        try {
            String[] fields = line.split(";");
            return new Trainer(fields[0], Integer.parseInt(fields[1]));
        } catch (NullPointerException | IllegalArgumentException | IndexOutOfBoundsException e){
            throw new ParserException("Invalid line: " + line, e);
        }
    }

}
