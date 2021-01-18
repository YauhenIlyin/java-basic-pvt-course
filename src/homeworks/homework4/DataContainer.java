package homeworks.homework4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<DATA_TYPE> implements Iterable<DATA_TYPE> {
    private DATA_TYPE[] data;
    private int firstFreeIndex;
    private int lengthOfData;

    public DataContainer(DATA_TYPE[] data) {
        this.data = data;
        lengthOfData = this.data.length;
        if (lengthOfData < 2) {
            lengthAndIndexChecking(data); //если свободного индекса не будет, метод его подготовит
        }
    }

    public void lengthAndIndexChecking(DATA_TYPE[] data) { //если нет свободного индекса - создает
        boolean haveFreeIndex = false;
        for (int i = firstFreeIndex; i < lengthOfData; i++) { //проверяем есть ли свободный индекс
            if (data[i] == null) {  //если находим свободный существующий индекс устанавливаем на него
                firstFreeIndex = i;
                haveFreeIndex = true;
                break;
            }
        }
        if (!haveFreeIndex) { //если индекса нет, то увеличиваем размер массива в 1.8 раза
            data = Arrays.copyOf(data, (int) (lengthOfData + 1)); //увеличиваем размер только на 1 в связи с 4.2.1
            firstFreeIndex = lengthOfData;
            lengthOfData = data.length;
        }
    }

    public int add(DATA_TYPE item) {
        if (item == null) {
            return -1;
        } else {
            lengthAndIndexChecking(data);
            data[firstFreeIndex] = item;
            firstFreeIndex++;
            return firstFreeIndex - 1;
        }
    }

    public DATA_TYPE get(int index) {
        if (index >= lengthOfData) {
            System.out.println("get() method: incorrect index number, return null... ");
            return null;
        } else {
            return data[index];
        }
    }

    public DATA_TYPE[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if (index >= lengthOfData) {
            System.out.println("incorrect index ");
            return false;
        } else {
            DATA_TYPE[] temporaryArray = Arrays.copyOf(data, lengthOfData - 1);
            for (int i = 0, j = 0; i < temporaryArray.length; i++, j++) {
                if (j == index) {
                    i--; //создаем расхождение в 1 элемент между индексами
                } else {
                    temporaryArray[i] = data[j];
                }
            }
            data = temporaryArray;
            return true;
        }
    }

    public void sort(Comparator<DATA_TYPE> comparator) {
        boolean isSorted = false;
        DATA_TYPE value;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (comparator.compare(data[i], data[i + 1]) > 0) {
                    value = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = value;
                    isSorted = false;
                }
            }
        }
    }

    public boolean delete(DATA_TYPE item) {
        for (int i = 0; i < lengthOfData; i++) {
            if (item.equals(data[i])) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    public static <DATA_TYPE> void sort(DataContainer<DATA_TYPE> container, Comparator<DATA_TYPE> comparator) {
        boolean isSorted = false;
        DATA_TYPE[] data = container.getData();
        DATA_TYPE value;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < data.length - 1; i++) {
                if (comparator.compare(data[i], data[i + 1]) > 0) {
                    value = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = value;
                    isSorted = false;
                }
            }
        }
    }

    public DATA_TYPE[] getData() {
        return data;
    }

    @Override
    public String toString() {
        if (data.length == 0) {
            return "[]";
        } else {
            String str = "[";
            for (int i = 0; i < data.length; i++) {
                if (data[i] != null) {
                    if (i != 0) {
                        str = str + ",";
                    }
                    str = str + data[i];
                }
            }
            return str + "]";
        }
    }

    public static <DATA_TYPE> void sort(DataContainer<? extends Comparable> container) {
        boolean isSorted = false;
        DATA_TYPE[] data = (DATA_TYPE[]) container.getData();
        DATA_TYPE value;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < container.data.length - 1; i++) {
                if (container.data[i].compareTo(container.data[i + 1]) > 0) {
                    value = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = value;
                    isSorted = false;
                }
            }
        }
    }

    @Override
    public Iterator<DATA_TYPE> iterator() {
        return new Iterator<DATA_TYPE>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                if (index < lengthOfData) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public DATA_TYPE next() {
                index++;
                if (index < lengthOfData + 1) {
                    return data[index - 1];
                } else {
                    return null;
                }
            }

            @Override
            public void remove() {
                delete(index);
            }
        };
    }

}
