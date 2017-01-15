package IOCStudy;

import IOCStudy.ComPonentScanStudy.*;
import org.junit.*;
import static org.junit.Assert.assertNotNull;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

/**
 * Created by liu on 17/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:config/bean.xml"})
public class javaConfigInXmlTest {

    @Autowired
    private book book2;

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void testBookInit(){
        assertNotNull(book2);
    }

    @Test
    public void testCompactInit(){
        assertNotNull(compactDisc);
    }
}
