package oneTo50.model;

import java.awt.*;
import java.util.Random;

public class UImodel {
    int currentNumber = 1;
    private Rect[] rects = new Rect[25];
    public Rect[] getRects() {
        return rects;
    }

    // set Poistion for rects
    public void setRects() {
        int i = 0;
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                rects[i] = new Rect();
                rects[i].size = 50;
                rects[i].x = 70 + x * rects[i].size;
                rects[i].y = 70 + y * rects[i].size;
                rects[i].num = i + 1;
                rects[i].color = Color.WHITE;
                rects[i].back = 26 + i;
                i += 1;
            }
        }
    }

    // Creation random numbers
    // and set numbers

    public void numShuffle() {
        Random ran = new Random();
        for (int i = 0; i < 1000; i++) {
            int r = ran.nextInt(25);
            int temp = rects[r].num;
            rects[r].num = rects[0].num;
            rects[0].num = temp;

            r = ran.nextInt(25);
            temp = rects[r].back;
            rects[r].back = rects[0].back;
            rects[0].back = temp;
        }
    }

    public Rect whoAmI(int x, int y) {
        // Find rect
        return null;
    }

    public void compare(Rect rect) {

//        if (rect.num == currentNumber) {
//            // refresh view
//            currentNumber ++;
//            // creation random number and set number
//
//        } else {
//            // ignore
//        }
    }

}
