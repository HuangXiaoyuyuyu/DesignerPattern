package behavioral_patterns.strategy.only_strategy;

/**
 * @Author OliverYu
 * @Date 2020/7/14 9:59 下午
 * @Email 253757635@qq.com
 * @Description 对排序策略
 */
public class HeapSortStrategy implements SortStrategy {

    public void sortStrategy() {
        System.out.println("采用堆排序策略。。。");
    }

}
