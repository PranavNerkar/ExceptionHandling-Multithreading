class ChangeName extends Thread{

    public void run() {
        System.out.println(Thread.currentThread().getName()) ;
    }
}

class Thread02 {
    public static void main(String[] args) {

        ChangeName obj = new ChangeName() ;
        obj.start() ; // Ready or Runable
        obj.setName("Child") ; // Thread Cha name Gain Hotay

        System.out.println(Thread.currentThread().getName()) ;
        Thread.currentThread().setName("Gain");
        System.out.println(Thread.currentThread().getName()) ;

    }
}
// mix output