package org.yourcompany.yourproject;
import java.util.ArrayList;

public class Body {
    ArrayList<int[]> bodyCords = new ArrayList<>();
    int currentIndex = 0;
    boolean hasGrown = false;

    public void grow(Head head) {
        // bodyCords.add(head.old_pos);
        bodyCords.add(head.old_pos);
    }

    public void move(Head head) {
        if(bodyCords.isEmpty()) return;

        bodyCords.add(0, head.old_pos);
        if(bodyCords.size() > 1) {
            bodyCords.remove(bodyCords.size() - 1);
        }

    }

    
}
