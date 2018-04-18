public class Main {

    public static void main(String[] args) {
        int count = 0;
        Secret[] secret = Secret.values();
        for (Secret sec : secret) {
            if (sec.name().startsWith("STAR")) count++;
        }
        System.out.println(count);
    }
}

//enum Secret {
//    STAR, CRASH // ...
//}
