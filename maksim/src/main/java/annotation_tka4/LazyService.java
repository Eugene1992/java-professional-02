package annotation_tka4;

/**
 * Created by User on 15/12/2016.
 */
@Service(name = "SuperPuperLazyService")
public class LazyService {


    @Init
    public void lazyInit() throws Exception {
        System.out.println("lazyInit  begins");
    }


}
