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
        long startTime = System.currentTimeMillis();
        int size=3;
        Blockudoku prueba=new Blockudoku();
        while (prueba.test){
            prueba.stargame();
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Assert.assertTrue(time <= 2000);


    }
}
