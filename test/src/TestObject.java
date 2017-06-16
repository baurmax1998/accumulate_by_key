import de.cherry.Groupable;

/**
 * Created by mbaaxur on 13.06.17.
 */
public class TestObject implements Groupable {
    private String string;
    private int i;
    private boolean bool;

    public TestObject(String string, int i, boolean bool) {
        this.string = string;
        this.i = i;
        this.bool = bool;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    @Override
    public Object getGroupingKey() {
        return string;
    }
}
