package ToyShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.io.FileWriter;

import ToyShop.Toys;

public class Main {
    
    public static void main(String[] args) {
    ArrayList<Integer> idToys = new ArrayList<>();
    ArrayList<Integer> frequencyToys = new ArrayList<>();
    ArrayList<String> nameToys = new ArrayList<>(); 
    Queue<String> listOfToys = new PriorityQueue<String>(10);
    HashMap<Integer, String> PriseToys = new HashMap<>();
    Toys toy = new Toys(0,0,"");
    toy.set("1 1 конструктор");
    idToys.add(toy.getId());
    frequencyToys.add(toy.getFrequency());
    nameToys.add(toy.getName());
    PriseToys.put(toy.getFrequency(),toy.getToy());
    listOfToys.add(toy.getToy());
    toy.set("2 2 робот");
    idToys.add(toy.getId());
    frequencyToys.add(toy.getFrequency());
    nameToys.add(toy.getName());
    PriseToys.put(toy.getFrequency(),toy.getToy());
    listOfToys.add(toy.getToy());
    toy.set("3 6 кукла");
    idToys.add(toy.getId());
    frequencyToys.add(toy.getFrequency());
    nameToys.add(toy.getName());
    PriseToys.put(toy.getFrequency(),toy.getToy());
    listOfToys.add(toy.getToy());
    System.out.println(listOfToys);
    System.out.println(toy.getToy());
    TreeMap<Integer,String> treeMap = new TreeMap<>();
    treeMap.putAll(PriseToys);
    //for (Map.Entry<Integer,String> entry:treeMap.entrySet()){
    //    int key = entry.getKey();
    //    String value = entry.getValue();
    //
    //    System.out.println(key+";"+value);
    //}
    System.out.println(listOfToys);
    try
    {
        FileWriter writer = new FileWriter("LogPriseToys.txt",true);
        for (int i = 0; i < 10; i++) { 
        int a = (int)(Math.random()*9)+1;
        for (Map.Entry<Integer,String> entry:treeMap.entrySet()){
        int key = entry.getKey();
        String value = entry.getValue();
        if (key == a & a == 1){        
        writer.write("с вероятностью"+key+"выигрывает"+value);
        writer.write("\n");
        }
        else if (key == a & a < 2 | a == 2){
        writer.write("с вероятностью"+key+"выигрывает"+value);
        writer.write("\n");    
        }
        else {
        writer.write("с вероятностью"+key+"выигрывает"+value);
        writer.write("\n");
        } 
    }
        }
}
    catch (Exception e){
        System.out.println("Ошибка исполнения");
    }

    //public void getLuckyToy ()
}
}
