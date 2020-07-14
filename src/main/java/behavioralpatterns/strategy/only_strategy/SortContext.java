package behavioralpatterns.strategy.only_strategy;

/**
 * @Author OliverYu
 * @Date 2020/7/14 10:06 下午
 * @Email 253757635@qq.com
 * @Description 环境类(Context)
 */
public class SortContext {

    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        sortStrategy.sortStrategy();
    }

}
