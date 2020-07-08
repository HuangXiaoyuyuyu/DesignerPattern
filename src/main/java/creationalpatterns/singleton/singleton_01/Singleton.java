package creationalpatterns.singleton.singleton_01;

/**
 * @Author OliverYu
 * @Date 2020/7/8 11:41 下午
 * @Email 253757635@qq.com
 * @Description 懒汉式单例模式(非线程安全)
 *
 *      单例模式：通常我们可以让一个全局变量使得一个对象被访问，但它不能防止你实例化多个对象。
 *              一个最好的办法就是，让类自身负责保存它的唯一实例。
 *              这个类可以保证没有其他实例可以被创建，并且提供一个访问该实例的方法。
 */
public class Singleton {

    private static Singleton lazySingleton = null;

    //构造方法让其private，这就堵死了外界利用new创建类实例的可能
    private Singleton() {

    }

    //此方法是获得本类实例的唯一全局访问点
    public static Singleton getInstance() {
        //若实例不存在，则new一个新实例，否则返回已有的实例
        if (lazySingleton == null) {
            lazySingleton = new Singleton();
        }
        return lazySingleton;
    }
}
