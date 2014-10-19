import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

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
        //List<Future<String>> list = new ArrayList<Future<String>>();
        List<Future> list = new ArrayList<Future>();
        for(int i=0;i<10;i++) {
            Callable worker = new RunnableTest();
            Future<List> submit = executor.submit(worker);
            list.add(submit);
        }
        for (Future<List> future : list) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        /*ExecutorService executor = Executors.newFixedThreadPool(4);
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
        }*/

    }

    public static void main(String[] args) throws Throwable {
        Main main = new Main();
        main.executor();
/*        main.executor.shutdown();
        Main main2 = new Main();*/
        main.executor();
    }
}
