class Mythread extends Thread {

    static Thread mainThread = null ;
    public void run() { // D
        try{
            mainThread.join() ;
        } catch(InterruptedException ie) {
            System.out.println("Exception Caught Successfully") ;
        }

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Child Thread") ; // Jevha main thread cha kam sampel tevha Itha yenar
        }
    }
}

class Join01 {
    public static void main(String[] args) throws InterruptedException{
        Mythread mt = new Mythread() ;
        mt.start() ;
        
        Mythread.mainThread = Thread.currentThread() ;
        mt.join() ;

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Parent Thread") ;
        }
    }
}