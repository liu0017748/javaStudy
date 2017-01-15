package IOCStudy;

import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.core.io.*;


/**
 * Created by liu on 16/12/22.
 */
public class IOC_Spring {

    public static void main(String[] args){

        test();
        ApplicationContext context=new ClassPathXmlApplicationContext("config/bean.xml");
//        book book=(book) context.getBean("book");
        lazyInitBean lazyInitBean=(lazyInitBean)context.getBean("lazyInitBean");
        ClassPathResource res=new ClassPathResource("config/bean.xml");
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        int i;
        ApplicationContext ac = new FileSystemXmlApplicationContext("bean.xml");
       // ac.getBean("book");
    }

    private static void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("config/bean.xml");
        book book=(book) context.getBean("book");
        int i=0;
    }


}
