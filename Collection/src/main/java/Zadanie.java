import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.*;


public class Zadanie {
    Scanner file;
    ArrayList list = new ArrayList();


    public void openFile() {
        try {
            file = new Scanner(new File("Zadanie.txt"));
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
    }

    public void readFile() {
        while (file.hasNext()) {
            String word = file.next();
            list.add(word);
        }
    }

    public void outFile() {
        System.out.println("В файле есть слова: " + list);

    }

    public void getZadanie() {
        Set<String> sortedSet = new TreeSet<String>();
        Map<String, Integer> statistic = new HashMap<String, Integer>();
        // Преобразуем массив для сортировки записей.
        int nul = 0;
        String peremennay;
        String max[];
        max = new String[1];

        for (int i = 0; i < list.size(); i++) {
            peremennay = (String) list.get(i);
            sortedSet.add(peremennay);

            Integer count = statistic.get(peremennay);
            if (count == null) {
                count = 0;
            }

            statistic.put(peremennay, ++count);

            if (count > nul) {
                nul = count;
                max[0] = peremennay;

            }

        }

        System.out.println("Сортировка: " + sortedSet);
        System.out.println("Подсчет слов: " + statistic);
        System.out.println("Наибольшее: " + max[0] + " Колличество повторений = " + nul);


    }


}