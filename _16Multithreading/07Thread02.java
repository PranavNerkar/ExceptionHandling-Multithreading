class Demo extends Thread{
    public void run() {
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("C2W") ;
        }
        System.out.println(Thread.currentThread().getName()) ;
    }
    public void run(int x) {
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Incubator") ;
        }
        System.out.println(Thread.currentThread().getName()) ;
    }
}
class Thread02 {
    public static void main(String[] args) {
        Demo obj = new Demo() ;
        obj.start() ;
        obj.run(1) ;

        System.out.println(Thread.currentThread().getName()) ;

        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Biencaps") ;
        }
    }
}
