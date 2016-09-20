package com.serg3d.LengthLongestPath;


/**
 * Created by Sergey on 9/18/2016.
 */
public class Solution {
    public static void main(String[] args)
    {
        String path = "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext";
        int result = LongestAbsoluteFilePath(path);
        System.out.println(result);
    }



    private static int LongestAbsoluteFilePath(String path)
    {
        // convert path to array
        //String[] pathArr = path.split("\\\\");

        // l stands for longest path, result
        int l = 0;

        // counter for \t
        int t = 0;

        // max t
        int maxT = 0;

        // iterate through array and check every char

        //for (int i = 1; i < pathArr.length; i++) {
        int i = 0;
        while(i < path.length()) {
            t = 0;
            // skip /n
            if (path.charAt(i) == '\\' && path.charAt(i+1) == 'n') i += 2;

            // count t
            while(path.charAt(i) == '\\' && path.charAt(i+1) == '\\') {
                t++;
                i+=2;
            }
            // compare maxT and t
            if (maxT < t) maxT = t;

            // increment l
            while (path.charAt(i) != '/') {
                l++;
                System.out.println(path.charAt(i));
                if (i == path.length()-1) return l;
                i++;
            }
        }

        return l;
    }
}
