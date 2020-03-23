package datastructure;

public class DoubleListNode {
    private int data;

    public DoubleListNode prev = null;
    public DoubleListNode next = null;

    DoubleListNode(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}
