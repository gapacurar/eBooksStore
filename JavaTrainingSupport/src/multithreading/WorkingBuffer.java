/*
 * a-sti.ro
 */
package multithreading;

/**
 * @author gheorgheaurelpacurar
 */
public class WorkingBuffer {
    //variabila utilizata pentru transferul informatiei.
    private String message;
    //Flag de stare a bufferului;True daca este ceva de luat
    // din el;. Fals daca este gol.
    private boolean empty = true;
    /**
    * Metoda sincronizata de furnizare a valorii din buffer
    *
    * @return  the String value from Buffer
    */
    public synchronized String take() {
    //Asteapta pana cand in buffer este ceva de luat.
    while (empty) {
        try {
            this.wait();
        } catch (InterruptedException e) {}
    }
    //Marcheaza flagul ca s-a incarcat bufferul.
    empty = true;
    //Notifica toate threadurile de incarcarea bufferului.
    this.notifyAll();
    return message;
    }
    /**
    * Metoda pune o valoare in buffer.
    *
     * @param message to be written in the buffer*/
    public synchronized void put(String message) {
        //Asteapta pana bufferul este gol.
        while (!empty) {
            try { 
                this.wait();
            } catch (InterruptedException e) {}
        }
        //Marcheza curatarea bufferului.
        empty = false;
        //Stocheaza datele in buffer.
        this.message = message;
        //Notifica toate threadurile de descarcare.
        this.notifyAll();
    }
    
    public String value(){
        return message;
    }
}
