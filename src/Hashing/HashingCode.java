package Hashing;
import java.util.*;

public class HashingCode {
   static class HashMap <K, V>{
       private class Node {
           K key;
           V value;

           Node (K key, V value){
               this.key = key;
               this.value = value;
           }
       }

       private int n;
       private int N;
       private LinkedList<Node> bucket[];

       HashMap (){
           this.N = 4;
           this.bucket = new LinkedList[4];
           for (int i = 0; i < 4; i++){
               this.bucket[i] = new LinkedList<>();
           }
       }

       public void put (K key, V value){
           
       }

   }
}
