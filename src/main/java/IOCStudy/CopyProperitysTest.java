package IOCStudy;

import DTO.*;
import org.springframework.beans.*;
import org.springframework.validation.*;

import java.lang.reflect.*;
import java.util.*;

/**
 * Created by liu on 17/1/13.
 */
public class CopyProperitysTest {

    public static void main(String[] args) throws Exception{
        Class<?> clazz=Class.forName("DTO.Person");
        Object person2=clazz.newInstance();
        Field field=clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person2,"研究反射");
        System.out.println(person2);



        try {
            ArrayList<Integer> list = new ArrayList<Integer>();
            //list.add()
            Method method = list.getClass().getMethod("add", Integer.class);
            method.invoke(list, "Java反射机制实例。");
            System.out.println(list.get(0));

        }catch (Exception e){
            e.printStackTrace();
        }



        Person person=new Person();
        person.setAge(10);
        person.setAddress("xxxx");
        person.setSex(1);
        person.setName("da");

        Student student=new Student();
        BeanUtils.copyProperties(person,student);
        System.out.println(student.toString());
    }
}
