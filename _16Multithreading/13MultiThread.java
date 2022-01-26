class MultiThread extends Thread{

    public void run() {
        System.out.println("Thread Name = "+Thread.currentThread().getName()) ;
    }
}

class RestartThread {
    public static void main(String[] args) {

        MultiThread mt1 = new MultiThread() ;
        mt1.start() ;

        MultiThread mt2 = new MultiThread() ;
        mt2.start() ;
        System.out.println(Thread.currentThread().getName()) ;
    }
}