class ThreadDemo extends Thread {
    public void run() {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Core2Web") ;
        }
        System.out.println(Thread.currentThread().getName()) ;
    }
}

class Demo01 {
    public static void main(String[] args) {
 
        ThreadDemo t = new ThreadDemo() ;
        t.start() ;

        t.run() ; // Function Lach Call karto
        // Multi Threading Karnyasathi runlach call karayacha
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Biebcaps") ;
        }

        System.out.println(Thread.currentThread().getName()) ;
    }
}