package ru.gmail.gasimov.model;


import java.util.Arrays;

public class ArrayClass {
    private int[] array;

    public ArrayClass(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }


    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ArrayClass)) {
            return false;
        }
        ArrayClass intArrayToCompare = (ArrayClass) object;
        return Arrays.equals(array, intArrayToCompare.getArray());
    }

    @Override
    public int hashCode() {
        if (array == null) {
            return 0;
        }
        int result = 1;
        for (int element : array) {
            result = 31 * result + element;
        }
        return result;
    }
}
