package com.serg3d.LengthLongestPath;


/**
 * Created by Sergey on 9/18/2016.
 */
public class Solution2 {
    public static void main(String[] args)
    {
        String path = "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext";
        int result = LongestAbsoluteFilePath(path);
        System.out.println(result);
    }



    private static int LongestAbsoluteFilePath(String path)
    {
        // l - counter for length
        int l = 0;

        // maxL - mex length
        int maxL = 0;

        // t - counter for t
        int t = 0;

        // maxT - max indentation
        int maxT = 0;



        for (int i = 0; i < path.length(); i++) {
            // capture l
            if (t < maxT) {
                while (path.charAt(i) != '\\' && path.charAt(i+1) != 'n') {
                    l++;
                    if (i+1 == path.length()) break;
                    i++;
                }
            }
            else {

            }




            System.out.println(path.charAt(i));

        }

        return l;
    }
}
