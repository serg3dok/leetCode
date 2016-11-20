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


    /*

        "dir\n\tsubdir1\n\t\file1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"

        variables:
        tabs - tab counter
        prevTabs - previous tabs
        i - iterator


                                                 i
        dir     n   t   subdir1     n   t   t    file1.ext   n   t   t    subsubdir1     n   t    subdir2    n   t   t    subsubdir2     n    t      t       t       file2.ext"
        0       1   2   3           4   5   6    7   8   9   10  11  12   13             14  15   16         17  18  19   20             21   22     23      24      25
tabs                1                   1   2    0
prevTabs            0                       1    2

                                                if file found
                                                count

        dir
            subdir1
                file1.ext
            subsubdir1
            subdir2
                subsubdir2
                    file2.ext



     */


    private static int LongestAbsoluteFilePath(String path)
    {

        // create array
        String[] pathElements = path.split("\\\\");




        // l - counter for length
        int currentLength = 0; //

        int maxLength = pathElements[0].length() + 2;  // root dir + /n (new line)

        int tabs = 0; // counter of tabs

        int prevTabs = -1; //

        String currentFolder = "";
        String previousFolder = "";

        int i = 0; // iterator

        while( i > pathElements.length) {  // iterate pathElements

        }

        /*

        if (prevTabs < tabs) {
            // iterate through all elements of array
            for (int i = pathElements[0].length() + 2; i < pathElements.length; i++) {
                while (pathElements[i] != "//" && pathElements[i+1] != "n") {
                    currentLength ++;
                    if (i == pathElements.length-1) break;
                    i++;
                }
            }
        }

        */

        return maxLength;
    }
}
