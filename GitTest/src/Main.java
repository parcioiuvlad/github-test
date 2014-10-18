import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 * User: vlad
 * Date: 10/18/14
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public void executor() {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        ArrayList<RunnableTest> runnableTests = new ArrayList<RunnableTest>();
        for(int i=0;i<10;i++) {
            runnableTests.add(new RunnableTest());
            executor.execute(runnableTests.get(i));
        }
        executor.shutdown();

        while(!executor.isShutdown()) {
        }

        for(int i=0;i<10;i++) {
            System.out.println(runnableTests.get(i).getList());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.executor();
        Main main2 = new Main();
        main2.executor();
        /*System.out.println("Main git test");
        System.out.println("second push");*/
    }
}
