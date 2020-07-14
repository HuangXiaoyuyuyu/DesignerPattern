package behavioralpatterns.strategy.only_strategy;

/**
 * @Author OliverYu
 * @Date 2020/7/14 10:10 下午
 * @Email 253757635@qq.com
 * @Description 使用Context来查当它改变策略时的行为变化
 */
public class SortStrategyDemo {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext(new QuickSortStrategy());
        sortContext.sort();

        sortContext = new SortContext(new HeapSortStrategy());
        sortContext.sort();

        sortContext = new SortContext(new BucketSortStrategy());
        sortContext.sort();
    }
}
