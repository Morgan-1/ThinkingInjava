package TestInterface;

public class TestServer extends TestAbstractServer
{



    @Override
    public void doServer()
    {
          System.out.println("--------- TestServer ------");
    }

    public void after(){
        System.out.println("--------- TestServer  after ------");
    }

}
