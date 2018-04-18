//import java.util.Map;
//import java.util.SortedMap;
//import java.util.TreeMap;

//class Main{
    public static SortedMap<String, Integer> wordCount(String[] strings) {      SortedMap<String, Integer> sortedMap = new TreeMap<>();
         for(int i = 0; i < strings.length; ++i){
             if (sortedMap.containsKey(strings[i])){
                 sortedMap.put(strings[i], sortedMap.get(strings[i]) + 1);
             }
             else
                 sortedMap.put(strings[i], 1);

         }
        return sortedMap;
   }
    public static void printMap(Map<String, Integer> map) {
      for (Map.Entry<String, Integer> item :map.entrySet()){
          System.out.println(item.getKey()+ " " + ":" + " " + item.getValue());
      }
    }
//}