package challenge.algorithms.sorting;

import java.util.ArrayList;

public class HeapSort<T extends Number> {
	private ArrayList<T> heap;
	private int size = 0;

	public HeapSort() {
		this.heap = new ArrayList<T>();
		this.size = 0;
	}

	public HeapSort(int[] arr) {
		this.heap = new ArrayList<T>(arr.length);

		for (int i = 0; i < arr.length; i++) {
			this.heap.add((T) Integer.valueOf(arr[i]));
		}

		this.size = this.heap.size();
	}

	public int getHeapSize() {
		return this.size;
	}

	private int leftChild(int parent) {
		int index = 2 * parent + 1;

		if (index >= this.getHeapSize()) {
			index = -1;
		}

		return index;
	}

	private int rightChild(int parent) {
		int index = 2 * parent + 2;

		if (index >= this.getHeapSize()) {
			index = -1;
		}

		return index;
	}
	
	private int parent(int index) {
		return (index - 1) / 2;
	}

	private T getNode(int index) {
		return this.heap.get(index);
	}

	private void setNode(int index, T value) {
		this.heap.set(index, value);
	}

	public void buildMaxHeap() {
		for (int i = this.getHeapSize() / 2 - 1; i >= 0; i--) {
			this.maxHeapify(i);
		}
	}

	private void swap(int index1, int index2) {
		T tmp = this.getNode(index1);
		this.setNode(index1, this.getNode(index2));
		this.setNode(index2, tmp);
	}

	private void maxHeapify(int parent) {
		int leftChild = this.leftChild(parent);
		int rightChild = this.rightChild(parent);
		int largest = parent;

		if (leftChild != -1) {
			if (this.getNode(leftChild).floatValue() > this.getNode(largest).floatValue()) {
				largest = leftChild;
			}
		}

		if (rightChild != -1) {
			if (this.getNode(rightChild).floatValue() > this.getNode(largest).floatValue()) {
				largest = rightChild;
			}
		}

		if (parent != largest) {
			this.swap(parent, largest);
			this.maxHeapify(largest);
		}
	}

	public void heapSort() {
		this.buildMaxHeap();

		while (this.size > 0) {
			this.swap(0, this.size - 1);
			this.size--;
			this.maxHeapify(0);
		}
	}
	
	public T extractTop() {
		
		T value = this.heap.get(0);
		this.heap.set(0, this.heap.get(this.size - 1));
		this.heap.remove(this.size - 1);
		this.size--;
		this.maxHeapify(0);
		
		return value;
	}
	
	public void insert(T element) {
		this.size++;
		this.heap.add(element);
		
		int current = this.size - 1;
		while (this.parent(current) >= 0 && this.heap.get(current).floatValue() > this.heap.get(this.parent(current)).floatValue()) {
			this.swap(current, this.parent(current));
			current = this.parent(current);
		}
	}

	public void printHeap() {
		System.out.println(this.heap);
	}

	public void preOrder(int root) {
		if (root == -1) {
			return;
		}

		System.out.print(this.heap.get(root).floatValue() + " ");
		this.preOrder(this.leftChild(root));
		this.preOrder(this.rightChild(root));
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5};

//		HeapSort<Number> heap = new HeapSort<>(arr);
		HeapSort<Number> heap = new HeapSort<>();
		heap.insert(Integer.valueOf(1));
		heap.insert(Integer.valueOf(3));
		heap.insert(Integer.valueOf(2));
		heap.insert(Integer.valueOf(4));
		heap.printHeap();
		
		System.out.println(heap.extractTop().floatValue());
		System.out.println(heap.extractTop().floatValue());
		
		System.out.println("Before sort");
//		heap.preOrder(0);
		heap.printHeap();

		heap.buildMaxHeap();
		heap.heapSort();

		System.out.println("\nAfter sort");
//		heap.preOrder(0);
		heap.printHeap();
	}
}
