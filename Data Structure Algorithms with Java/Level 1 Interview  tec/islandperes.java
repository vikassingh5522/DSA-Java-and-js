public class islandperes {

    static int perimeter = 0;   //  CHANGE: moved perimeter to class level
    static int R, C;            //  CHANGE: declare R and C globally

    public static void main(String[] args){

        int [][] grid = {{0,1,0,0}, {1,1,1,0} ,{0,1,0,0}, {1,1,0,0}}; // input

        int result = islandPerimeter(grid);  // works now because method is static
        System.out.println(result);
    }

    public static int islandPerimeter(int[][] grid) { //  CHANGE: static

        R = grid.length;          //  CHANGE: assign global R
        C = grid[0].length;       //  CHANGE: fixed grid[0].length

        for(int i = 0 ; i < R; i++){
            for(int j = 0; j < C ; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i , j );
                    return perimeter;
                }
            }
        }
        return -1;
    }

    public static void dfs(int [][] grid, int  i , int  j ){ //  CHANGE: static

        if(i < 0 || i >= R || j < 0 || j >= C || grid[i][j] == 0){ 
            perimeter++;      // edge contributes to perimeter
            return;
        }

        if(grid[i][j] == -1) return; // already visited

        grid[i][j] = -1;  // mark visited

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}