public class TestMitiThread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"Thread running start");
        new MitiThread("A").start();
        new MitiThread("B").start();

        System.out.println(Thread.currentThread().getName()+"Thread running ends");
    }

}