class Demo extends Thread{
    public void run() {
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("C2W") ;
        }
        System.out.println(Thread.currentThread().getName()) ;
    }
}
class Thread01 {
    public static void main(String[] args) {
        Demo obj = new Demo() ; // Thread Birth
        obj.start() ; // Thread Class Chi method aahe start() -> start0()
        System.out.println(Thread.currentThread().getName()) ;
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Biencaps") ;
        }
    }
}
// Mix Output