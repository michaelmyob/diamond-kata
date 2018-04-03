import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public void test1(){
        StringBuilder expectedDiamond = new StringBuilder();

        expectedDiamond.append("*\n");

        Diamond actualDiamond = new Diamond(1);
        actualDiamond.buildDiamond();
        System.out.println(actualDiamond.getDiamond());

        assertEquals(expectedDiamond.toString(), actualDiamond.getDiamond());
    }

    @Test
    public void test3(){
        StringBuilder expectedDiamond = new StringBuilder();

        expectedDiamond.append(" *\n");
        expectedDiamond.append("***\n");
        expectedDiamond.append(" *\n");

        Diamond actualDiamond = new Diamond(3);
        actualDiamond.buildDiamond();
        System.out.println(actualDiamond.getDiamond());

        assertEquals(expectedDiamond.toString(), actualDiamond.getDiamond());
    }

    @Test
    public void test5(){
        StringBuilder expectedDiamond = new StringBuilder();

        expectedDiamond.append("  *\n");
        expectedDiamond.append(" ***\n");
        expectedDiamond.append("*****\n");
        expectedDiamond.append(" ***\n");
        expectedDiamond.append("  *\n");

        Diamond actualDiamond = new Diamond(5);
        actualDiamond.buildDiamond();
        System.out.println(actualDiamond.getDiamond());

        assertEquals(expectedDiamond.toString(), actualDiamond.getDiamond());
    }

    @Test
    public void test7(){
        StringBuilder expectedDiamond = new StringBuilder();

        expectedDiamond.append("   *\n");
        expectedDiamond.append("  ***\n");
        expectedDiamond.append(" *****\n");
        expectedDiamond.append("*******\n");
        expectedDiamond.append(" *****\n");
        expectedDiamond.append("  ***\n");
        expectedDiamond.append("   *\n");

        Diamond actualDiamond = new Diamond(7);
        actualDiamond.buildDiamond();
        System.out.println(actualDiamond.getDiamond());

        assertEquals(expectedDiamond.toString(), actualDiamond.getDiamond());
    }
}
