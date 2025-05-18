package iit.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ASPMain {

    public List<Activity> selectActivities(List<Activity> activities) {
        List<Activity> selected = new ArrayList<>();
        Collections.sort(activities, new ActivityComparator());

        int lastFinishTime = -1;

        for (Activity activity : activities) {
            if (activity.getStart() >= lastFinishTime) {
                selected.add(activity);
                lastFinishTime = activity.getFinish();
            }
        }

        return selected;
    }
}
