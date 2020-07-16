package creational_patterns.singleton.singleton_05;

/**
 * @Author OliverYu
 * @Date 2020/7/13 11:19 下午
 * @Email 253757635@qq.com
 * @Description 饿汉式单例模式(实例化过程放在静态代码块中)
 */
public class Singleton {

    private static Singleton hungrySingleton;

    static {
        hungrySingleton = new Singleton();
    }

    public static Singleton getInstance() {
        return hungrySingleton;
    }
}
