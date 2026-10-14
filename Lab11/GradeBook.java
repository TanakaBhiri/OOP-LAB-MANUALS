import java.util.*;

public class GradeBook {
    private final List<GradeListener> listeners=new ArrayList<>();
    void subscribe(GradeListener listener){listeners.add(listener);}
    void publish(String course,int mark){for(GradeListener l:listeners)l.onGradePublished(course,mark);}
}
