class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;

        // List of events (time, friendIndex, type: 1 for arrival, 0 for departure)
        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new int[] {times[i][0], i, 1});  // Arrival event
            events.add(new int[] {times[i][1], i, 0});  // Departure event
        }

        // Sort events: by time first, if same time, prioritize arrivals over departures
        Collections.sort(events, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];   // Compare by time
            return a[2] - b[2];                     // Arrival (1) before departure (0)
        });

        // Min-heap to track available chairs
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.offer(i);
        }

        // Map to track which chair each friend is sitting on
        Map<Integer, Integer> friendToChair = new HashMap<>();

        // Process each event
        for (int[] event : events) {
            int time = event[0];
            int friend = event[1];
            int isArrival = event[2];

            if (isArrival == 1) {
                // Friend arrives, assign the smallest available chair
                int assignedChair = availableChairs.poll();
                friendToChair.put(friend, assignedChair);

                // If this is the target friend, return their chair number
                if (friend == targetFriend) {
                    return assignedChair;
                }
            } else {
                // Friend leaves, free up their chair
                int chairToFree = friendToChair.get(friend);
                availableChairs.offer(chairToFree);
            }
        }

        // This should never be reached since the targetFriend will be found during processing
        return -1;
    }
    
}