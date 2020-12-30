package cs.lab;
import java.util.Random;

public class Piece {
    boolean [][]pieces= new boolean[3][3];
    public void Piece(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                pieces[i][j]=false;
            }
        }
        Random r= new Random();
        int value;
        value=r.nextInt((8-1)+1)+1;
        switch (value){
            case 1:
                    pieces[0][0]=true;
                    pieces[1][0]=true;
                    pieces[2][0]=true;
                    pieces[2][1]=true;
                    pieces[2][2]=true;
                    break;
            case 2: pieces[0][0]=true;
                    pieces[0][1]=true;
                    pieces[0][2]=true;
                    pieces[1][2]=true;
                    pieces[2][2]=true;
                    break;
            case 3: pieces[0][0]=true;
                    pieces[0][1]=true;
                    pieces[0][2]=true;
                    break;
            case 4: pieces[0][1]=true;
                    pieces[1][1]=true;
                    pieces[2][1]=true;
                    break;
            case 5: pieces[0][1]=true;
                    pieces[1][1]=true;
                    pieces[2][1]=true;
                    pieces[2][0]=true;
                    pieces[2][2]=true;
                    break;
            case 6: pieces[0][1]=true;
                    pieces[1][1]=true;
                    pieces[2][1]=true;
                    pieces[0][0]=true;
                    pieces[0][2]=true;
                    break;
            case 7: pieces[0][0]=true;
                    pieces[1][0]=true;
                    pieces[2][0]=true;
                    pieces[2][1]=true;
                    break;
            case 8: pieces[0][1]=true;
                    pieces[1][1]=true;
                    pieces[2][1]=true;
                    pieces[0][2]=true;
                    break;
        }
    }
    public boolean[][] getPieces(){
        return pieces;
    }

}
