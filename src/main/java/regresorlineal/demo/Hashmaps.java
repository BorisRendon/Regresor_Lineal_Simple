package regresorlineal.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmaps {

    //Map<Integer,Integer> dataset = new HashMap<Integer, Integer>();
    Map dataset = new HashMap();

    int sum=0;
    int contador;


    public Hashmaps(){
        this.sum=sum;
        this.contador=contador;
    }

    public void llenarHashmap(Integer X, Integer Y){
        dataset.put(X, Y);
    }

    public void imprimir(){
        System.out.println(dataset);
        System.out.println(dataset.values());
        System.out.println(dataset.keySet());

    }

    /*public void getsize(){
        dataset.size();
    }*/

  /*public void  suma(){
        int sum=0;
        for(Integer x : dataset.keySet())


        }


*/



}
