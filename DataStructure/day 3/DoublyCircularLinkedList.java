
import java.util.*;
class Dnode
{
    int data;
    Dnode left,right;
    Dnode(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class DoublyCircularLinkedList{
   Dnode root,last;    
    void createList()
    {
        root=last=null;
    }
    void insertLeft(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)
            {
                root=last=n;
                last.right=root;
                root.left=last;
            }   
        else
        {
            n.right=root;
            root.left=n;
            root=n;
            last.right=root;
            root.left=last;
            
        }
    }
    void deleteLeft()
    {
        if(root==null)
            System.out.println("Empty list");
        else
        {
            Dnode t=root;
            root=root.right;
            root.left=last;
            last.right=root;
            System.out.println("Deleted:"+t.data);
        }
    }
    
    void insertRight(int data)
            
    {
        Dnode n=new Dnode(data);
        if(root==null)
            root=last=n;
        else
        {
        
            last.right=n;
            n.left=last;
            last=n;
            last.right=root;
            root.left=last;

               
        }
    }
 void deleteRight()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
        
         Dnode t,t2;
         t=last;
         t2=t.left;
         last=t2;
         last.right=root;
         root.left=last;
         System.out.println("Deleted:"+t.data);
     }
   }

 void printList()
 {
     if(root==null)
              System.out.println("List Empty");
     else
     {
         Dnode t;
         t=root;
         do
         {
            System.out.println(t.data);
            t=t.right;
        }
         while(t.right!=root);
        }
    }
  void printRevList()
 {
     if(root==null)
              System.out.println("List Empty");
     else
     {
         Dnode t;
         t=last;
         do
         {
            System.out.println(t.data);
            t=t.left;
        }
         while(t.left!=last);
        
         
     }
   }
   public static void main(String args[])
          {
             int ch,e;
             DoublyCircularLinkedList obj=new  DoublyCircularLinkedList();
             try (Scanner in = new Scanner(System.in)) {
                obj.createList();
                 do
                {
                     System.out.println("1.insertLeft\n2.deleteLeft\n3.insertRight\n4.deleteRight\n5.printList\n6.printRevLis\n0.exit");
                     ch=in.nextInt();
                     switch(ch)
                   {
                        case 1:
                               System.out.println("Enter Data:");
                               e=in.nextInt();
                               obj.insertLeft(e);
                               System.out.println("Node Inserted on left");
                               break;
                       
                        case 2:
                               obj.deleteLeft();
                                System.out.println("Node deleted from left");
                               break;
                       
                        case 3:
                               System.out.println("Enter Data:");
                               e=in.nextInt();
                               obj.insertRight(e);
                               System.out.println("Node Inserted on right");
                               break;  
                    
                        case 4:
                                obj.deleteRight();
                                System.out.println("Node deleted from right");
                                  break;  

                        case 5:
                                obj.printList();
                                break;  
                        case 6:
                                obj.printRevList();
                                break;  
                        case 0:
                                System.out.println("Exiting ");
                                break;
                     
                        default:
                                 System.out.println("Wrong option selected");
                                 break;
                    }
                }while(ch!=0);
            }
      
        }
}