package creational_patterns.singleton.singleton_02;

/**
 * @Author OliverYu
 * @Date 2020/7/9 11:35 下午
 * @Email 253757635@qq.com
 * @Description 懒汉式单例模式(线程安全)
 */
public class Singleton {

    private static Singleton lazySingleton = null;

    //私有构造器
    private Singleton() {

    }

    //使用synchronized会降低效率，由于是static方法，所以锁定的是当前类(Singleton.class)
    public synchronized static Singleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new Singleton();
        }
        return lazySingleton;
    }
}
