package TestInterface;

public abstract class TestAbstractServer implements TestInterface
{

    @Override
    public void test(String str)
    {

        before();
        doServer();
        after();
    }

    protected  void before()
    {
        System.out.println("----------testabstractserver   before  -------");
    }
    public abstract  void doServer();
    public  void after(){
        System.out.println("----------testabstractserver   after  -------");

    }
}
