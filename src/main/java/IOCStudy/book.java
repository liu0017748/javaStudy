package IOCStudy;


import java.util.*;

/**
 * Created by liu on 16/12/22.
 */
public class book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init message");
    }
    public void destroy(){
        System.out.print("destroy message");
    }
    private String name;

    public Set getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set bookSet) {
        this.bookSet = bookSet;
    }

    private Set bookSet;

    public List getBookList() {
        return bookList;
    }

    public void setBookList(List bookList) {
        this.bookList = bookList;
    }

    private List bookList;


}
