package com.chlaung.leetcode.easy;

/**
 * @ClassName: FirstBadVersion
 * @Description: 278. First Bad Version
 *               You are a product manager and currently leading a team to develop a new product. Unfortunately,
 *               the latest version of your product fails the quality check. Since each version is developed based on
 *               the previous version, all the versions after a bad version are also bad.
 *
 *               Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 *               which causes all the following ones to be bad.
 *
 *               You are given an API bool isBadVersion(version) which will return whether version is bad.
 *               Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * @Date: 2019-09-16 17:36
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {

        // binary search
        int left = 1, right = n;

        while (left < right) {
            int mid = (right - left) / 2 + left; // avoid stack overflow

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private int badVersion = 0;

    public void setBadVersion(int version) {
        badVersion = version;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
