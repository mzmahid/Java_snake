package org.yourcompany.yourproject;
import java.util.ArrayList;

public class Body {
    ArrayList<int[]> bodyCords = new ArrayList<>();
    int currentIndex = 0;

    public void grow(Head head) {
        // bodyCords.add(head.old_pos);
        bodyCords.add(head.old_pos);
    }

    public void move(Head head) {
        if(bodyCords.isEmpty()) return;

        bodyCords.set(currentIndex, head.old_pos);
        currentIndex = (currentIndex + 1) % bodyCords.size();
    }

    
}
