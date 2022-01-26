class NewThread extends Thread {
    public void run() {
        System.out.println("Thread Name = "+Thread.currentThread().getName()) ;
    }
}

class MultiThread extends Thread{
    public void run() {
        System.out.println("Thread Name = "+Thread.currentThread().getName()) ;

        NewThread nt = new NewThread() ;
        nt.start() ; // Thread1
    }
}

class RestartThread {
    public static void main(String[] args) {

        MultiThread mt1 = new MultiThread() ;
        mt1.start() ; // Thread0

        System.out.println("Thread Name = "+Thread.currentThread().getName()) ;
    }
}