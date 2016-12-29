package ThreadStudy.Asy;

/**
 * Created by liu on 16/12/26.
 */
public class CakeBaker implements Cake{
    private final String cake;
    public CakeBaker(int count,char c){
        char[] buffer=new char[count];
        for(int i=0;i<count;i++){
            buffer[i]=c;
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("making cake("+count+","+c+") END ");
        this.cake=new String(buffer);
    }
    public  String getCake(){
        return cake;
    }
}
