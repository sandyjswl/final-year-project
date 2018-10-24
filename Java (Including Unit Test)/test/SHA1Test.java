import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SHA1Test {

    @Test
    public void testSHA1() throws Exception
    {
        String currentDirectory = System.getProperty("user.dir");
        String myDirectoryPath = currentDirectory + "/src/data";

        Assert.assertEquals(SHA1.getSHA1Checksum(myDirectoryPath+"/sample.exe").toUpperCase(),"8043F3BDFAA938838D5E7FCF780E99B354F2B2F2"  );
        Assert.assertEquals(SHA1.getSHA1Checksum(myDirectoryPath+"/sample.pdf").toUpperCase(),"79C864AA5BB1424EA627B152FFAFF9B5EC3CFC33"  );
        Assert.assertEquals(SHA1.getSHA1Checksum(myDirectoryPath+"/sample.png").toUpperCase(),"2D48D08C41C09C2BE0E7DDC0E7FAF73BE42E7794"  );
        Assert.assertEquals(SHA1.getSHA1Checksum(myDirectoryPath+"/sample.txt").toUpperCase(),"995FB9C17343C78FED68E6F0744440313BCFB517"  );

    }

}