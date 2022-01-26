// Usung Thread Class
class FirstThread extends Thread{
    // public nahi kela tar Error yeto
    // error: run() in FirstThread cannot implement run() in Runnable
    //     void run() {
    //          ^
    //  attempting to assign weaker access privileges; was public
    public void run() {
        System.out.println("In Run Method") ;
        String threadName = Thread.currentThread().getName() ;
        System.out.println("Thread name = " +threadName) ;
    }
    public static void main(String[] args) {

        FirstThread t  = new FirstThread() ; // Thred la janma
        t.start() ; // thread Working
 
        System.out.println("MultiThreading") ;
        String threadName = Thread.currentThread().getName() ;
        System.out.println("Thread name = " +threadName) ;
    }
}
// MultiThreading
// Thread name = main    
// In Run Method // Output ha change Hota
// Thread name = Thread-0