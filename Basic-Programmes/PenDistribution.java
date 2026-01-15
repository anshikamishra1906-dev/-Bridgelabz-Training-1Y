public class PenDistribution{
    public static void main(String[] args){
	int total_pens = 14;
	int total_students = 3;
	int pen_per_student = 14 / 3;
	int pen_notdistributed = 14 % 3;
	System.out.println("The Pen Per Student is " + pen_per_student + " and the remaining pen not distributed is " + pen_notdistributed);
	}
}