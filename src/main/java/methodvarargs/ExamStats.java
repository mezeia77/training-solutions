package methodvarargs;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){

        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        int number = 0;
        for (int i : results){
            if (i>limitInPercent){
                number++;
            }
        } return number;

    }
    public boolean hasAnyFailed(int limitInPercent, int... results){

        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        for (int i : results){
            if (i<limitInPercent){
                return true;
            }
        } return false;
    }

}
