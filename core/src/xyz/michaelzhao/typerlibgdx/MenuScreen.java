package xyz.michaelzhao.typerlibgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.utils.ScreenUtils;
import xyz.michaelzhao.typerlibgdx.util.RenderUtils;

public class MenuScreen extends ScreenAdapter {
    Typer game;

    public MenuScreen(Typer game) {
        this.game = game;
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean keyTyped(char character) {
                System.out.println(character);
                return false;
            }
        });
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1, 1, 1, 1);

        // tell the camera to update its matrices.
        game.camera.update();

        // tell the SpriteBatch to render in the
        // coordinate system specified by the camera.
        game.batch.setProjectionMatrix(game.camera.combined);

        // Draw on screen
        game.batch.begin();
        RenderUtils.drawText(game.batch, game.font, "Typer!!", 0.5f, 0.75f, true, false);

        game.batch.end();
    }

    @Override
    public void hide(){
        Gdx.input.setInputProcessor(null);
    }
}
