class MedianFinder {

    public MedianFinder() {
       
    }
    PriorityQueue<Integer> right= new PriorityQueue<>();
    PriorityQueue<Integer> left= new PriorityQueue<>(Collections.reverseOrder());
    public void addNum(int num) {
        if(left.isEmpty() || num < left.peek())
            left.add(num);
        else
            right.add(num);
        if(left.size()>right.size())
            right.add(left.poll());
        if(right.size()>left.size())
            left.add(right.poll());
    }
    
    public double findMedian() {
        return left.size()!=right.size()? left.peek() : (double) (left.peek() + right.peek())/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */