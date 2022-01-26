class Mythread extends Thread {

    static Thread mainThread = null ;
    public void run() {
        System.out.println(mainThread) ;
    }
}

class Join01 {
    public static void main(String[] args) throws InterruptedException{
        Mythread mt = new Mythread() ;
        mt.start() ;
        
        Mythread.mainThread = Thread.currentThread() ;

    }
}