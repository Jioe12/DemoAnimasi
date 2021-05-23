package com.example.demoanimasi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import stanford.androidlib.graphics.GCanvas;
import stanford.androidlib.graphics.GColor;
import stanford.androidlib.graphics.GOval;

public class bola extends GCanvas {
    private GOval a;
    public bola(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void init() {
        a = new GOval(800,80,200,200);
        a.setFillColor(GColor.PURPLE);
        add(a);

        animate(20);
    }

    @Override
    public void onAnimateTick() {
        super.onAnimateTick();

        a.setX(a.getX()-10);
    }
}
