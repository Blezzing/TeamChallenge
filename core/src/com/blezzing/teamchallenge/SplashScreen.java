package com.blezzing.teamchallenge;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by mmhma on 31-10-2015.
 */
public class SplashScreen extends ScreenAdapter {
    private Main game;

    private Viewport viewport;
    private OrthographicCamera guiCamera;

    public SplashScreen(Main game)
    {
        this.game = game;


        guiCamera = new OrthographicCamera(1920,1080);
        guiCamera.position.set(guiCamera.viewportWidth/2,guiCamera.viewportHeight/2,0);
        guiCamera.update();

        viewport = new StretchViewport(100,100,guiCamera);
        viewport.apply();


    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        viewport.update(width, height);
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
        Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batcher.setProjectionMatrix(guiCamera.combined);

        game.batcher.begin();
        game.font.draw(game.batcher,"Splash!!",500,500);
        game.batcher.end();
    }
}
