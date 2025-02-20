package ModulTwo;

public class ChangeBit {
    public static int flipBit(int value, int bitIndex) {
        String number = Integer.toBinaryString(value);
        char bitToFlip = number.charAt(bitIndex);
        if (bitToFlip == 1){
            bitToFlip = 0;
        } bitToFlip =1;
        String newNum = number. replace(number.charAt(bitIndex),bitToFlip);
        value = Integer.parseInt(newNum, 2);
        return value; // put your implementation here
    }
}
