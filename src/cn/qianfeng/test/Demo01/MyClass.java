package cn.qianfeng.test.Demo01;

public class MyClass extends Thread {
    private String name ;
    public MyClass(String name) {
        this.name = name;
    }
    public void run(){

        while (!(Demo01.UID ==0)){
            Demo01.UID--;
            System.out.println(name+"售票员1余票"+Demo01.UID);
        }
    }
}
