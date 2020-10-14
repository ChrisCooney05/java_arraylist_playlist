import java.util.Arrays;

public class Classroom {
    public static void main(String[] args){
        //array is set with 4 strings, can't be made longer
        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        //empty array is made with a max length of 4
        double[] mathScores = new double[4];
        mathScores[0] = 94.2;
        mathScores[1] = 82.5;
        mathScores[3] = 90.1;
        mathScores[2] = 76.8;
        //we need to use Arrays.toString() or we get a point in memory over context
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(mathScores));
        System.out.println("The number of students in the class is " + students.length);
    }
}
