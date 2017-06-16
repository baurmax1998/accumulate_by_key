import de.cherry.Groupable;
import de.cherry.Grouped;
import de.cherry.Grouper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Groupable> testDatas = getTestDatas();
        testDefault(testDatas);
        testCustomGruped(testDatas);

        System.out.println("ende");
    }

    private static void testCustomGruped(List<Groupable> testDatas) {
        Grouper grouper = new Grouper(new Grouped() {
            @Override
            public void addGroupingElement(Groupable groupable) {
                System.out.println(groupable.getGroupingKey());
            }

            @Override
            public Grouped createNewInstance() {
                try {
                    return this.getClass().newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                return null;
            }
        });
        grouper.putAll(testDatas);
    }


    private static List<Groupable> getTestDatas(){
        TestObject[] testObjects
                = new TestObject[]{
                new TestObject("hallo", 1, true)
                , new TestObject("hallo", 0, false)
                , new TestObject("hallo2", 0, false)
        };
        ArrayList<Groupable> testObjects1 = new ArrayList<>();
        for (TestObject t :
                testObjects) {
            testObjects1.add(t);
        }return testObjects1;
    }


    public static void testDefault(List<Groupable> testDatas){
        Grouper grouper = new Grouper();
        grouper.putAll(testDatas);
    }
}
