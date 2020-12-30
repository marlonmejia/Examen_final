package cs.lab;
import javax.swing.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class Blockudoku {
    static final Logger logger = Logger.getLogger(Blockudoku.class.getName());
    public boolean test=true;
    Scanner scanner= new Scanner(System.in);
    public int score=0;
    boolean [][]board=new boolean[9][9];
    public Blockudoku(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=false;
            }
        }
    }
    public void stargame(){
        Piece piece= new Piece();
        int x,y;
        logger.info("Introduzca posicion en x correspondiente a la esquina superior derecha: ");
        x= scanner.nextInt();
        logger.info("Introduzca posicion en y correspondiente a la esquina superior derecha: ");
        y=scanner.nextInt();

        Insertpiece(piece,x,y);
        boolean []row= new boolean[9];
        boolean []colum= new boolean[9];
        boolean []fillblock= new boolean[9];
        if(verifymove(piece,x,y)){
           Insertpiece(piece,x,y);
        }
        else {
            test=false;
        }
        assignscore(row,colum,fillblock);

    }
    public void Insertpiece(Piece piece, int x, int y){
        int temp=x-2;
        for (int i=x;i<x;i++){
            for(int j=y;j<y;j++){
                board[y][temp]=piece.getPieces()[i][j];
                temp++;
            }
            temp=x-2;
            y++;
        }

    }
    public boolean verifymove(Piece piece, int x,int y){
        int temp=x-2;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(piece.getPieces()[i][j] && board[y][temp]){
                    return false;
                }
                temp++;
            }
            temp=x-2;
            y++;
        }
        return true;

    }
    public void assignscore(boolean[]rows, boolean[]colums,boolean []fillblocks){
        for(int i=0;i<9;i++){
            if(rows[i]){
                score+=120;
            }
            else if(colums[i]){
                score+=120;
            }
            else if(fillblocks[i]){
                score+=150;
            }
        }
    }


}
