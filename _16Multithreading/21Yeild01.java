class MyThread01 extends Thread {
    public void run() {
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println("Child Thread") ;
        }
    }
}

class YieldDemo {
    public static void main(String [] args) {
        MyThread01 mt = new MyThread01() ;
        mt.start() ;
        mt.yield() ; // yield He hoyel asa nahich CPU war depend karta
        // priority war depend karto
        // jyachi priority jasta asel tyala cpu milto
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println("Parent Thread") ;
        }
    }
}