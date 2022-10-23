import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "abadaf";
        String[] list = string.split("");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < list.length; i++) {
            String key = list[i].toUpperCase();
            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                map.put(key, (map.get(key)) + 1);
            }
        }
        System.out.println(map);
    }
}