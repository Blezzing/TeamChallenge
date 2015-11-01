package com.blezzing.teamchallenge;

import java.util.Stack;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends Game {
    private Stack<Screen> screenStack;

    public SplashScreen splashScreen;
    public MainMenuScreen mainMenuScreen;
    public MainGameScreen mainGameScreen;

    SpriteBatch batcher;
    BitmapFont font;

    @Override
    public void create() {
        screenStack = new Stack<Screen>();

        splashScreen = new SplashScreen(this);
        mainMenuScreen = new MainMenuScreen(this);
        mainGameScreen = new MainGameScreen(this);

        batcher = new SpriteBatch();
        font = new BitmapFont();

        setScreen(splashScreen);
    }

    @Override
    public void render() {
        super.render();
    }

    public void leaveCurrentScreen(Screen screen) {
        screenStack.pop();
        setScreen(screenStack.peek());
        if (screenStack.empty()) {
            Gdx.app.exit();
        }
    }

    public void enterScreen(Screen screen) {
        screenStack.push(screen);
        setScreen(screenStack.peek());
    }
}
