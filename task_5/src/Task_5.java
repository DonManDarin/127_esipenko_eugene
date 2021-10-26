import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;


public class Task_5 implements Task_5_base {
    @Override

    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        ArrayList<Integer> my_list = new ArrayList<>(data);
        my_list.removeIf(integer -> ((integer % k != 0) || (integer % n == 0)));
        return my_list;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0, cur = 1, pos = 0; i < size; i++) {
            list.add(cur);
            pos++;
            if (pos == cur) {
                cur += 1;
                pos = 0;
            }
        }
        return list;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите пересечение множеств s1 и s2
        HashSet<Integer> temp = new HashSet<>(s2);
        temp.removeAll(s1);
        HashSet<Integer> s3 = new HashSet<>(s2);
        s3.removeAll(temp);
        temp.clear();
        return s3;

        /*HashSet<Integer> s3 = new HashSet<>();
        for (Integer integer1 : s1)
            for (Integer integer2 : s2)
                if (Objects.equals(integer1,integer2))
                    s3.add(integer1);
        return s3;*/
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите объединение множеств s1 и s2
        HashSet<Integer> s3 = new HashSet<>(s1);
        s3.addAll(s2);
        return s3;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите дополнение множества s1 до множества s2
        HashSet<Integer> s3 = new HashSet<>(s2);
        s3.removeAll(s1);
        return s3;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        HashSet<Integer> temp = new HashSet<>(s1);
        temp.removeAll(s2);
        HashSet<Integer> s3 = new HashSet<>(s2);
        s3.removeAll(s1);
        s3.addAll(temp);
        temp.clear();
        return s3;
    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        HashMap<String, Double> map = new HashMap<>();
        float size = data.size();
        double start_percent = 100 / size;
        for (int i = 0, repeat = 0; i < data.size(); i++) {
            if (!map.containsKey(data.get(i))) {
                for (int j = i; j < data.size(); j++) {
                    if (Objects.equals(data.get(i), data.get(j))) {
                        repeat++;
                    }
                }
                map.put(data.get(i), start_percent * repeat);
                repeat = 0;
            }
        }
        return map;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно

        double max = data.get(0), min = data.get(0), mean = 0, size = data.size();

        HashMap<String, Double> map = new HashMap<>();
        for (Double datum: data){
            mean+=datum;
            if (datum>max)
                max=datum;
            else if (datum<min)
                min=datum;
        }

        map.put("mean",mean/size);
        map.put("max",max);
        map.put("min",min);
        return map;
    }

        /* double mean = 0, size = data.size();
        ArrayList<Double> data_copy = new ArrayList<>(data);
        HashMap<String, Double> map = new HashMap<>();
        data_copy.sort(Task_5::comparator);
        for (Double datum : data) {
            mean += datum;
        }
        map.put("mean", mean/size);
        map.put("max", data_copy.get(data_copy.size()-1));
        map.put("min", data_copy.get(0));

        data_copy.clear();
        return map;
    }
    public static int comparator(Double double1, Double double2){
        if (Math.abs(double1 - double2)< 0.0000001) return 0;
        if (double1 < double2) return -1;
        else return 1;
    }*/

}