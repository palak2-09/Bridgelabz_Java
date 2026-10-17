package Level1;

public class AverageMarks {
    public static void main(String[] args){
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalSubjects = 3;
        int maximumMarks = 100;

        int totalMarks=mathsMarks+physicsMarks+chemistryMarks;
        double averagePercentage=(double)totalMarks/(totalSubjects*maximumMarks)*100;
        System.out.println("Sam's average mark in PCM is "+averagePercentage);
    }
}
