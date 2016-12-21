package annotation_tka4;

/**
 * Created by User on 15/12/2016.
 */
public class AnnotationProcessor {
    public static void main(String[] args) {
       inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

    }
    static void inspectService(Class <?> service){
    if(service.isAnnotationPresent(Service.class)){
        Service ann = service.getAnnotation(Service.class);
        System.out.println(ann.name());
        System.out.println(ann.lazyLoad());
    }
        else System.out.println("Sorry");
    }
}
