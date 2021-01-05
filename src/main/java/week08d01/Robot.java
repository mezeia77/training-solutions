package week08d01;

public class Robot {

    public int[] move(String data){

        int[] position = new int[2];

        for(int i = 0; i<data.length(); i++){

//            if(data.toUpperCase().charAt(i)<'A' || data.toUpperCase().charAt(i)>'Z'){
//                throw new IllegalArgumentException("Only characters accepted");
//            }

            switch (data.toUpperCase().charAt(i)){
                case 'F': position[0]++; break;
                case 'L': position[0]--; break;
                case 'B': position[1]++; break;
                case 'J': position[1]--; break;
                default: throw new IllegalArgumentException("Only characters accepted");
            }
        }
        return position;
    }
}
