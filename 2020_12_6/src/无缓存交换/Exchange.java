package 无缓存交换;

public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[1] = AB[0] + AB[1];
        AB[0] = AB[1] - AB[0];
        AB[1] = AB[1] - AB[0];
        return AB;
    }
}