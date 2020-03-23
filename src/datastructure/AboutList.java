package datastructure;

public class AboutList {
    public ListNode head = null;

    public ListNode tail = null;

    /**
     * 初始化带头节点的链表
     * @return
     */
    public ListNode initList(){
        head = tail = new ListNode();
        return tail;
    }

    /**
     * 初始化不带头节点的链表
     * @param a
     * @return
     */
    public ListNode inintList(int a){
        head = tail = new ListNode(a);
        return tail;
    }

    /**
     * 插到链表头部
     * @param head
     * @param a
     * @return
     */
    public ListNode headAdd(ListNode head,int a){
        ListNode data = new ListNode(a);
        head.next = data;
        head = head.next;
        return head;
    }

    /**
     * 插到链表尾部
     * @param tail
     * @param a
     * @return
     */
    public ListNode tailAdd(ListNode tail,int a){
        ListNode data = new ListNode(a);
        data.next=tail;
        tail = data;
        return tail;
    }

    /**
     * 批量插入
     * 头插法
     * @param head
     * @param b
     * @return
     */
    public ListNode allHeadAdd(ListNode head,int []b){
        for (int a:b) {
            ListNode data = new ListNode(a);
            head.next = data;
            head = head.next;
        }
        return head;
    }

    /**
     * 批量插入
     * 尾插法，将节点插入到链表的头部
     * @param head
     * @param b
     * @return
     */
    public ListNode allTailAdd(ListNode head,int []b){
        for (int a:b) {
            ListNode data = new ListNode(a);
            head.next = data;
            head = head.next;
        }
        return head;
    }

    public void show(ListNode head){
        while (head.next != null){
            System.out.println(head.getData()+" ");
        }
    }

    public static void main(String[] args) {
        AboutList aboutList = new AboutList();
        ListNode head = aboutList.initList();
        for(int i=0;i<10;i++){
            head.headAdd(head,i);

        }
    }
}
