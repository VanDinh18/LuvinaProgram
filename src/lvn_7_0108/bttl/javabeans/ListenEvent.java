package lvn_7_0108.bttl.javabeans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ListenEvent implements PropertyChangeListener{
    public void propertyChange(PropertyChangeEvent e){
        System.out.println("name: " + e.getPropertyName());
        System.out.println("old: " + e.getOldValue());
        System.out.println("new: " + e.getNewValue());
    }
}
