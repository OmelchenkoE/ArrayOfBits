public interface BitArray {
    /**
     * Sets bit to 1 at given index
     */
    void setBit(long index);

    /**
     * Returns true if bit is 1 at given index, false otherwise
     */
    boolean isBitSet(long index);

    /**
     * Returns number of bits that are set to 1
     */
    long getBitCount();

    /**
     * Returns total amount of bits
     * @return
     */
    long size();
}