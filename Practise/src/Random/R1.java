package Random;

public class R1 {
    public static void main(String[] args) {
        byte byteValue = (byte)400; // Replace 42 with your desired byte value
        long longValue = convertByteToLong(byteValue);
        System.out.println("Converted long value: " + longValue);
    }

    // Method to convert byte to long
    public static long convertByteToLong(byte byteValue) {
        // Use bitwise AND with 0xFF to convert the signed byte to an unsigned int
        // Then cast it to long to get the final long value
        return (long) (byteValue & 0xFF);
    }
}

