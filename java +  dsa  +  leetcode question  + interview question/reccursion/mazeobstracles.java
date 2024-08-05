package reccursion;

public class mazeobstracles {
    static void  pathRestrictions(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1) {
             pathRestrictions(p+"D", maze, r+1, c);
        }

        if (c<maze[0].length-1) {
             pathRestrictions(p+"R", maze, r, c+1);
        }
    }

    // static void  allpath(String p,boolean[][] maze,int r,int c){
    //     if(r==maze.length-1 && c==maze[0].length-1){
    //         System.out.println(p);
    //         return;
    //     }
    //     if(!maze[r][c]){
    //         return;
    //     }
    //     if(r<maze.length-1) {
    //          allpath(p+"D", maze, r+1, c);
    //     }

    //     if (c<maze[0].length-1) {
    //          allpath(p+"R", maze, r, c+1);
    //     }
    //     if(r>0) allpath(p+"U", maze, r-1, c);
    //     if(c>0) allpath(p+"L", maze, r, c-1);
    // }
    public static void main(String[] args) {
         boolean [][] maze={{true,true,true},{true,false,false},{false,true,true}};
         
         pathRestrictions("", maze, 0, 0);
         //allpath("", maze, 0, 0);
    }
}
