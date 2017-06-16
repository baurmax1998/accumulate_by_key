package de.cherry;

/**
 * Created by mbaaxur on 15.06.17.
 */
public interface Grouped {
    public void addGroupingElement(Groupable groupable);
    public Grouped createNewInstance();
}
