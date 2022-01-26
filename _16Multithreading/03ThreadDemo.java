class ThreadDemo extends Thread {
    // Inthe run() hich Methoid Lihayachi aani tila public lihayachi
    // karan Thread class Madhe ji run method aahe ti tithe public aahe mhanun access specifier
    public void run() {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Core2Web") ;
        }
        // run() chya jagi gun() lihili tar thread tila access karnar nahi
        System.out.println(Thread.currentThread().getName()) ;
    }
}

class Demo01 {
    public static void main(String[] args) {

        ThreadDemo t = new ThreadDemo() ; // Thread La birth 
        t.start() ; // Work karayala Suruwat
        // star0() call gelyawar nawin Thread banto
        // jya class chya object warti call zala aahe tya class chya run() method la call kar
        // run() lach sapadto  gun() che lad chalat nahi

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Biebcaps") ;
        }

        System.out.println(Thread.currentThread().getName()) ;
    }
}
// output madhe mix output yeta Sequence ksa yeto mahit nasta