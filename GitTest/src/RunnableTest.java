import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * User: vlad
 * Date: 10/18/14
 * Time: 6:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunnableTest implements Callable {
    private ArrayList<String> list = new ArrayList<String>();
/*
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            list.add(i);
        }
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }
*/

    public ArrayList getList() {
        return list;
    }

    @Override
    public Object call() throws Exception {
        for(int i=0;i<100;i++) {
            list.add(String.valueOf(i));
         }
         System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());

        return list;
    }
}
