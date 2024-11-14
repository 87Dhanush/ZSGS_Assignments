import java.util.*;
public class puzzle{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] board=new char[5][5];
        for(int i=0;i<5;i++){
            Arrays.fill(board[i],'0');  // 0 =empty paths
        }
        System.out.println("Enter the position of adventure");
        int rowA=sc.nextInt()-1;
        int colA=sc.nextInt()-1;
        board[rowA][colA]='A';
        int rowG;
        int colG;
                do { 
                    System.out.println("Enter the position of gold");
                    rowG=sc.nextInt()-1; // -1 for start index from 0
                    colG=sc.nextInt()-1;
                    sc.nextLine();
        
                } while (!(positionAvailable(rowG, colG, board))); // to avoid same position for gold and adventure/monster

        board[rowG][colG]='G';
        System.out.println("Monster persent in this game(y/n) ");
        String optionForMonster =sc.nextLine();
        if(optionForMonster.equals("y")){
            int rowM;
            int colM;
                    do { 
                        System.out.println("Enter the position of Monster");
                        rowM=sc.nextInt()-1;
                        colM=sc.nextInt()-1;
            
                    } while (!(positionAvailable(rowM, colM, board)));
                    board[rowG][colG]='G';
                    showTheBoard(board);
                    int minPath1=findGoldWithMonster(rowA, colA, rowG, colG,rowM,colM, board);
            System.out.print("Minimum No of Paths : "+minPath1);
            System.err.println("");
                
    
        }
        else{
            showTheBoard(board);
            int minPath=findGoldWithoutMonster(rowA, colA, rowG, colG, board);
            System.out.print("Minimum No of Paths : "+minPath);
            System.err.println("");

        }

    }
    public static void showTheBoard(char[][] board){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.err.print( board[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static boolean positionAvailable(int row,int col,char[][] board) {
       return board[row][col]=='0';
    }

    public static int findGoldWithoutMonster(int rowA,int colA,int rowG,int colG,char[][] board){
        return Math.abs(rowA-rowG)+Math.abs(colA-colG);
    }

    public static int findGoldWithMonster(int rowA,int colA,int rowG,int colG,int rowM,int colM,char[][] board){
        int path= Math.abs(rowA-rowG)+Math.abs(colA-colG);
        if(Math.abs(rowA-rowG)>=Math.abs(rowA-rowM) && colA>colM){
          return Math.abs(rowA-rowG)+Math.abs(colA-colG);
        }
        return -1;
    }

}