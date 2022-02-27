package BinarySearch;

class VersionControl {

    boolean isBadVersion(int n) {

        return false;
    }

}


public class FirstBadVersion extends VersionControl{

    public int firstBadVersion(int n) {


        int start = 1;
        int end = n;

        while(start <= end) {

            int mid = start + (end-start) / 2;

            if(isBadVersion(mid - 1)) {
                end = mid;
            }
            else if(isBadVersion(mid)) {
                return mid;
            }
            else if(isBadVersion(mid+1)) {
                return mid + 1;
            }
            else {
                start = mid + 1;
            }


        }

        return -1;
    }
}
