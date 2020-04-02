package com.xwy.designmode.openandclose;

/**
 * Created by xuweiyu on 2020-04-01.
 * email: xuweiyu@igengmei.com
 * 简介：开闭原则
 */
public class OpenAndClose {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new RectShape());
        editor.drawShape(new CircleShape());
    }
}

class GraphicEditor{
    public void drawShape(Shape shape){
        if (shape.type==1){
            drawRect();
        }else if (shape.type==2){
            drawCircle();
        }
    }

    private void drawCircle() {
        System.out.println("绘制矩形");
    }

    private void drawRect() {
        System.out.println("绘制圆形");
    }
}

class Shape{
    int type;
}

class RectShape extends Shape{
    public RectShape(){
        type=1;
    }
}

class CircleShape extends Shape{
    public CircleShape(){
        type=2;
    }
}
