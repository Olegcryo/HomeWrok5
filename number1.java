/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class number1{
    
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: ((Entry<String, ArrayList<Integer>>) item).getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Пупкин", 880055535, bookPhone);
        addNumber("Пупкин", 880155636, bookPhone);
        addNumber("Святов", 790232451, bookPhone);
        addNumber("Козлов", 79023414, bookPhone);
        addNumber("Козлов", 821311331, bookPhone);
        addNumber("Абрамович", 89034224, bookPhone);
        printBook(bookPhone);
       }
}