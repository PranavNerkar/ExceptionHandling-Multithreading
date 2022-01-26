class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("MultiThreading") ;
        String threadName = Thread.currentThread().getName() ; // method Chaining
        // getName hi method String Return kateMhanu yenari value hi String madhe Store karayachi
        // Current Thread return karel 
        System.out.println("Thread name = " +threadName) ;
        // main thread aahe mhanun return zala
    }
}
// MultiThreading
// Thread name = main 