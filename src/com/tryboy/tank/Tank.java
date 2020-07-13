package com.tryboy.tank;

import java.awt.*;

public class Tank {
    // 坦克初始化位置
    private int x, y;
    // 坦克初始化方向
    private  Dir dir;
    // 坦克初始化速度
    private static final int SPEED = 10;
    //坦克初始大小
    final static int w = 50, h = 50;

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    // 坦克构造初始化
    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    // 坦克绘制
    public void paint(Graphics g) {
        // 填充矩形
        g.fillRect(x, y, w, h);

        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case Up:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            default:
                break;
        }
    }
}
