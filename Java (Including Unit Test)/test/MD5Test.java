import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MD5Test {

    @Test
    public void chechMD5() throws Exception
    {
        String currentDirectory = System.getProperty("user.dir");
        String myDirectoryPath = currentDirectory + "/src/data";

//        final String expected = "4c93ea9951a6228b9b201e99097681c5";
//
//        final String actual = MD5.getMD5Checksum(myDirectoryPath+"/");

        Assert.assertEquals(MD5.getMD5Checksum(myDirectoryPath+"/sample.exe").toUpperCase(),"480F2ADA894D30718716258D88D5B3B3"  );
        Assert.assertEquals(MD5.getMD5Checksum(myDirectoryPath+"/sample.pdf").toUpperCase(),"D2402545649A6B78ABF184A29653F15C"  );
        Assert.assertEquals(MD5.getMD5Checksum(myDirectoryPath+"/sample.png").toUpperCase(),"4C93EA9951A6228B9B201E99097681C5"  );
        Assert.assertEquals(MD5.getMD5Checksum(myDirectoryPath+"/sample.txt").toUpperCase(),"3A48074CB2C90F9B6459A948E9473120"  );

    }

}