package com.blezzing.teamchallenge;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by mmhma on 31-10-2015.
 */
public class MainMenuScreen extends ScreenAdapter {
    private Main game;

    public MainMenuScreen(Main game)
    {
        this.game = game;
    }

    public void render(float delta)
    {
        update();
        draw();
    }

    public void update()
    {
    }

    public void draw()
    {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}