package com.xwy.designmode.openandclose;

/**
 * Created by xuweiyu on 2020-04-01.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class OpenAndClose1 {
    public static void main(String[] args) {
        GraphicEditor1 editor = new GraphicEditor1();
        editor.drawShape(new RectShape1());
        editor.drawShape(new CircleShape1());
        editor.drawShape(new TriShape1());
    }
}

class GraphicEditor1 {
    public void drawShape(Shape1 shape) {
        shape.draw();
    }
}

abstract class Shape1 {
    abstract void draw();
}

class RectShape1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

class CircleShape1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

class TriShape1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}
