package com.example.ejemplografico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }


    public class EjemploView extends View {
public EjemploView (Context context) {
        super(context);
        }
@Override
        protected void onDraw (Canvas canvas) {
    Paint pincel = new Paint();
    pincel.setColor(Color.BLUE);
    pincel.setStrokeWidth(8);
    pincel.setStyle (Paint.Style.STROKE);
    canvas.drawCircle (150,150, 100, pincel );
    Paint pincel1 = new Paint();
    pincel1.setColor(Color.RED);
    pincel1.setStrokeWidth(8);
    pincel1.setStyle (Paint.Style.STROKE);
    canvas.drawCircle (500,150, 100, pincel );
    Paint pincel2 = new Paint();
    pincel2.setColor(Color.argb (127, 0, 255, 0));
    pincel2.setStrokeWidth(8);
    pincel2.setStyle (Paint.Style.STROKE);
    canvas.drawCircle (500,327, 100, pincel2 );
    Paint pincel3 = new Paint();
    pincel3.setColor(Color.BLUE);
    pincel3.setStrokeWidth(8);
    pincel3.setStyle(Paint.Style.FILL);
    canvas.drawCircle (150, 150, 100, pincel3);
    pincel3.setColor(Color.RED);
    canvas.drawPoint(100,100,pincel3);
    canvas.drawLine (10, 10, 10, 150, pincel3);
    pincel3.setColor(Color.GREEN);
    RectF rect;
    rect = new RectF(100, 300, 150, 500);
    pincel3.setColor(getResources().getColor(R.color.color_circulo));
    canvas.drawCircle (150, 250, 100, pincel3);
    canvas.drawRect(rect,pincel3);

        }
        }
        }