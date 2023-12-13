import java.util.*;



public class hashMap {
    public static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.remove(4);

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.putAll(map);
        hm.replace(1,"Watermelon");
        hm.put(5,"Guava");
        hm.put(6,"Strawberry");
        for(Map.Entry h : hm.entrySet()){
            System.out.println(h.getKey()+" "+h.getValue());
        }
        hm.replaceAll((k,v) -> "Watermelon");
        for(Map.Entry h : hm.entrySet()){
            System.out.println(h.getKey()+" "+h.getValue());
        }

    }
}
