import java.util.Scanner;

public class StackAndQueue {
    //static variables
    public static int size;
    public static int top;
    public static String arr[];
    public static int front;
    public static int rear;
    
    //constructor
    StackAndQueue(int size){
        this.size=size;
        top=-1;
        arr=new String[size];
        front=0;
        rear=0;
        
    }
    
    //main method
    public static void main(String[] args) {
        //input variable
        int choice;
        //while loop is for infinte terms it will terminate only when user chose quit option
        while(true){
        //input for choice
        System.out.println("---------------------------------------------------");
        System.out.println("\nWhat do you want to implement \nChoose Choice: ");
        System.out.println("1.Stack");
        System.out.println("2.Queue");
        System.out.println("3.Quit.");
        System.out.println("---------------------------------------------------");
        //scanner class for input
        Scanner sc=new Scanner(System.in);
        //integer input
        choice=sc.nextInt();
        switch(choice){
            //case 1 for stack implementation
            case 1:
                int stsize,stchoice;
                //input stack size
                System.out.print("Enter Size of Stack: ");
                stsize=sc.nextInt();
                //class object for stack implementation
                StackAndQueue stack=new StackAndQueue(stsize);
                //infite loop for stack implementation it will terminte when user choose option of quit
                while(true){
                //options for stack operetions  
                System.out.println("*****************************************************");
                System.out.println("What do you Want to implement\nChoose Options: ");
                System.out.println("1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Display");
                System.out.println("4.Quit");
                System.out.println("*****************************************************");
                //operation choice input
                stchoice=sc.nextInt();
                if(stchoice==1){
                    //pushStack method called when user choose 1 for push
                    pushStack(stack);
                }
                else if(stchoice==2){
                    //popStack method called when user choose 2 for pop
                    popStack(stack);
                }
                else if(stchoice==3){
                    //displayStack method called when user choose 3 for display
                    displayStack(stack);
                }
                else if(stchoice==4){
                    //for exit stack oprations after this inner while loop will break but outer while loop is running
                   break; 
                }else{
                    //if user choose wrong options which is not mentioned
                    System.out.println("Invalid Choice");
                }
                }
                //break switch statement
                break;
            case 2:
                int quchoice,qusize;
                //input Queue size
                System.out.print("Enter size of Queue: ");
                qusize=sc.nextInt();
                //create object for queue 
                StackAndQueue queue=new StackAndQueue(qusize);
                //inner while loop for queue operations it will terminate when use choose quit option
                while(true){
                 //queue operations
                System.out.println("*****************************************************");
                System.out.print("What do you want to implement?\nChoose your Choice: \n");
                System.out.println("1.Insert");
                System.out.println("2.Delete");
                System.out.println("3.Display");
                System.out.println("4.Quit");
                System.out.println("*****************************************************");

                //operation input
                quchoice=sc.nextInt();
                if(quchoice==1){
                    //inserElementInQueue called for insertion element
                    insertElementInQueue(queue);
                    
                }else if(quchoice==2){
                    //deletElementOfQueue called for deletion of element
                    deleteElementOfQueue(queue);
                    
                }else if(quchoice==3){
                    //for displaying elements of queue displayQueue is called
                    displayQueue(queue);
                    
                }else if(quchoice==4){
                    //for break inner while loop
                    break;
                }
                else{
                    //if user enters wrong choice 
                    System.out.println("Invalid Choice!");
                }
                }
                break;
            case 3:
                //for terminating outer while loop .. for terminate programm also
                System.exit(0);
                
                
            
        }
        }
        
    }
    private static void pushStack(StackAndQueue stack) {
        
        //check if stack is full or not
        if(stack.top==stack.size-1){
            //if stack is full
            System.out.println("Stack is full.");
        }else{
            //decleare element
            String element;
            //top incremented for element insertion
            stack.top++;
            //element input
            System.out.print("Enter element :");
            Scanner sc=new Scanner(System.in);
            element=sc.next();
            //element insertion
            stack.arr[stack.top]=element; 
        }
    }
    private static void popStack(StackAndQueue stack) {
        //check if stack is empty or not
        if(stack.top==-1){
            //if stack is empty
            System.out.println("Stack is empty!.");
        }
        else{
            //pop last element of the stack/array
            System.out.println("Poped element is :"+stack.arr[stack.top]);
            //decrement of top
            stack.top--;
        }
    }
     private static void displayStack(StackAndQueue stack) {
       //check stack is empty or not   
       if(stack.top==-1){
           //if stack is empty
           System.out.println("Stack is Empty!");
       }
       else{
           System.out.println("");
           for(int i=0;i<=stack.top;i++){
               System.out.print(stack.arr[i]+"\t");
           }
           System.out.println("");
       }
     }
    private static void insertElementInQueue(StackAndQueue queue) {
        //check if queue is full or not
        if(queue.front==0&&queue.rear==queue.size){
            //if queue if full
            System.out.println("Queue is full");
        }
        else{
        //insert Element
        System.out.println("Enter Element");
        String element;
        //input element
        Scanner sc=new Scanner(System.in);
        element=sc.next();
        //insert element in queue
        queue.arr[queue.rear]=element;
        //increase rear
        queue.rear++;
        }
    }
    private static void deleteElementOfQueue(StackAndQueue queue) {
        //check if queue if empty or not
        if(queue.front==queue.rear){
            //if front and rear is equal and full set front and rear to 0
            if(queue.front==queue.size-1){
                queue.front=0;
                queue.rear=0;
            }
            //else queue if empty
            System.out.println("Queue is Empty!");
        }else{
            //delete first elememt of queue 
            System.out.println("Deleted element : "+queue.arr[queue.front]);
            //incrememt front
            queue.front++; 
        }
    }
    private static void displayQueue(StackAndQueue queue) {
        //check if queue if empty or not
        if(queue.front==queue.rear){
            //if queue is empty
            System.out.println("Queue is Empty!");
            
        }
        else {
            //else display each element
            System.out.println("");
            for(int i=queue.front;i<queue.rear;i++){
                System.out.print(queue.arr[i]+"\t");
                
            }
            System.out.println("\n");
        }
    }     
}
