interface Returner {

    public String returnString();
    public int returnInt();
}
class Anonym {
    String str;
    int number;
    Returner returner = new Returner() {
        @Override
        public String returnString() {
            return str;
        }

        @Override
        public int returnInt() {
            return number;
        }
    };
}