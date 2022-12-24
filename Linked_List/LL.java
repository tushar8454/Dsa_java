package Linked_List;

public class LL {

    private node head;
    private node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public void insertfirst(int val){
        node nodecreate=new node(val);
        nodecreate.next=head;
         head=nodecreate;


         if(tail==null){
             tail=head;

         }
         size+=1;

    }

    private class node{
        private int value;
        private node next;

        public node(int value){
            this.value=value;
        }

        public node(int value,node next){
            this.value=value;
            this.next=next;
        }
    }
}
