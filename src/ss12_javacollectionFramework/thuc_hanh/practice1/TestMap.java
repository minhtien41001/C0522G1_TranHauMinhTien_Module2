package ss12_javacollectionFramework.thuc_hanh.practice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Chí Bảo",21);
        hashMap.put("Minh Tiến",21);
        hashMap.put("Đại Lợi",25);
        hashMap.put("Thủy Tiên",22);
        hashMap.put("Quang Anh",27);
        hashMap.put("Văn Tý",22);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("Chí Bảo",21);
        linkedHashMap.put("Minh Tiến",21);
        linkedHashMap.put("Đại Lợi",25);
        linkedHashMap.put("Thủy Tiên",22);
        linkedHashMap.put("Quang Anh",27);
        linkedHashMap.put("Văn Tý",22);
        System.out.println("\nThe age for" + "Minh Tiến" + linkedHashMap.get("Minh Tiến"));
    }
}
