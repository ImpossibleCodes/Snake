package com.company;

import java.awt.*;

public class Snake extends GameObject {

    public Snake(int x, int y, ID id) {
        super(x, y, id);

        //velX = 1;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect((x * 32) + 16, (y * 32) + 16, 32, 32);
    }

}