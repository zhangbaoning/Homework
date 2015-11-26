package Computer_6;

/**
 * Created by 张宝宁 on 2015/11/26.
 *   1．声明线程类TalkThread，循环打印线程名称10次（表示10次发言机会）；
 *   创建测试类，创建3个对象（表示3个发言人）并启动线程，观察输出结果（3个发言人的发言顺序）。
 */
class TalkThread extends Thread{
    String name;
    TalkThread(String name){
        this.name=name;
    }
     public void run(){
         for (int i=0;i<10;i++){
             System.out.println(name+"发言");
         }
     }
        }
public class Talk {
    public static void main(String[] args) {
        TalkThread talkThread = new TalkThread("张三");
        talkThread.start();
        TalkThread talkThread1 = new TalkThread("王麻子");
        talkThread1.start();
        TalkThread talkThread2 = new TalkThread("李四");
        talkThread2.start();
    }
}
