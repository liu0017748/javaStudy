package IOCStudy;



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
}
