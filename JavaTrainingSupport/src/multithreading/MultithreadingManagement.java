/*
 * a-sti.ro
 */
package multithreading;
/**
 *
 * @author gheorgheaurelpacurar
 */
public class MultithreadingManagement {
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // create, start and display info of thread HelloAllThread extending Thread
        HelloAllThread t1HA;
        t1HA = new HelloAllThread();
        t1HA.start();
        System.out.println("Hello All thread state is: " + t1HA.getState());
        // create, start and display info of thread HelloWorldThread extending Thread        
        HelloWorldThread t1HW = new HelloWorldThread();
        t1HW.start();
        System.out.println("Hello World thread state is: " + t1HW.getState());
        // create, start and display info of thread HelloWorldInterface extending Runnable        
        Thread t1HWI = (new Thread(new HelloWorldInterface()));
        t1HWI.start();
        System.out.println("Hello World Interface thread state is: " + t1HWI.getState());
        System.out.println("My priority is: " + t1HWI.getPriority());
        System.out.println("My thread ID is: " + t1HWI.getId());
        System.out.println("My thread name is: " + t1HWI.getName());
        System.out.println("My thread state is: " + t1HWI.getState());
        System.out.println("My group of threads is: " + t1HWI.getThreadGroup() );
        // create, start and display info of thread HelloAllInterface extending Runnable         
        Thread t1HAI = (new Thread(new HelloAllInterface()));
        t1HAI.start();
        System.out.println("Hello World Interface thread state is: " + t1HAI.getState());   
        System.out.println("My priority is: " + t1HAI.getPriority());
        System.out.println("My thread ID is: " + t1HAI.getId());
        System.out.println("My thread name is: " + t1HAI.getName());
        System.out.println("My thread state is: " + t1HAI.getState());
        System.out.println("My group of threads is: " + t1HAI.getThreadGroup() );
    }
}
