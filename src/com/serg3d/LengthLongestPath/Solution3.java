package com.serg3d.LengthLongestPath;



/**
 * Created by Sergey on 9/18/2016.
 */
public class Solution3 {
    public static void main(String[] args)
    {
        String path = "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext";
        int result = LongestAbsoluteFilePath(path);
        System.out.println();
        System.out.println(result);
    }



    private static int LongestAbsoluteFilePath(String path)
    {
        // l - counter for length
        int l = 0;

        int t = 0;

        String currentFolder = "";
        String previousFolder = "";

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) != '\\') {
                currentFolder += path.charAt(i);
            }

            l++;
            i++;
            if (path.charAt(i) == 'n') {
                l++;
                i++;
            }

        }
        System.out.println(currentFolder);


        return l;
    }
}
