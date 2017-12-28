/*

Pop-Up Orientation

In web application development, it is often required to draw a pop-up window on top of a web page when the user clicks on an icon on the page that brings up the pop-up.
You are given a web page with width x and height y, a pop-up window with width l and height m, and an icon at distance a from the left of the page and distance b from the bottom of the page.
Your program should output the orientation in which the pop-up can be rendered fully, relative to the icon, within the page dimensions. The orientation of pop up should be such that it lies completely within the page.

There are 4 possible orientations: bottom-right, bottom-left, top-right and top-left, in the same order of preference. In other words, you should first attempt to render the pop-up bottom-right, and if that is not possible, try bottom-left, and so on.

Note: Icon location and pop-up size are such that the pop-up can always be fully rendered within the page.

Input:
First line contains an integer, T , denoting the number of test cases.
Next T lines contain six space separated integers each, x, y, l, m, a and b.

Output:
For each test case, print the orientation in which the pop-up can be rendered fully, relative to the icon, within the page dimensions.

Constraints:
1=T=105

1=x=3000
1=y=3000
1=l=x
1=m=y
0=a=x
0=b=y
There is always an orientation possible such that the pop-up will lie within the page.

*/
import java.util.*;
class PopUpOrientation {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int anand = 0;anand < t;anand++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int l = scanner.nextInt();
            int m = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if((a + l <= x) && (m <= b)){
                System.out.println("bottom-right");
            }
            else if((l <= a) && (m <= b)){
                System.out.println("bottom-left");
            }
            else if((a + l <= x) && (b + m <= y)){
                System.out.println("top-right");
            }
            else if((l <= a) && (b + m <= y)){
                System.out.println("top-left");
            }
        }
    }
}
