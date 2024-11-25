class Solution {
    private static final String FINAL_STATE = "123450";
    // DIRS[i] represents the indexes to which the index i can swap to .
    private static final int[][] DIRS = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
    public int slidingPuzzle(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        StringBuilder sb = new StringBuilder();
        // Note the initial state of the board 
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                sb.append(board[i][j]);
            }
        }
        if (sb.toString().equals(FINAL_STATE))return 0;
        // We will perform a BFS from the position where the zero is located, marking each board state as visited 
        HashSet<String> boardStates = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        // Add the initial state of the board to visited boards 
        boardStates.add(sb.toString());
        q.add(sb.toString());
        int moves = 0;
        while(!q.isEmpty()) {
            // We will traverse to each child(which corresponds to each direction the current index can move to)
            // Remember it is BFS DUH
            int size = q.size();
            for(int i=0;i<size;i++) {
                String curr = q.poll();
                if(curr.equals(FINAL_STATE))return moves;
                // Find the index of 0 in the current boardState now.
                int zeroIdx = curr.indexOf("0");
                // We will traverse from the zeroIdx to all possible directions for the current index 
                for(int k=0;k<DIRS[zeroIdx].length;k++) {
                    String newBoardState = swapPos(DIRS[zeroIdx][k],zeroIdx,curr);
                    // If the current boardState is not already visited, then add it for BFS traversal
                    if(boardStates.add(newBoardState)) {
                        q.add(newBoardState);
                    }
                }
            }
            moves++;
        }
        return -1;
    }

    private String swapPos(int indexToSwap, int currIndex, String currString) {
        StringBuilder sb = new StringBuilder(currString);
        sb.setCharAt(indexToSwap, currString.charAt(currIndex));
        sb.setCharAt(currIndex, currString.charAt(indexToSwap));
        return sb.toString();

    }
}