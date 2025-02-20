package ModulThree;

public class AsciiCharSequence implements CharSequence {
    private final byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
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
    public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] subByte = new byte[length];
        for (int i = 0, j = start; i < length; i++, j++) {
            subByte[i] = bytes[j];
        }
        return new AsciiCharSequence(subByte);
    }

    @Override
    public String toString() {
        return new String(bytes);
    }


    public AsciiCharSequence subSequence(int start) {
        return (AsciiCharSequence) subSequence(start, bytes.length);
    }

    public AsciiCharSequence concat(CharSequence second) {
        byte[] newArray = new byte[this.bytes.length + second.length()];
        System.arraycopy(this.bytes, 0, newArray, 0, this.bytes.length);
        for (int i = 0; i < second.length(); i++) {
            newArray[i + this.bytes.length] = (byte) second.charAt(i);
        }
        return new AsciiCharSequence(newArray);
    }

    public AsciiCharSequence delete(int from, int to) {
        return ((AsciiCharSequence) subSequence(0, from)).concat(subSequence(to));
    }

}
