package com.serg3d.LengthLongestPath;



/**
 * Created by Sergey on 9/18/2016.
 */
public class Solution4 {
    public static void main(String[] args)
    {
        String path = "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext";
        int result = LongestAbsoluteFilePath(path);
        System.out.println();
        System.out.println(result);
    }



    private static int LongestAbsoluteFilePath(String path)
    {

        // create array
        String[] folders = path.split("\\\\");



        // l - counter for length
        int currentLength = 0;

        int maxLength = folders[0].length() + 2;

        int tabs = 0;

        int prevTabs = -1;

        String currentFolder = "";
        String previousFolder = "";

        if (prevTabs < tabs) {
            // iterate through all elements of array
            for (int i = folders[0].length() + 2; i < folders.length; i++) {
                while (folders[i] != "//" && folders[i+1] != "n") {
                    currentLength ++;
                    if (i == folders.length-1) break;
                    i++;
                }


            }
        }






        return maxLength;
    }
}
