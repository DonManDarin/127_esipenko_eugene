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
}
