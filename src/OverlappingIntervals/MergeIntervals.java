package OverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // SORT THEN COMPARE !!!!!!!!!!!!!!!!
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int[] previousInterval = intervals[0];
        ArrayList<int[]> mergedIntervals = new ArrayList<>();

        for (int i = 1; i <intervals.length ; i++) {
            if(intervals[i][0]<=previousInterval[1]){
                previousInterval[1] = Math.max(previousInterval[1], intervals[i][1]);
            }else {
                mergedIntervals.add(previousInterval);
                previousInterval = intervals[i];
            }
        }
        mergedIntervals.add(previousInterval);

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);

    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));//[[1,6],[8,10],[15,18]]
    }
}
