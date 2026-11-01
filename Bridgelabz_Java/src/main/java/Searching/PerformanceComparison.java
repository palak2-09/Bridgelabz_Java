package Searching;

public class PerformanceComparison {
        public static void main(String[] args) {

            int n = 1000000;

            // Measure StringBuffer execution time
            StringBuffer sbf = new StringBuffer();

            long start1 = System.nanoTime();

            for (int i = 0; i < n; i++) {
                sbf.append("hello");
            }

            long end1 = System.nanoTime();

            // Measure StringBuilder execution time
            StringBuilder sbd = new StringBuilder();

            long start2 = System.nanoTime();

            for (int i = 0; i < n; i++) {
                sbd.append("hello");
            }

            long end2 = System.nanoTime();

            // Calculate execution time in milliseconds
            double bufferTime = (end1 - start1) / 1_000_000.0;
            double builderTime = (end2 - start2) / 1_000_000.0;

            System.out.println("StringBuffer time: " + bufferTime + " ms");
            System.out.println("StringBuilder time: " + builderTime + " ms");

    }
}
