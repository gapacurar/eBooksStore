/*
 * a-sti.ro
 */
package multithreading;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class HelloWorldInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World!");
        //System.out.println("My priority is: " + this.getPriority());
        //System.out.println("My thread ID is: " + this.getId());
        //System.out.println("My thread name is: " + this.getName());
        //System.out.println("My thread state is: " + this.getState());
        //System.out.println("My group of threads is: " + this.getThreadGroup() );
    }
}
