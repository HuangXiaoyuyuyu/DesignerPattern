package creationalpatterns.singleton.singleton_06;

/**
 * @Author OliverYu
 * @Date 2020/7/15 10:37 下午
 * @Email 253757635@qq.com
 * @Description 单例模式之静态内部类
 */
public class Singleton {

    private Singleton() {

    }

    /**
     * 静态内部类的优点：
     *      外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化 staticInnerClassSingleton，故而不占内存。
     *      也就是说，当Singleton第一次被加载时，并不需要去加载InnerClass，
     *      只有当getInstance()方法第一次被调用时，才会去初始化 staticInnerClassSingleton。
     *      第一次调用getInstance()方法会导致虚拟机加载InnerClass类，
     *      这种方法不仅仅能保证线程安全，也保证了单例的唯一性，同时也延迟了单例的实例化。
     *
     * 静态内部类的缺点：
     *      静态内部类其实有一个致命的缺点，就是传参问题，
     *      由于是静态内部类的形式去创建单例的，故外部无法传递参数进去，
     *      所以创建单例模式的时候需要斟酌是否使用静态内部类。
     */
    private static class InnerClass {
        private static Singleton staticInnerClassSingleton = new Singleton();
    }

    public static Singleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

}
