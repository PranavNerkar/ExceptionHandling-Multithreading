class Twostart extends Thread{

    public void run() {

        System.out.println("C2W") ;
        System.out.println("Thread Name = "+Thread.currentThread().getName()) ;
    }
}

class RestartThread {
    public static void main(String[] args) {

        Twostart obj = new Twostart() ;
        obj.start() ;

        System.out.println(Thread.currentThread().getName()) ;

        obj.start() ; // Ekda ek state Sodli Tar tithe Wapas zanar nahi
        // Runtimr Exception
        // Exception in thread "main" java.lang.IllegalThreadStateException
        //         at java.base/java.lang.Thread.start(Thread.java:791)
        //         at RestartThread.main(12TwoTimeStart.java:18)
    }
}
// mix output