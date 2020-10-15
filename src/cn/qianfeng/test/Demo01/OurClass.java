package cn.qianfeng.test.Demo01;

public class OurClass extends Thread {
    @Override
    public void run() {

        while (!(Demo01.UID==0)){
            Demo01.UID--;
            System.out.println("售票员2余票"+Demo01.UID);
        }
    }
}
