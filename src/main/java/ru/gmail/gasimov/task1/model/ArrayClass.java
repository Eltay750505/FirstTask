package ru.gmail.gasimov.task1.model;


import java.util.Arrays;

public class ArrayClass {
    private int[] array;

    public ArrayClass() {
    }

    public ArrayClass(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
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
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        if (!(object instanceof ArrayClass)) {
            return false;
        }
        ArrayClass intArrayToCompare = (ArrayClass) object;
        return Arrays.equals(this.array, intArrayToCompare.getArray());
    }

    @Override
    public int hashCode() {
        if (this.array == null) {
            return 0;
        }
        int result = 1;
        for (int element : this.array) {
            result = 31 * result + element;
        }
        return result;
    }
}
