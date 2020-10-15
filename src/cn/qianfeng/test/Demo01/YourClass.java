package cn.qianfeng.test.Demo01;

public class YourClass extends Thread {
    public void run(){

        while (!(Demo01.UID ==0)){
            Demo01.UID--;
            System.out.println("售票员3余票"+Demo01.UID);

        }

    }
}
