public class AsciiCharSequence implements CharSequence {
    byte[] bytes;
    AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public String toString() {
        return new String(bytes);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] charSequence = new byte[end - start];
        for (int i = start; i < end; ++i){
            charSequence[i - start] = this.bytes[i];
        }
        return new AsciiCharSequence(charSequence);
    }

}
