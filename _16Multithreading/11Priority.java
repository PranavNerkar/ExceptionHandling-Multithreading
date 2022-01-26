class ChangeName extends Thread{

    public void run() {

        System.out.println(Thread.currentThread().getName()) ;
        System.out.println(Thread.currentThread().getPriority()) ;

        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("C2W") ;
        }
    }
}

class Thread02 {
    public static void main(String[] args) {

        ChangeName obj = new ChangeName() ;
        obj.start() ; // Ready or Runable
        obj.setName("Gain") ; // Thread Cha name Gain Hotay

        // obj.setPriority(7) ; // child Chya thread chi priority Wadhavli
        // obj.setPriority(-7) ; // illegal Argument Excepton

        System.out.println(Thread.currentThread().getName()) ;
        System.out.println(Thread.currentThread().getPriority()) ;

        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Biencaps") ;
        }
    }
}
// mix output