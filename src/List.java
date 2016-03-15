/**
 * Created by dingyunxiang on 16/3/12.
 */
public class List {

    public static class ListNode{
        int value;
        //ListNode head = new ListNode(1);
        ListNode next;
        ListNode(int x){ value = x;}

        public void addToTail(ListNode node){
            ListNode index = this;
            while(index.next != null){
                index = index.next;
            }
            index.next = node;
        }

        public void addToHead(ListNode node){
            ListNode  index = this;
            node.next = this.next;
            this.next = node;
            this.value = node.value;
            node.value = index.value;

        }


        public boolean addNode(ListNode node,int num){
            ListNode index = this;
            int val = 0;
            while(index!=null){
                if(val==num){
                    node.next = index.next;
                    index.next = node;
                    return true;
                }
                else{
                    val++;
                    index = index.next;
                }
            }
            return false;
        }


        public ListNode search(int num){
            ListNode index = this;
            while(index!=null){
                if(index.value == num){
                    return index;
                }
                else{
                    index = index.next;
                }
            }
            return null;
        }


        //移除第几个
        public boolean remove(int num){
            ListNode  index = this;
            int val = 0;
            if(num == 0){


                this.value = index.next.value;
                this.next = index.next.next;
                return true;

            }

            else if(num>0){
                while(index!=null){
                    if(val == num-1){
                        index.next = index.next.next;
                        return true;

                    }
                    else{
                        val++;
                        index = index.next;
                    }
                }
            }



            return false;
        }


        public void showAll(){
            ListNode index = this;
            while(index!=null) {
                System.out.print(index.value + "-");
                index = index.next;
            }
        }

    }


    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.addToTail(new ListNode(2));
        head.addToTail(new ListNode(5));
        head.addToTail(new ListNode(10));


//        head.addNode(new ListNode(4),5);
        head.remove(0);
//        ListNode search = head.search(10);
//        System.out.println(search);
        head.showAll();
    }








}
