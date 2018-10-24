import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SHA2Test {
    @Test
    public void testSHA2() throws Exception
    {
        String currentDirectory = System.getProperty("user.dir");
        String myDirectoryPath = currentDirectory + "/src/data";

        Assert.assertEquals(SHA2.getSHA256Checksum(myDirectoryPath+"/sample.exe").toUpperCase(),"4E82F93445DBE30051CE7AD5DE009D9F2469BA1E5DBA9DC81A969EB79CA3E537"  );
        Assert.assertEquals(SHA2.getSHA256Checksum(myDirectoryPath+"/sample.pdf").toUpperCase(),"0541432743A0EBEE55AE345B00DA644A77A9FC9245F8C689E7EC3383F3E4F333"  );
        Assert.assertEquals(SHA2.getSHA256Checksum(myDirectoryPath+"/sample.png").toUpperCase(),"A8C4E952B93E8309F75EDE67CE50528C6B109EA6192BE112EA6EBFD01962BB3E"  );
        Assert.assertEquals(SHA2.getSHA256Checksum(myDirectoryPath+"/sample.txt").toUpperCase(),"47A11432796D7DBA332B3917B408601C5A2069BA45901A7D759BB31D316567AF"  );

    }

}