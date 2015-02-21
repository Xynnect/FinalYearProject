package com.mygdx.game.android;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.MyGdxGame;

/**
 * Created by XelnectMobileUser on 2/19/2015.
 */
public class RecursiveTruchetTillingLauncher extends AIOLauncherNoOptions {
    public RecursiveTruchetTillingLauncher(){
        AIOLauncherNoOptions.imageNameToBeSaved = "data/ii_truchet_tilling.png";
        MyGdxGame.intToBeReduced1=1;
        MyGdxGame.intToBeReduced2=1;
        MyGdxGame.doneOnce=false;
        //MyGdxGame.arraySpriteX = new Array<Sprite>();
        //MyGdxGame.evolvingTilling = false;
    }
}