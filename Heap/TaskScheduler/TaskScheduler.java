class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Your code goes here
        int[] map = new int[26];
        for(int i = 0; i < tasks.length; i++){
            map[tasks[i] - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int time = 0;

        for(int i = 0; i < map.length; i++){
            if(map[i] > 0){
                pq.add(map[i]);
            }
        }

        while(!pq.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n + 1; i++){
                if(!pq.isEmpty()){
                    int freq = pq.peek();
                    pq.poll();
                    freq--;
                    temp.add(freq);
                }
            }
            for(int i = 0; i < temp.size(); i++){
                if(temp.get(i) > 0){
                    pq.add(temp.get(i));
                }
            }

            if(pq.isEmpty()){
                time += temp.size();
            }
            else{
                time = time + (n + 1);
            }
        }
        
        return time;
    }
}