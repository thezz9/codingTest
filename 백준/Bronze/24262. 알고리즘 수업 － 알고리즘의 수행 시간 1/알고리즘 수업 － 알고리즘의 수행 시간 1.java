import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(1));
        bw.newLine();
        bw.write(Integer.toString(0));
        bw.flush();
    }
}