public class MyArrayList {

    private int size;
    private int capacity;
    private int[] array;

    public MyArrayList() {
        this.size = 0;
        this.capacity = 10;
        this.array = new int[capacity];
    }

    public MyArrayList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public boolean add(int value) {
               /*
        if (size != capacity) {
            array[size] = value;
            size++;
            return true;
        } else if (size == capacity) {
            capacity = ((capacity * 3) / 2) + 1;
            int[] array = new int[capacity];
            System.arraycopy(this.array, 0, array, 0, size);
            this.array = array;
            array[size] = value;
            size++;
            return true;
        } else {
            return false;
        }
        */
        if (size == capacity) {
            capacity = ((capacity * 3) / 2) + 1;
            int[] array = new int[capacity];
            System.arraycopy(this.array, 0, array, 0, size);
            this.array = array;
            array[size] = value;
        } else {
            array[size] = value;
        }
        size++;
        return true;
    }

    public boolean add(int value, int index) {
        if (index < 0) {
            return false;
        }
        array[index] = value;
        return true;
    }

    public int get(int index) {
        if (index < 0 || index > this.capacity) {
            throw new ArrayIndexOutOfBoundsException(index + " out of bounds");
        }
        return this.array[index];
    }

    public boolean delete(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j+1];
                }
                size--;
                return true;
            }
        }
        System.out.println("Этого числа нет в массиве");
        return false;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }


    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("Array [" + i + "] = " + array[i]);
        }
        System.out.println("Capacity = " + capacity);
        System.out.println("Size = " + size);
    }
}
