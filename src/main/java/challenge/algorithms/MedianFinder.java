package challenge.algorithms;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
	private PriorityQueue<Integer> lo, hi;

	/** initialize your data structure here. */
	public MedianFinder() {
		this.lo = new PriorityQueue<>(Collections.reverseOrder());
		this.hi = new PriorityQueue<>();
	}

	public void addNum(int num) {
		this.lo.offer(num);

		this.hi.offer(this.lo.poll());

		if (this.hi.size() > this.lo.size()) {
			this.lo.offer(this.hi.poll());
		}
	}

	public double findMedian() {
		if (this.lo.size() > this.hi.size()) {
			return this.lo.peek().intValue();
		}

		System.out.println(this.lo.peek().intValue());
		System.out.println(this.hi.peek().intValue());
		return (this.lo.peek().intValue() + this.hi.peek().intValue()) * 0.5;
	}

	public static void main(String[] args) {
		MedianFinder obj = new MedianFinder();
		obj.addNum(3);
		obj.addNum(1);
		obj.addNum(2);
		obj.addNum(4);
		double param_2 = obj.findMedian();
		System.out.println(param_2);
	}

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder(); obj.addNum(num); double param_2 =
 * obj.findMedian();
 */