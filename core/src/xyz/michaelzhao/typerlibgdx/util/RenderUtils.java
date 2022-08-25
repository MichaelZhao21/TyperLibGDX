package xyz.michaelzhao.typerlibgdx.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RenderUtils {
    private RenderUtils() {}

    /**
     * Draws a text element on the screen
     * @param batch The SpriteBatch object
     * @param font The BitmapFont object
     * @param text The text to draw
     * @param relX Relative X position from the left of the screen (0.0 - 1.0)
     * @param relY Relative Y position from the bottom of the screen (0.0 - 1.0)
     * @param centerX True to center the text in the X direction
     * @param centerY True to center the text in the Y direction
     */
    public static void drawText(SpriteBatch batch, BitmapFont font, String text, float relX, float relY, boolean centerX, boolean centerY) {
        final GlyphLayout layout = new GlyphLayout(font, text);
        float x = Gdx.graphics.getWidth() * relX;
        float y = Gdx.graphics.getHeight() * relY;
        float adjX = centerX ? x - layout.width / 2 : x;
        float adjY = centerY ? y - layout.height / 2 : y;
        font.draw(batch, text, adjX, adjY);
    }
}
