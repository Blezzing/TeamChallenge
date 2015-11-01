package com.blezzing.teamchallenge;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * Created by mmhma on 31-10-2015.
 */
public class SplashScreen extends ScreenAdapter {
    private Main game;

    private OrthographicCamera guiCamera;

    public SplashScreen(Main game)
    {
        this.game = game;

        guiCamera = new OrthographicCamera(1920,1080);
        guiCamera.position.set(1920/2,1080/2,0/2);
    }

    public void render(float delta)
    {
        update();
        draw();
    }

    public void update()
    {
        if (Gdx.input.justTouched())
        {
            game.enterScreen(game.mainMenuScreen);
        }
    }

    public void draw()
    {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        guiCamera.update();

        game.batcher.setProjectionMatrix(guiCamera.combined);
        game.batcher.begin();
        game.font.draw(game.batcher,"Splash!!",1920/2,1080/2);
        game.batcher.end();
    }
}
