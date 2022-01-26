class Sleep01 extends Thread {
    public void run() {
        System.out.println("In Run") ;

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Thread = "+Thread.currentThread().getName()) ;
            // sleep(2000) ; error: unreported exception InterruptedException; must be caught or declared to be thrown
            try{
                sleep(2000) ; // Thread0 ha dar 2 sec la thambun output deyel
            } catch (InterruptedException ie) {
                // System.out.println("Exception Caught") ;
            }
        }
    }
}

class Threaddemo {
    public static void main(String[] args) throws InterruptedException {
        Sleep01 sl = new Sleep01() ;
        sl.start() ;
        
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Thread = "+Thread.currentThread().getName()) ;
        }
    }
}