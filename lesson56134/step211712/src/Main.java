import java.util.Map;

class Main {
    public static Map<String, String> mapShare(Map<String, String> map) {
//        for (Map.Entry<String, String> item : map.entrySet()){
//            if(item.getKey().equals("c")){
//
//            }
//        }
        map.remove("c");
        if (!map.get("a").isEmpty()) map.put("b", map.get("a"));
        return map;
    }
}