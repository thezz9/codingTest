import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = Collections.max(map.values());
        List<Integer> li = map.entrySet().stream()
            .filter(e -> e.getValue() == max)
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.toList());

        Arrays.sort(arr);

        int mode = li.size() > 1 ? li.get(1) : li.get(0);
        int median = arr[n / 2];
        int avg = Math.round((float)sum / n);
        int range = arr[n - 1] - arr[0];

        bw.write(String.format("%d\n%d\n%d\n%d", avg, median, mode, range));
        bw.flush();
    }
}