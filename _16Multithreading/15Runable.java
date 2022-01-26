class Runable10 implements Runnable{
    public void run() {
        System.out.println("In run") ;
        System.out.println(Thread.currentThread().getName()) ;
    }
}

class RunableThread {
    public static void main(String[] args) {
        Runable10 rt = new Runable10() ;
        // rt.start() ; // Error Undefined for Start()
        Thread th = new Thread(rt) ; // Throw Constructor has paramatarised constructor which has variable of type Runable
        // jar parameter nahi dila tar run() method la call zanar nahi
        th.start() ;
        System.out.println(Thread.currentThread().getName()) ;
    }
}