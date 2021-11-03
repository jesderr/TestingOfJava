import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyArrayListTests {

    private MyArrayList list;
    private MyLinkedList list1;

    @Test
    public void addByIndexTestInArrayList() {
        this.list = new MyArrayList();

        this.list.add(100, 5);

        int expected = 100;
        int actual = this.list.get(5);

        Assertions.assertEquals(expected, actual);

        this.list.add(20, 2);
        expected = 20;
        actual = this.list.get(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAddValueWhenIndexIsNegativeInArrayList() {
        this.list = new MyArrayList();

        int value = 100;
        int negativeIndex = -23;

        boolean isAdd = this.list.add(value, negativeIndex);
        Assertions.assertFalse(isAdd);
    }

    @Test
    public void shouldThrowExceptionWhenIndexIsNegativeInArrayList() {
        this.list = new MyArrayList();

        int negativeIndex = -23;

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            this.list.get(negativeIndex);
        });
    }

    @Test
    public void indexShouldNotBiggerThanCapacityInArrayList() {
        this.list = new MyArrayList();

        int indexWhichBiggerThanCapacity = 17;

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                this.list.get(indexWhichBiggerThanCapacity));
    }

    @Test
    public void shouldAddItemByIndexSuccessfullyInArrayList() {
        this.list = new MyArrayList();

        int value = 100;
        int index = 2;

        boolean isAdd = this.list.add(value, index);

        Assertions.assertTrue(isAdd);

        int actualResult = this.list.get(index);

        Assertions.assertEquals(value,actualResult);

    }

    @Test
    public void shouldReturnFalseOnDeleteInArrayList() {
        this.list = new MyArrayList();

        int value = 100;

        list.add(12);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);

        boolean isDeleted = list.delete(value);

        Assertions.assertFalse(isDeleted);
    }

    @Test
    public void shouldReturnTrueInDeleteInArrayList() {
        this.list = new MyArrayList();

        int value = 12;

        list.add(12);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);

        boolean isDeleted = list.delete(value);

        Assertions.assertTrue(isDeleted);

        boolean containsValue = this.list.contains(value);

        Assertions.assertFalse(containsValue);

    }

    @Test
    public void shouldReturnTrueForContainsInArrayList() {
        this.list = new MyArrayList();

        int value = 12;

        list.add(12);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);

        boolean isContain = list.contains(value);

        Assertions.assertTrue(isContain);
    }

    @Test
    public void shouldReturnFalseForContainsInArrayList() {
        this.list = new MyArrayList();

        int value = 100;

        list.add(12);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);

        boolean isContain = list.contains(value);

        Assertions.assertFalse(isContain);
    }

    @Test
    public void shouldReturnTrueIfAddedInLinkedList(){
        this.list1 = new MyLinkedList();

        list1.add(1);

        boolean isContain = list1.contains(1);

        Assertions.assertTrue(isContain);
    }

    @Test
    public void shouldReturnTrueOnDeleteInLinkedList(){
        this.list1 = new MyLinkedList();
        int value = 4;

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        boolean isContain = list1.delete(value);

        Assertions.assertTrue(isContain);

        boolean containsValue = list1.contains(value);

        Assertions.assertFalse(containsValue);
    }

    @Test
    public void shouldReturnFalseOnDeleteInLinkedList(){
        this.list1 = new MyLinkedList();

        int value = 100;

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        boolean isContain = list1.delete(value);

        Assertions.assertFalse(isContain);
    }

    @Test
    public void shouldReturnTrueForContainsInLinkedList(){
        this.list1 = new MyLinkedList();

        int value = 0;

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        boolean isContain = list1.contains(value);

        Assertions.assertTrue(isContain);
    }

    @Test
    public void shouldReturnFalseForContainsInLinkedList(){
        this.list1 = new MyLinkedList();

        int value = 100;

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        boolean isContain = list1.contains(value);

        Assertions.assertFalse(isContain);
    }
}
