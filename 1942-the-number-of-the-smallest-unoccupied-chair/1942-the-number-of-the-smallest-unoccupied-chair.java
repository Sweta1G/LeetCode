class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;

        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new int[] {times[i][0], i, 1});
            events.add(new int[] {times[i][1], i, 0});  
        }

        Collections.sort(events, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[2] - b[2];                   
        });

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.offer(i);
        }

        Map<Integer, Integer> friendToChair = new HashMap<>();

        // Process each event
        for (int[] event : events) {
            int time = event[0];
            int friend = event[1];
            int isArrival = event[2];

            if (isArrival == 1) {
                int assignedChair = availableChairs.poll();
                friendToChair.put(friend, assignedChair);

                if (friend == targetFriend) {
                    return assignedChair;
                }
            } else {
                int chairToFree = friendToChair.get(friend);
                availableChairs.offer(chairToFree);
            }
        }

        return -1;
    }
    
}