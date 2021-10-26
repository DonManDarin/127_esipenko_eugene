public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно
        int counter = 0;
        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                if (i % a == 0 && i % b != 0)
                    counter++;
            }
        } else {
            for (int i = n1; i >= n2; i--) {
                if (i % a == 0 && i % b != 0)
                    counter++;
            }
        }
        return counter;
    }

    @Override
    public int subtask_2_for(int num) {
        // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num
        int a_num=0;
        for (int i = 0, a_cur=1, rep = 0; i<num; i++){
            a_num=a_cur;
            rep++;
            if (rep==a_cur){
                a_cur+=1;
                rep=0;
            }
        }
        return a_num;

        /*String s = "";
        for(int i = 1; s.length() < num; i++){
            s += Integer.toString(i).repeat(i);
        }
        String last = s.substring(s.length()-1);
        int i = Integer.parseInt (last);
        return i;*/

    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        // Дана последовательность
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности

/*      int [] a = new int[cnt];
        int counter = a[0] = num;
        for (int i=1; i<a.length; i++) {
            a[i] = a[i - 1] * d + 1;
            counter+=a[i];
        }
        return counter;*/

        int sum = num;
        int a_previous = num;
        int a_cnt;
        for (int i = cnt; i>1;i--){
            a_cnt = a_previous * d + 1;
            a_previous = a_cnt;
            sum+=a_cnt;
        }
        return sum;
    }

    @Override
    public int subtask_4_for(int n) {
        // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)

        int sum = 0;
        for (int i=1; i<=n; i++)
            sum+=fact(i);
        return sum;
    }

    public long fact(int n){
        if (n==1)
            return 1;
        return n*fact(n-1);
    }

/*        int sum = 0;
        int []array = new int [n];
        for (int i = 0; i < array.length;i++) {
            array[i]=1;

            for (int k = 0; k <= i; k++)
                array[i] *= (k+1);

            sum+=array[i];
        }
        return sum;
    }*/

}
