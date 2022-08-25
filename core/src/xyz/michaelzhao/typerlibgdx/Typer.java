package xyz.michaelzhao.typerlibgdx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import xyz.michaelzhao.typerlibgdx.util.Word;

import java.util.HashSet;
import java.util.Set;

public class Typer extends Game {
	protected OrthographicCamera camera;
	protected SpriteBatch batch;
	protected ShapeRenderer shapeRenderer;
	protected BitmapFont font;

	protected long lastWordTime;

	protected Set<Word> wordList;

	@Override
	public void create () {
		// Set windowed mode
		Gdx.graphics.setWindowedMode(1000, 600);
		// Initialize list
		wordList = new HashSet<>();

		// create the camera and the SpriteBatch
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1000, 600);
		batch = new SpriteBatch();

		// Initialize renderers
		shapeRenderer = new ShapeRenderer();

		// Generate the font
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("Roboto-Regular.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.size = 100;
		parameter.color = Color.BLACK;
		font = generator.generateFont(parameter);
		generator.dispose();

		System.out.println(font);

		// Set the starting screen
		setScreen(new MenuScreen(this));
	}
	
	@Override
	public void dispose () {
	}

	public void addWord() {

	}
}
