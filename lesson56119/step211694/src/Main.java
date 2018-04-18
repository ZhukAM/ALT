
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split("\\s");
        LinkedList<Integer> ll = new LinkedList<>();
        Arrays.asList(str).stream().forEach(x -> ll.addFirst(Integer.valueOf(x)));
        ll.stream().skip(3).sorted().forEachOrdered(System.out::println);
    }




