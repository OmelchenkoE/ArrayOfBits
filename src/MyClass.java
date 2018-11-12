public class MyClass implements BitArray {
    private static long number = 1L;
    private static long n = 0L;
    private static final int LONGSIZE = 64;
    private static long bitSize;

    public static void main(String[] args) {
        MyClass myClass = new MyClass(64);
        myClass.setBit(1);
        myClass.setBit(3);
        myClass.setBit(4);
        System.out.println(Long.toBinaryString(n) + "\n" + n);
        System.out.println(myClass.getBitCount());
        System.out.println(myClass.size());
    }

    MyClass(long bitSize) {
        this.bitSize = bitSize;
    }

    @Override
    public void setBit(long index) {
        n = n | (number << (63 - index));
    }

    @Override
    public boolean isBitSet(long index) {
        long resultLong = 1L << (63 - index) & n;
        System.out.println(Long.toBinaryString(resultLong));
        return (resultLong != 0L);
    }

    @Override
    public long getBitCount() {
        long bitCount = 0L;
        for (int i = 0; i < 64; i++) {
            long resultLong = number << (63 - i) & n;
            if (resultLong != 0L) {
                bitCount++;
            } else {}
        }
        return bitCount;
    }

    @Override
    public long size() {
        return bitSize;//(bitSize - 1) / LONGSIZE + 1;
    }
}
