import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SHA3Test {

    @Test
    public void testSHA3() throws Exception
    {
        String currentDirectory = System.getProperty("user.dir");
        String myDirectoryPath = currentDirectory + "/src/data";

        Assert.assertEquals(SHA3.getSHA512Checksum(myDirectoryPath+"/sample.exe").toUpperCase(),"1353EAFE82DA966E0C0D9A66240BD8BB59FACBDD257024B96D2FF44FFD3B159C073A8530A315306CE27EBBE0CA6F84299E607CF9EFC95B6251C289BB1BC4811A"  );
        Assert.assertEquals(SHA3.getSHA512Checksum(myDirectoryPath+"/sample.pdf").toUpperCase(),"DFE6D6CFCA3D6D9E41A39EC592DB4FA15EA1BD67E6A10AB1B745EB90DDC9AA5A0A445E76EAFBD17701F134355CC90A44349118DBDDC16F8DEBF610E0AB1FE787"  );
        Assert.assertEquals(SHA3.getSHA512Checksum(myDirectoryPath+"/sample.png").toUpperCase(),"CB3653A26CF348D5C736CCC6734736E90EEEDEA21B3B3F13DA06A22A63DFB6408C8FCC4C662671D4635FE503F9BB88FA65C4B0B2D847BB6352331B441A15A445"  );
        Assert.assertEquals(SHA3.getSHA512Checksum(myDirectoryPath+"/sample.txt").toUpperCase(),"EB528A4039BC2B639405CC88D7D4D5B9823D2DE4BC0E0F9E86DA458B0E93C48A8A4CE49222A6961ED1E75AC76437C02E8DEF26DB4CE0584318990012CC990B95"  );

    }

}