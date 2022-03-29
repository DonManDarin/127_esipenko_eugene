import org.junit.*;
public class Task2_Tests extends Assert{

    @Test
    public void BubbleSort_TryToSort () {
        BubbleSort<Integer> sorter = new BubbleSort<>();

        MyComparator comparator = new MyComparator() {
            @Override
            public int compare(Object first, Object second) {
                return 0;
            }
        };

        Integer[] myArray = {1,2,3};
        sorter.sort(myArray, comparator);
        assertArrayEquals(new Integer[]{1,2,3}, myArray);
    }

    class Comparator implements MyComparator<Integer>{

        @Override
        public int compare(Integer first, Integer second){
            return first - second;
        }
    }

    @Test
    public void BubbleSort_TryToSortDifferentNumbers(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 1, 3};
        sorter.sort(myArray, new Comparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    @Test
    public void BubbleSort_TryToSortLongerArrayWithDifferentNumbers(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 1, 3, 5, 7};
        sorter.sort(myArray, new Comparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 7}, myArray);
    }

    @Test
    public void BubbleSort_TryToCompareTheSameArrays(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 2, 2, 2};
        sorter.sort(myArray, new Comparator());
        assertArrayEquals(new Integer[]{2, 2, 2, 2}, myArray);
    }

    @Test
    public void BubbleSort_TryToCompareSmallArrays(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2};
        sorter.sort(myArray, new Comparator());
        assertArrayEquals(new Integer[]{2}, myArray);
    }

    @Test
    public void InsertionSort_TryToCompareTheSameArrays(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new Comparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    @Test
    public void InsertionSort_TryToCompareSmallArrays(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1};
        sorter.sort(myArray, new Comparator());
        assertArrayEquals(new Integer[]{1}, myArray);
    }

    @Test
    public void InsertionSort_TryToSortDifferentNumbers(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 5, 2, 6};
        sorter.sort(myArray, new Comparator());
        assertArrayEquals(new Integer[]{1, 2, 5, 6}, myArray);
    }

}
