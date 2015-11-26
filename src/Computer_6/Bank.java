package Computer_6;

/**
 * Created by 张宝宁 on 2015/11/26.
 *  2．创建工作线程，模拟银行现金账户取款。多个线程同时执行取款操作时，如果不使用同步处理，会造成账户余额混乱；
 *  尝试使用synchronized关键字同步代码块，以保证多个线程同时执行取款操作时，银行现金取款的有效和一致。
 */
class Withdrawal implements Runnable {
    int money = 1000;
     final Object lock = new Object();

    public void run() {
        Thread thread = Thread.currentThread();
        while (true) {
            synchronized (lock) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (money > 0)
                {
                money -= 100;
                System.out.println(thread.getName() + "支出100,还剩"+money);}
                else break;
            }
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Withdrawal withdrawal = new Withdrawal();
        new Thread(withdrawal,"ATM1").start();
        new Thread(withdrawal,"ATM2").start();
        new Thread(withdrawal,"ATM3").start();
    }
}
