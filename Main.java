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
    
    try
    {
        FileWriter writer = new FileWriter("LogPriseToys.txt",true);
        for (int i = 0; i < 10; i++) { 
        int a = (int)(Math.random()*9)+1;
        if (a == 1){        
        writer.write("с вероятностью"+a+"выигрывает"+PriseToys.get(a));
        writer.write("\n");
        }
        else if (a == 2){
        writer.write("с вероятностью"+a+"выигрывает"+PriseToys.get(a));
        writer.write("\n");    
        }
        else if (a > 2){
        writer.write("с вероятностью"+6+"выигрывает"+PriseToys.get(6));
        writer.write("\n");
        } 
    }
        }

    catch (Exception e){
        System.out.println("Ошибка исполнения");
    }

}
}
