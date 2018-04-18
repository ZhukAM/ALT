class Composite{
    public static boolean isComposite(long number) {
        for (int i = 1; i < number; ++i){
            if (number%i == 0 && i != 1) return true;
        }
        return false;
    }
}