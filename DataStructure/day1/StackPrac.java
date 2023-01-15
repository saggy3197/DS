

import java.util.*;
public class StackDemo
{

    int stack[] ,tos , Maxsize;
    void createStack(int size)
    {
        tos=-1;
        Maxsize=size;
        stack= new int[Maxsize];

    }
    void push(int e)
    {
        tos++;
        stack[tos]=e;

    }
    boolean isFull()
    {
        if(tos==Maxsize-1)
            return true;
        else
            return false;    
    }
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);

    }
    boolean isEmpty()
    {
        if(tos==-1)
           return true;
        else
            return false;   
    }

    int peek()
        {
            return stack[tos];
        }
    void printStack()
        {
             for(int i=tos;i>-1;i--)
             System.out.println(stack[i]);   
        }

        public static void main(String args[])
        {
            int ch,e;
            StackDemo obj=new StackDemo();
            try(Scanner in = new Scanner(System.in))
            {
                System.out.prinln("Enter the Size Of Stack");
                int s=in.nextInt();
                obj.createStack(s);

                do
                {
                    System.out.println()
                }
            }
        }
}

