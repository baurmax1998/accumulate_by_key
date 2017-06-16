package de.cherry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbaaxur on 16.06.17.
 */
public class DefaultStatisticObject implements Grouped {
    private List<Groupable> groupables = new ArrayList<Groupable>();


    @Override
    public void addGroupingElement(Groupable groupable) {
        groupables.add(groupable);
    }

    @Override
    public Grouped createNewInstance() {
        return new DefaultStatisticObject();
    }


    public Object getGroupingKey() {
        if(groupables.size()> 0)
            return groupables.get(0).getGroupingKey();
        return null;
    }

    public int size(){
        return groupables.size();
    }

}
