class Demo extends Thread{
    public void run() {
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("C2W") ;
        }
        System.out.println(Thread.currentThread().getName()) ;

    }
    public void start() {
        System.out.println(Thread.currentThread().getName()) ;
    }
}
class Thread02 {
    public static void main(String[] args) {
        Demo obj = new Demo() ;
        obj.start() ; // run navachya method la call zathach nahi
        // start hi method aapan override keli aahe 
        // navin thread banatach nahi
        System.out.println(Thread.currentThread().getName()) ;

        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Biencaps") ;
        }
    }
}
// mix output