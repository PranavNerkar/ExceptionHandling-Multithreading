class ChangeName extends Thread{

    public void run() {

        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("C2W") ;
        }
        System.out.println(Thread.currentThread().getName()) ;
    }
}

class Thread02 {
    public static void main(String[] args) {

        ChangeName obj = new ChangeName() ;
        obj.start() ; // Ready or Runable
        obj.setName("Gain") ; // Thread Cha name Gain Hotay

        System.out.println(Thread.currentThread().getName()) ;

        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Biencaps") ;
        }
    }
}
// mix output