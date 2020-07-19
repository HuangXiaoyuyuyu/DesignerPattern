package design_principles;

/**
 * @Author OliverYu
 * @Date 2020/7/19 4:17 下午
 * @Email 253757635@qq.com
 * @Description 依赖倒置原则
 */
public class DependenceInversionPrinciple {

    /**
     * 依赖倒置原则
     * 含义：1. 高层模块不应该依赖于底层模块，两者都应该依赖于抽象
     *      2. 抽象不应该依赖于细节
     *      3. 细节应该依赖于抽象
     *
     * DIP的几种用法：
     *      1. 接口声明依赖对象：在接口的方法中声明依赖对象。
     *      2. 构造函数传递依赖对象：在类中通过构造函数声明依赖对象(类似Spring中的构造器注入)，采用构造器注入。
     *      3. Setter方法传递依赖对象：在抽象中设置Setter方法声明依赖对象(类似Spring中的方法注入)。
     *
     * 优点：
     *      1. 可以通过抽象使各个类或模块的实现彼此独立，不互相影响，实现模块间的松耦合(本质)
     *      2. 可以规避一些非技术因素引起的问题
     *      3. 可以促进并行开发
     *
     * 注意点：
     *      1. 每个类尽量都要有接口或者抽象类，或者抽象类和接口都有： 依赖倒置原则的基本要求，有抽象才能依赖倒置
     *      2. 变量的表面类型尽量是接口或者抽象类
     *      3. 任何类都不因该从具体类进行派生
     *      4. 尽量不要重写基类已经写好的方法(里氏替换原则)
     *      5. 结合里氏替换原则来使用：接口负责定义public属性和方法，并且声明于其他对象的依赖关系；
     *                             抽象类负责公共构造部分的实现。
     *
     * 总结：
     *      依赖倒置原则的核心就是面向抽象(抽象类或者接口)编程
     */

}