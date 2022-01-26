class Mythread extends Thread {

    public void run() {
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Child Thread") ;
            try {
                Thread.sleep(1000) ;
            }catch (InterruptedException ie) {
                System.out.println("Exception Caught") ;
            }
        }
    }
}

class Join01 {
    public static void main(String[] args) throws InterruptedException{
        Mythread mt1 = new Mythread() ;
        mt1.start() ;
        mt1.join() ; // Exception Deta Interrupted
        // Main thread ha Child Thread cha kam zalyavar wapas run Honar

        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Main Thread") ;
        }
    }
}