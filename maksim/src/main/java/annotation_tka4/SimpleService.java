package annotation_tka4;

/**
 * Created by User on 15/12/2016.
 */
@Service(name = "SuperPuperSimpleService")
public class SimpleService {
    @Init
    public  void initService(){
        System.out.println("initService  begins");
    }

    public  void  levak(){
        System.out.println("levak  begins");
    }
}
