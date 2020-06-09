package ee.omis;

class Threads extends Thread {
    public static void main(String[] args) {
        Thread thread1 = new Threads(1);
        Thread thread2 = new Threads(2);
        Thread thread3 = new Threads(3);
        Thread thread4 = new Threads(4);
    }

    int numberOfThread;

    Threads(int number) {
        this.numberOfThread = number;
        start();
    }

    public void run(){
        if(this.numberOfThread==1) {
            functionCountUp();
        } else if (this.numberOfThread==2) {
            functionLettersUp();
        }

    }

    private void functionCountUp() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private void functionLettersUp() {
        int a = 97;
        for (int i = 0; i < 15; i++) {
            String charact = Character.toString((char)a);
            System.out.println(charact);
            a++;
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}