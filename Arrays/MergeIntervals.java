package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
    private int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged = new LinkedList<>();

        for(int[] interval : intervals) {
            int[] last = new int[2];

            if(!merged.isEmpty())  last = merged.get(merged.size()-1);

            if(merged.isEmpty() || last[1] < interval[0]) {
                merged.add(interval);
            }
            else if(last[1] > interval[0] && last[1] >interval[1]) {
                continue;
            }
            else {
                last[1] = interval[1];
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] merge2(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int index=0;

        for(int i=1;i<intervals.length;i++){
            if(intervals[index][1]>=intervals[i][0]){
                intervals[index][0]=Math.min(intervals[index][0],intervals[i][0]);
                intervals[index][1]=Math.max(intervals[index][1],intervals[i][1]);
            }else{
                index++;
                intervals[index][0]=intervals[i][0];
                intervals[index][1]=intervals[i][1];
            }
        }
        int result[][]=new int[index+1][2];
        for(int i=0;i<=index;i++){
            result[i][0]=intervals[i][0];
            result[i][1]=intervals[i][1];
        }
        return result;
    }
}
