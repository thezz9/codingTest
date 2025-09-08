import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Double> map = new HashMap<>();
        
        String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        
        double sum1 = 0, sum2 = 0, maxScore = 4.5;
        for (String grade : grades) {
            if (grade.equals("F")) {
                map.put(grade, 0.0);
            } else {
                map.put(grade, maxScore);
                maxScore -= 0.5;
            }
        }

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                sum1 += score * map.get(grade);
                sum2 += score;
            }
        }

        bw.write(String.format("%.6f", sum1 / sum2));
        bw.flush();
    }
}