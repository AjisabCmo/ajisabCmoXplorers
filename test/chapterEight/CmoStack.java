package chapterEight;

public class CmoStack<T> {
    private int defaultCapacity = 3;
    private  int size;
    Object[] cmoStackContainer = new Object[defaultCapacity];
    public CmoStack(){
        cmoStackContainer = new Object[defaultCapacity];


            }
            public CmoStack(int capacity){
        if (capacity<=0)
            throw new IllegalArgumentException("capacity must be greater than zero");

        cmoStackContainer = new Object[capacity];
      defaultCapacity = capacity;
            }

    public  boolean isEmpty() {

        return size==0;
    }

    public int size() {

        return size;
    }

    public void push(T value) {
      cmoStackContainer[size++] = value;
        if(isFull())throw new StackOverFlowError("Stack is full");
//        cmoStackContainer[size++] = value;
    }

    public boolean isFull() {
        return size == defaultCapacity;
    }
}