package DSA;

public class QuestionThree {
    public static void main(String[] args) {
        int[] chocolates = {16, 4, 1};

        int[] students = new int[5];


        for (int chocolatePacket : chocolates) {

            int numberOfChocolates = chocolatePacket;
            int studentId = 0;

            for (int i = 1; i <= chocolatePacket; i++) {
                if (numberOfChocolates > 0) {
                    students[studentId]++;

                    if (studentId != students.length - 1) {
                        studentId++;
                    } else studentId = 0;
                    numberOfChocolates--;
                }
            }
        }

        for (int student : students) {
            System.out.print(student + " ");
        }
    }
}
