package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestNum {

    class Pair{
        Integer first;
        Integer second;
        Pair(Integer first,Integer second){
            this.first = first;
            this.second = second;
        }
    }
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            List<Integer> list = new ArrayList<>();
            PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
                if (a.first.equals(b.first)) {
                    return b.second - a.second; // If distances are equal, compare values (max-heap based on values)
                }
                return b.first - a.first; // Max-heap based on distances
            });
            for(int i=0;i<arr.length;i++){
                Integer first= Math.abs(arr[i]-x);
                Integer second=arr[i];
                pq.add(new Pair(first,second));
                if(pq.size()>k){
                    pq.poll();
                }
            }

            while(!pq.isEmpty()){
                list.add(pq.peek().second);
                pq.poll();
            }
            Collections.sort(list);
            return list;

        }
    }
}
