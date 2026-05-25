class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] result = new int[deck.length];

        //create a queue and put indexes inside it
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < deck.length; i++){
            q.add(i);
        }

        for(int i = 0; i < deck.length; i++){
            int idx = q.peek();
            q.poll();

            result[idx] = deck[i];

            if(!q.isEmpty()){
                q.offer(q.peek());
                q.poll();
            }
        }

        return result;
    }
}