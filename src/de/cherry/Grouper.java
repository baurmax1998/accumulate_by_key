package de.cherry;

import java.util.*;

/**
 * Created by mbaaxur on 13.06.17.
 */
public class Grouper {
    private Map<Object, Grouped> content = new HashMap<>();
    private Grouped grouped;


    public Grouper() {
        grouped = new DefaultStatisticObject();
    }

    public Grouper(Grouped grouped){
        this.grouped = grouped;
    }



    public int size() {
        return content.size();
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public boolean containsKey(Object key) {
        return content.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return content.containsValue(value);
    }

    public Object get(Object key) {
        return content.get(key);
    }

    public Object put(Groupable value) {
        Grouped grouped = content.get(value.getGroupingKey());
        if (grouped == null) {
           grouped = this.grouped.createNewInstance();
        }
        grouped.addGroupingElement(value);
        return content.put(value.getGroupingKey(), grouped);
    }


    public Object remove(Object key) {
        return content.remove(key);
    }

    public void putAll(List<Groupable> list) {
        for (Groupable element :
                list) {
            put(element);
        }
    }

    public void clear() {
        content.clear();
    }

    public Set keySet() {
        return content.keySet();
    }

    public Collection statistics() {
        return content.values();
    }


}
