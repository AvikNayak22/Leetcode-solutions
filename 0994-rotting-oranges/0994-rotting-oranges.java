class Solution {
    
    private int[][] directions = {{-1,0},{0,-1},{1,0},{0,1}};
    
    public int orangesRotting(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      int freshOranges = 0;
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
              if(grid[i][j]== 1)
              {
                  ++freshOranges;
              }
          }
      }
        
      Queue<Integer> q = new LinkedList<>();
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
              if(grid[i][j] == 2)
              {
                  q.add(i * n + j);
              }
          }
      }
        
      int minutes = 0;
      while(!q.isEmpty() && freshOranges > 0)
      {
          int size = q.size();
          for(int i=0;i<size;i++)
          {
              int num = q.poll();
              int row = num / n;
              int col = num % n;
              for(int[] direction : directions)
              {
                  int x = direction[0] + row;
                  int y = direction[1] + col;
                  if( x > -1 && y > -1 && x < m && y < n && grid[x][y] == 1)
                  {
                      q.add(x * n + y);
                      --freshOranges;
                      grid[x][y] = 2;
                  }
              }
          }
          ++minutes;
      }
        
      return freshOranges == 0 ? minutes : -1;
    }
}