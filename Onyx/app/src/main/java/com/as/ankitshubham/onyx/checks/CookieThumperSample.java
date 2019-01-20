package com.as.ankitshubham.onyx.checks;


import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

import com.as.ankitshubham.onyx.mylibrary.Text;
import com.as.ankitshubham.onyx.mylibrary.TextBuilder;
import com.as.ankitshubham.onyx.mylibrary.TextSurface;
import com.as.ankitshubham.onyx.mylibrary.animations.Alpha;
import com.as.ankitshubham.onyx.mylibrary.animations.ChangeColor;
import com.as.ankitshubham.onyx.mylibrary.animations.Circle;
import com.as.ankitshubham.onyx.mylibrary.animations.Delay;
import com.as.ankitshubham.onyx.mylibrary.animations.Parallel;
import com.as.ankitshubham.onyx.mylibrary.animations.Rotate3D;
import com.as.ankitshubham.onyx.mylibrary.animations.Sequential;
import com.as.ankitshubham.onyx.mylibrary.animations.ShapeReveal;
import com.as.ankitshubham.onyx.mylibrary.animations.SideCut;
import com.as.ankitshubham.onyx.mylibrary.animations.Slide;
import com.as.ankitshubham.onyx.mylibrary.animations.TransSurface;
import com.as.ankitshubham.onyx.mylibrary.contants.Align;
import com.as.ankitshubham.onyx.mylibrary.contants.Direction;
import com.as.ankitshubham.onyx.mylibrary.contants.Pivot;
import com.as.ankitshubham.onyx.mylibrary.contants.Side;


public class CookieThumperSample {

	public static void play(TextSurface textSurface, AssetManager assetManager) {

		final Typeface robotoBlack = Typeface.createFromAsset(assetManager, "fonts/HarryP.TTF");
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setTypeface(robotoBlack);

		Text onyx = TextBuilder
				.create("ONYX")
				.setPaint(paint)
				.setSize(85)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.SURFACE_CENTER).build();

		Text welcome = TextBuilder
				.create("WELCOME")
				.setPaint(paint)
				.setSize(70)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.BOTTOM_OF, onyx).build();

		Text tothe = TextBuilder
				.create("   To The")
				.setPaint(paint)
				.setSize(60)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.RIGHT_OF, welcome).build();

		Text galgotias = TextBuilder
				.create("GALGOTIA'S")
				.setPaint(paint)
				.setSize(64)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.BOTTOM_OF, tothe).build();

		Text literary = TextBuilder
				.create(" LITERARY ")
				.setPaint(paint)
				.setSize(64)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.BOTTOM_OF | Align.CENTER_OF, galgotias).build();

		Text fest = TextBuilder
				.create(" FEST !!")
				.setPaint(paint)
				.setSize(64)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.RIGHT_OF, literary).build();

		Text by = TextBuilder
				.create("BY")
				.setPaint(paint)
				.setSize(64)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.BOTTOM_OF | Align.CENTER_OF, fest).build();

		Text lingo = TextBuilder
				.create("Lingo")
				.setPaint(paint)
				.setSize(70)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.BOTTOM_OF | Align.CENTER_OF, by).build();

		Text freaks = TextBuilder
				.create("Freaks")
				.setPaint(paint)
				.setSize(70)
				.setAlpha(0)
				.setColor(Color.BLACK)
				.setPosition(Align.BOTTOM_OF | Align.CENTER_OF, lingo).build();

		textSurface.play(
				new Sequential(
						ShapeReveal.create(onyx, 750, SideCut.show(Side.LEFT), false),
						new Parallel(ShapeReveal.create(onyx, 600, SideCut.hide(Side.LEFT), false), new Sequential(Delay.duration(300), ShapeReveal.create(onyx, 600, SideCut.show(Side.LEFT), false))),
						new Parallel(new TransSurface(500, welcome, Pivot.CENTER), ShapeReveal.create(welcome, 1300, SideCut.show(Side.LEFT), false)),
						Delay.duration(500),
						new Parallel(new TransSurface(750, tothe, Pivot.CENTER), Slide.showFrom(Side.LEFT, tothe, 750), ChangeColor.to(tothe, 750, Color.WHITE)),
						Delay.duration(500),
						new Parallel(TransSurface.toCenter(galgotias, 500), Rotate3D.showFromSide(galgotias, 750, Pivot.TOP)),
						new Parallel(TransSurface.toCenter(literary, 500), Slide.showFrom(Side.TOP, literary, 500)),
						new Parallel(TransSurface.toCenter(fest, 750), Slide.showFrom(Side.LEFT, fest, 500)),
						Delay.duration(500),
						new Parallel(
								new TransSurface(1500, freaks, Pivot.CENTER),
								new Sequential(
										new Sequential(ShapeReveal.create(by, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
										new Sequential(ShapeReveal.create(lingo, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
										new Sequential(ShapeReveal.create(freaks, 500, Circle.show(Side.CENTER, Direction.OUT), false))
								)
						),
						Delay.duration(200),
						new Parallel(
								ShapeReveal.create(by, 1500, SideCut.hide(Side.LEFT), true),
								new Sequential(Delay.duration(250), ShapeReveal.create(lingo, 1500, SideCut.hide(Side.LEFT), true)),
								new Sequential(Delay.duration(500), ShapeReveal.create(freaks, 1500, SideCut.hide(Side.LEFT), true)),
								Alpha.hide(fest, 1500),
								Alpha.hide(literary, 1500),
								Alpha.hide(galgotias,1500)
						)
				)


		);


	}


}
