package week12d01;

public class GradeRounder {

    public int[] roundGrades(int[] grades){

        for(int i = 0; i< grades.length; i++){
            if(grades[i]>=40){
                int divide = grades[i] / 5;
                int next = (divide+1) * 5;

                if(next-grades[i]<3){
                    grades[i]=next;
                }
            }
        }
        return grades;
    }

    public int[] roundGrades2(int[] grades){
        int i=0;
        for (int grade:grades){
            if (grade>39 && grade%5>=3){
                    grades[i]=grade/5*5+5;
                }
            i++;
            }
        return grades;
    }

    public int[] roundGrades3(int[] grades){
        int[] result = new int[grades.length];

        for(int i=0; i< result.length; i++){
            if (grades[i]>=40 && grades[i]%5>=3){
                result[i] = grades[i]/5*5+5;
            } else result[i]=grades[i];
        }
        return result;
    }

}

