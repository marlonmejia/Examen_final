import org.testng.Assert;
import org.testng.annotations.Test;
import cs.lab.Blockudoku;
import cs.lab.Piece;


@Test
public class Blockudokutest {

    @Test
    public void Test1(){
        Blockudoku test1= new Blockudoku();
        Assert.assertEquals(0,test1.score);
    }
    @Test
    public void Test2(){
        Piece test= new Piece();
        boolean count=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!test.getPieces()[i][j])
                    count=false;
            }
        }
        Assert.assertFalse(count);
    }


    @Test
    public void Test3(){
        long startTime = System.currentTimeMillis();
        Blockudoku prueba=new Blockudoku();
        while (prueba.test){
            prueba.stargame();
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Assert.assertTrue(time >= 2000);


    }
}
