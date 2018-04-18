//class Reversing{
    private static String[] reverse(String... words) {
       String[] str = new String[words.length];
       for (int i = words.length -1; i >= 0; --i){
           str[words.length - i - 1] = words[i];
       }
       return str;
    }
//}