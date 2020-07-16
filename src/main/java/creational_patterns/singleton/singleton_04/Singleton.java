package creational_patterns.singleton.singleton_04;

/**
 * @Author OliverYu
 * @Date 2020/7/12 3:41 下午
 * @Email 253757635@qq.com
 * @Description 饿汉式单例模式
 */
public class Singleton {

    /**
     * 饿汉式单例模式的优缺点：
     *      优点：类加载的时候就完成了初始化，避免了线程同步问题。
     *      缺点：没有延迟加载的效果，如果该类未使用，就会存在内存浪费。
     */
    private static Singleton hungrySingleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return hungrySingleton;
    }

}
