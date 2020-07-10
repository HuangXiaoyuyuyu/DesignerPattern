package creationalpatterns.singleton.singleton_03;

/**
 * @Author OliverYu
 * @Date 2020/7/10 11:20 下午
 * @Email 253757635@qq.com
 * @Description 懒汉式单例模式(Double Check)
 */
public class Singleton {

    //为了防止指令重新排序，所以需要关键字volatile来修饰。
    public volatile static Singleton lazyDoubleCheckSingleton = null;

    private Singleton () {

    }

    public static Singleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (Singleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new Singleton();
                    /**
                     * 指令重排序：
                     *      JVM为了使得处理器内部的运算单元能充分利用，使效率最大化，处理器可能会对输入代码进行指令重排序的优化，
                     *      处理器会在计算之后将乱序的结果进行重组，保证该结果与顺序执行的结果是一样的，
                     *      但并不保证程序中各个语句计算的先后顺序与输入的代码顺序一致(这种保证一致的原则叫做as-if-serial)
                     *
                     * lazyDoubleCheckSingleton = new Singleton() 的执行过程：
                     *      1. 给lazyDoubleCheckSingleton对象分配内存
                     *      2. 调用Singleton的构造函数来初始化成员变量，形成实例
                     *      3. 设置lazyDoubleCheckSingleton指向分配的内存空间(执行完这步 lazyDoubleCheckSingleton才是非null)
                     *
                     * 问题所在：
                     *      由于在JVM的即时编译器中存在指令重排的优化，
                     *      也就是说 lazyDoubleCheckSingleton = new Singleton() 的执行过程可能是上面的
                     *      1-2-3，也可能是1-3-2。
                     *
                     *      如果在是1-3-2的情况下，假设线程A执行完 3 以后(lazyDoubleCheckSingleton已经是非null，但是未初始化)，
                     *      准备去执行2，此时被线程B抢占，线程B直接返回lazyDoubleCheckSingleton，然后使用的时候顺理成章的报错。
                     *
                     * 解决方式：
                     *      给声明的lazyDoubleCheckSingleton加上volatile关键字。
                     *
                     *      volatile关键字的一个作用就是禁止指令重排序，把 lazyDoubleCheckSingleton 声明为volatile之后，
                     *      对它的读写操作就会有一个内存屏障，这样，在它赋值完成之前，就不会调用读操作。
                     *
                     * 注意：
                     *      volatile关键字阻止的不是 lazyDoubleCheckSingleton = new Singleton() 执行过程中1-2-3的指令重排序，
                     *      而是保证了在一个写操作(1-2-3)完成之前，不会调用读操作 if (lazyDoubleCheckSingleton == null)。
                     *
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
