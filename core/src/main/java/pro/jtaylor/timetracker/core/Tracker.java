package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;
    
    /**
    teste
    **/
    public void add(TimeEntry entry) {
        entries.add(entry);
    }
    /**
    teste
    **/
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }
    /**
    teste
    **/
    public int size() {
        return entries.size();
    }
    /**
    teste
    **/
    public TimeEntry get(int index) {
        boolean valid = false;
        if(valid == true){
        }
        
        return entries.get(index);
    }
}

