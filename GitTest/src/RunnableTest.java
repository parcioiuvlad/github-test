import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: vlad
 * Date: 10/18/14
 * Time: 6:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunnableTest implements Runnable {
    private ArrayList<Integer> list = new ArrayList<Integer>();
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            list.add(i);
        }
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }

    public ArrayList getList() {
        return list;
    }
}
