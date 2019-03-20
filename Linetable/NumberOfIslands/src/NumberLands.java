public class NumberLands {
/*给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。
你可以假设网格的四个边均被水包围。

示例 1:

输入:
11110
11010
11000
00000

输出: 1
示例 2:

输入:
11000
11000
00100
00011

输出: 3*/
    public static void main(String[] ae) {
        char[][] arr = {
                {'1', '1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0', '0'},
                {'1', '1', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0'}
        };


        System.out.println("岛屿个数：="+numIsLand(arr));
    }

    public static int numIsLand(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int h = grid.length;
        int w = grid[0].length;
        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfsSearch(grid, i, j, h, w);
                    prin(grid);
                }
            }
        }
        return count;
    }

    private static void dfsSearch(char[][] grid, int i, int j, int h, int w) {
        if (i < 0 || i >= h || j < 0 || j >= w) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }
        /*深度遍历把相邻的 '1' 改写为 '0' */
        grid[i][j] = '0';

        dfsSearch(grid, i + 1, j, h, w);//向下遍历
        dfsSearch(grid, i - 1, j, h, w);//向上遍历
        dfsSearch(grid, i, j + 1, h, w);//向左遍历
        dfsSearch(grid, i, j - 1, h, w);//向右遍历
    }

    public static void prin(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}
