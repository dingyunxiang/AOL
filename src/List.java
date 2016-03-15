/**
 * Created by dingyunxiang on 16/3/12.
 */
public class List {

    public class Node{
        int num;
        void setNum(int i){
            num = i;
        }
        Node next;
    }

    public static void main(String args[]){

        List l = new List();

        //初始化链表
        Node a[] = new Node[5];
//        for(int i =0;i<4;i++){
//            a[i].num = i;
//            a[i].next = a[i+1];
//        }
        a[4].setNum(4);


        //输出链表
        for(Node node:a){
            System.out.print(node.num+"-");
        }
    }



    public void addNode(Node head,int n,Node node){
        if(head == null) return ;
        Node p = head;
        int  index = 0;
        if(n==0) {
            node.next = head;
            head = node;
        }
        while(p.next!=null)
        {
            index++;
            if(index == n){
                node.next = p.next.next;
                p.next = node;
                return ;
            }
        }
    }




}
