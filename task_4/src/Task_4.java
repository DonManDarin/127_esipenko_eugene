public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        int[] array = new int[size];
        array[0] = a0;
        for (int i = 1; i < array.length; i++)
            array[i] = array[i - 1] + d;
        return array;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == 1)
                array[i] = 1;
            else {
                for (int j = 0; j < i; j++)
                    array[i] += array[j];
            }
        }
        return array;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        int[] Fibonacci = new int[size];
        Fibonacci[0] = 0;
        for (int i = 1; i < size; i++) {
            if (i == 1)
                Fibonacci[1] = 1;
            else
                Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
        }
        return Fibonacci;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        int max = data[0];
        for (int datum : data)
            if (datum >= max)
                max = datum;
        return max;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int max = -2147483648;
        for (int datum : data)
            if (datum >= max && datum % k == 0)
                max = datum;
        return max;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.

        int[] arr3 = new int[arr1.length + arr2.length];
        int temp;
        for (int i = 0; i < arr1.length; i++)
            arr3[i] = arr1[i];

        for (int i = arr1.length, j = 0; i < arr3.length; i++, j++)
            arr3[i] = arr2[j];

        for (int i = 0; i < arr3.length - 1; i++)
            for (int j = i + 1; j < arr3.length; j++)
                if (arr3[j] < arr3[i]) {
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
        return arr3;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению

        int l_1 = arr1.length;
        int l_2 = arr2.length;

        int [] arr3 = new int[l_1 + l_2];
        int i = 0, j = 0, k = 0;
         for (;i<l_1 && j<l_2; k++)
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            for (; j < l_2; j++, k++)
                arr3[k] = arr2[j];

            for (; i < l_1; i++, k++)
                arr3[k] = arr1[i];

        return arr3;
    }
}
