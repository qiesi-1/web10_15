package cn.qianfeng.test.Demo01;

public class Demo01 {
    public static long UID =100;
    public static void main(String[] args) {
        MyClass myclass = new MyClass("1");
        MyClass myclass1 = new MyClass("2");
        MyClass myclass2 = new MyClass("3");
        
        myclass.start();
        myclass1.start();
        myclass2.start();
    }
}
