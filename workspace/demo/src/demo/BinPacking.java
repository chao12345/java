package demo;

import java.util.Arrays;
import java.util.List;

public class BinPacking {

    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(10, 3, 2, 3, 10, 1, 6, 7, 8,2,3,6,2,8,9,7,5,6,4,5,6,8,4,3,5,6,7,8,8,9,9,10,2,5,4,7,9,6);

        BinPackingBruteforce bf = new BinPackingBruteforce(in, 12);
        testBinPacking(bf, "brute force");

        FirstFitDecreasing ffd = new FirstFitDecreasing(in, 12);
        testBinPacking(ffd, "first fit decreasing");
    }

    private static void testBinPacking(AbstractBinPacking algo, String algoName) {
        long startTime;
        long estimatedTime;

        startTime = System.currentTimeMillis();
        System.out.println("needed bins (" + algoName + "): " + algo.getResult());
        algo.printBestBins();
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("in " + estimatedTime + " ms");

        System.out.println("\n\n");
    }

}
