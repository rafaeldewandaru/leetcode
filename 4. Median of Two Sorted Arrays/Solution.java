class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int size = size1+size2;

        Boolean isEven = (size%2 == 0);

        int medianIndex = (int) Math.floor(size/2);

        double median = 0;

        int[] combine = new int[size1+size2];

        int i = 0;
        int j = 0;

        int curr = 0;

        while (i < size1 && j < size2) {
            if (nums1[i] < nums2[j]) {
                combine[curr] = nums1[i];
                i++;
            }

            else {
                combine[curr] = nums2[j];
                j++;
            }

            if (isEven) {
                if (curr == medianIndex-1) {
                    median+=combine[curr];
                }
            }

            if (curr == medianIndex) {
                median+=combine[curr];
                if (isEven) {
                    return median/2;
                }
                
                return median;
            }

            curr++;

        }

        while (i < size1) {
            combine[curr] = nums1[i];
            i++;

            if (isEven) {
                if (curr == medianIndex-1) {
                    median+=combine[curr];
                }
            }

            if (curr == medianIndex) {
                median+=combine[curr];
                if (isEven) {
                    return median/2;
                }
                
                return median;
            }

            curr++;
        }

        while (j < size2) {
            combine[curr] = nums2[j];
            j++;

            if (isEven) {
                if (curr == medianIndex-1) {
                    median+=combine[curr];
                }
            }

            if (curr == medianIndex) {
                median+=combine[curr];
                if (isEven) {
                    return median/2;
                }
                
                return median;
            }

            curr++;
        }

        return 0;
    }
}