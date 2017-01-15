package IOCStudy.ComPonentScanStudy;

import org.junit.*;
import static org.junit.Assert.assertNotNull;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;
import IOCStudy.book;

/**
 * Created by liu on 17/1/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = XmlInJavaConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Autowired
    private book book2;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void bookShouldNotBeNull(){assertNotNull(book2);}
}
