import java.util.ArrayList;
import java.util.List;

public class RoundedGrades {
    public static void main(String[] args) {
        List<Integer> grades;

        grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> result = grades(grades);
        System.out.println(result);
    }


    public static List<Integer> grades(List<Integer> grade) {
        for (int i = 0; i < grade.size(); i++) {
            int item = grade.get(i);

            if (item < 38) {
                continue;
            }

            int remainder = item % 5;
            if (remainder >= 3) {
                grade.set(i, item + (5 - remainder)); // update element of index i
            }
        }
        return grade;
    }
}
