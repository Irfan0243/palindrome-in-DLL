
     class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    class DLL{
        public static Node head;
        public static Node tail;
        public static int size;
public void addFirst(int data){
    Node newNode=new Node(data);
    if(head!=null){
        head.prev=newNode;
    }
    newNode.next=head;
    head=newNode;

}
public void addLast(int data){
    Node newNode=new Node(data);
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
    newNode.prev=temp;
    tail=newNode;
}
   
public void PrintList(){
    
    
    if (head==null){
        System.out.print("the DLL is empty");
    }
    
    Node currNode=head;
    while(currNode!=null){
        System.out.print(currNode.data+"<->");
currNode=currNode.next;
    }
  System.out.print("NULL");  
}
public void addmid(int idx,int data){
    Node temp=head;
    for(int i=0;i<idx-1;i++){
        temp=temp.next;
    }
    Node s=temp.next;
    Node t=new Node(data);
    temp.next=t;
    t.prev=temp;
    t.next=s;
    s.prev=t;
}
public void deletion(int index){
    Node r=head;
    for(int i=0;i<index-1;i++){
        r=r.next;
    }
    Node s=r.next;
    r.next=s.next;
    s.next.prev=r;


}
//check whather a number is palindrom or not
public boolean isPalindrome(){
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node t=temp;
    Node h= head;
    while(h!= null&&t!=null){
        if(h.data!=t.data){
            return false;
        }
       else{
        h=h.next;
        t=t.prev;

       }
    }
return true;


        
    }
}

public class palindrome {

 public static void main(String[] args){
    DLL t=new DLL(); 
    t.addFirst(1);
    t.addFirst(4);
    t.addFirst(2);
    t.addFirst(1);
    
    
    
   // t.deletion(4);
    //t.deletion(3);
    boolean isPalindrome=t.isPalindrome();
System.out.println(isPalindrome);
    }
}
