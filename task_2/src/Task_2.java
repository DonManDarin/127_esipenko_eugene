public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int i = 0;
        while (i*i<=num ){
            i++;
        }
        i--;
        return i*i;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        int p_previous = 1;
        int p_num = 1;
        while (num>0){
            p_num = 2*p_previous + 6;
            p_previous = p_num;
            num--;
        }
        return p_num;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        //Найти элемент последовательности с номером num
        // Проверить, является ли число num натуральной степенью числа base
        /*
        int memory=base;
        while (base<num){
            base*=memory;
        }
        if (base==num)
            return true;
        else return false;
        */
        if (base == 1 && num == 1)
            return true;
        while (num % base == 0)
            num/=base;
        if (num==1)
            return true;
        else return false;
    }


    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int counter=0;
        while (start!=end){
            if(start%2==0 && start/2>end)
                start/=2;
            else start--;
            counter++;
        }
        return counter;
    }
}
