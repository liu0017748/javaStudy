package IOCStudy;

import lombok.*;

import java.util.*;

/**
 * Created by liu on 16/12/24.
 */
@Data
public class lazyInitBean {
    public  lazyInitBean(book book,String name,List<String> nameList){
        this.book=book;
        this.name=name;
        this.nameList=nameList;
    }
    private String name;
    private List<String> nameList;
    private book book;

}
