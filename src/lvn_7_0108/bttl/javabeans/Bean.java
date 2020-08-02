package lvn_7_0108.bttl.javabeans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Bean {
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private String property1;
    private int property2;

    public String getProperty1() {
        return property1;
    }

    public int getProperty2() {
        return property2;
    }

    public void setProperty1(String property1) {
        propertyChangeSupport.firePropertyChange("property1", this.property1, property1);
        this.property1 = property1;
    }

    public void setProperty2(int property2) {
        propertyChangeSupport.firePropertyChange("property2", this.property2, property2);
        this.property2 = property2;
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener){
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }
}
