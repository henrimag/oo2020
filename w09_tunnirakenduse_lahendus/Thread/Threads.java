public class Threads {
    public static void main(String[] args) {
        
        new Thread (NumDown(), "Thread-1").start();
        new Thread (NumUp(), "Thread-2").start();
        new Thread (Alphabet1(), "Thread-3").start();
        new Thread (Alphabet2(), "Thread-4").start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Runnable NumDown() {
        return () -> {
            for (int i = 1; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static Runnable NumUp() {
        return () -> {
            for (int i = 1; i > 10; i--) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    
    public static Runnable Alphabet1() {
        return () -> {
            for (char i='a'; i <= 'k'; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }


    public static Runnable Alphabet2() {
        return () -> {
            for (char i='k'; i <= 'z'; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                    }
                }
            };
        }
}

