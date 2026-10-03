abstract class Test
{
    abstract void executeTest();

    void startTest()
    {
        System.out.println("Starting test");
    }
}
class GameTest extends Test
{
    @Override
    void executeTest()
    {
        System.out.println(" Executing game test");
    }
}

class basics
{
    public static void main(String[] args)
    {
        GameTest test = new GameTest();
        test.startTest();
        test.executeTest();
    }
}
