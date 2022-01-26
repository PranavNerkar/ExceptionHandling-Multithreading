class Sleep01 extends Thread {
    public void run() {
        System.out.println("In Run") ;

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Thread = "+Thread.currentThread().getName()) ;
        }
    }
}

class Threaddemo {
    public static void main(String[] args) throws InterruptedException {
        Sleep01 sl = new Sleep01() ;
        sl.start() ;
        sl.sleep(2000) ; // error: unreported exception InterruptedException; must be caught or declared to be thrown
        // start nantar to Thread la thambavto mhanun main thread 2 sec thambel
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Thread = "+Thread.currentThread().getName()) ;
        }
    }
} 