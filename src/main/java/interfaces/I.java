package interfaces;

public interface I {
    void f();

    default void g(){
    }

    static void s(){
    }
}

class A implements I {

    @Override
    public void f() {

    }
}
