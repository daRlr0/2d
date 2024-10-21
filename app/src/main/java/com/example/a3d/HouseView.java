package com.example.a3d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class HouseView extends View {
    private Paint paint;

    public HouseView(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       
        int width = getWidth();
        int height = getHeight();


        paint.setColor(Color.WHITE);
        canvas.drawRect(0, 0, width, height * 2 / 3, paint);


        paint.setColor(Color.GREEN);
        canvas.drawRect(0, height * 2 / 3, width, height, paint);


        int houseWidth = width / 2;
        int houseHeight = height / 4;
        int houseLeft = (width - houseWidth) / 2;
        int houseTop = height * 2 / 3 - houseHeight;


        paint.setColor(Color.rgb(150, 75, 0));
        canvas.drawRect(houseLeft, houseTop, houseLeft + houseWidth, houseTop + houseHeight, paint);


        paint.setColor(Color.DKGRAY);
        int roofHeight = houseWidth / 2;
        canvas.drawLine(houseLeft, houseTop, houseLeft + houseWidth / 2, houseTop - roofHeight, paint);
        canvas.drawLine(houseLeft + houseWidth, houseTop, houseLeft + houseWidth / 2, houseTop - roofHeight, paint);


        int windowWidth = houseWidth / 5;
        int windowHeight = houseHeight / 5;
        int windowLeft = houseLeft + houseWidth / 4;
        int windowTop = houseTop + houseHeight / 4;

        paint.setColor(Color.BLUE);
        canvas.drawRect(windowLeft, windowTop, windowLeft + windowWidth, windowTop + windowHeight, paint);


        paint.setColor(Color.DKGRAY);
        for (int i = windowLeft; i <= windowLeft + windowWidth; i += 20) {
            canvas.drawLine(i, windowTop, i, windowTop + windowHeight, paint);
        }
        for (int j = windowTop; j <= windowTop + windowHeight; j += 20) {
            canvas.drawLine(windowLeft, j, windowLeft + windowWidth, j, paint);
        }


        int doorWidth = houseWidth / 6;
        int doorHeight = houseHeight / 2;
        int doorLeft = houseLeft + houseWidth * 2 / 3;
        int doorTop = houseTop + houseHeight - doorHeight;

        paint.setColor(Color.DKGRAY);
        canvas.drawRect(doorLeft, doorTop, doorLeft + doorWidth, doorTop + doorHeight, paint);


        for (int i = doorTop; i < doorTop + doorHeight; i += 20) {
            canvas.drawLine(doorLeft, i, doorLeft + doorWidth, i, paint);
        }


        int treeHeight = houseHeight * 2;
        int treeWidth = houseWidth / 3;
        int treeLeft = houseLeft + houseWidth + 50;

        paint.setColor(Color.rgb(34, 139, 34));
        canvas.drawOval(treeLeft, houseTop - treeHeight / 2, treeLeft + treeWidth, houseTop + treeHeight / 2, paint);


        int trunkWidth = treeWidth / 3;
        int trunkHeight = treeHeight / 3;
        paint.setColor(Color.rgb(139, 69, 19)); // Коричневый цвет
        canvas.drawRect(treeLeft + trunkWidth, houseTop + treeHeight / 2, treeLeft + trunkWidth * 2, houseTop + treeHeight / 2 + trunkHeight, paint);




    }
}
