package com.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dian.androidclasses.LogicalClassForRenderCallingActivites;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.android.R;

public class StartingActivity extends Activity {

    public static Button SquareTillingLauncherButton;
    public static Button HexagonalTillingLauncherButton;
    public static Button TriangullarTillingLauncherButton;
    public static Button EvolvingSquareTillingLauncherButton;
    public static Button EvolvingSquareTillingLauncherButton2;
    public static Button EvolvingSquareTillingLauncherButton3;
    public static Button EvolvingHexagonalTillingLauncherButton;
    public static Button EvolvingTriangullarTillingLauncherButton;
    public static Button SnubTrihexagonalTilingLauncherButton;
    public static Button TruchetTillingLauncherButton;
    public static Button RecursiveTruchetTillingLauncherButton;
    public static Button RandomTruchetTillingLauncherButton;
    public static Button RoundEdges1TTLButton;
    public static Button RoundEdges2TTLButton;
    public static Button TTLRoundEdgesRandomColorButton;
    public static Button TriangleEdges1TTLButton;
    public static Button TriangleEdges2TTLButton;
    public static Button PenroseTillingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting_activity);


        /*PenroseTillingButton, R.id.PenroseTilling
                ,"PenroseTilling", "com.mygdx.game.android.PenroseTillingLauncher"
                ,"data/108pstriangle.png","data/ps36angle.png");*/
        LogicalClassForRenderCallingActivites.setupPatternStyle("PenroseTilling");
        MyGdxGame.imageNameToBeSavedMGG="data/108pstriangle.png";
        MyGdxGame.imageNameToBeSavedMGG2="data/ps36angle.png";
        /*try {
            Class<?> act = Class.forName( "com.mygdx.game.android.PenroseTillingLauncher");
            Intent i = new Intent(StartingActivity.this,act);
            startActivity(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        callClassTillingLauncher(SquareTillingLauncherButton, R.id.squareTillingLauncher
                , "SquareTillingLauncher", "com.mygdx.game.android.SquareTillingLauncher"
                , "data/ii_square_tilling.png");
        callClassTillingLauncher(HexagonalTillingLauncherButton, R.id.hexagonalTillingLauncher
                ,"HexagonalTillingLauncher", "com.mygdx.game.android.HexagonalTillingLauncher"
                ,"data/ii_hexagonal_tilling.png");
        callClassTillingLauncher(TriangullarTillingLauncherButton, R.id.triangullarTillingLauncher
                ,"TriangullarTillingLauncher", "com.mygdx.game.android.TriangullarTillingLauncher"
                ,"data/ii_triangular_tilling.png","data/ii_triangular_tilling_2.png");
        callClassTillingLauncher(EvolvingSquareTillingLauncherButton, R.id.evolvingSquaretiling
                ,"SquareTillingLauncher", "com.mygdx.game.android.EvolvingSquareTillingLauncher"
                ,"data/ii_square_tilling.png");
        callClassTillingLauncher(EvolvingSquareTillingLauncherButton2, R.id.evolvingSquaretiling2
                ,"SquareTillingLauncher2", "com.mygdx.game.android.EvolvingSquareTillingLauncher2"
                ,"data/ii_square_tilling.png");
        callClassTillingLauncher(EvolvingSquareTillingLauncherButton3, R.id.evolvingSquaretiling3
                ,"SquareTillingLauncher3", "com.mygdx.game.android.EvolvingSquareTillingLauncher3"
                ,"data/ii_square_tilling.png");
        callClassTillingLauncher(EvolvingHexagonalTillingLauncherButton, R.id.evolvingHexagonalTilling
                ,"EvolvingHexagonalTillingLauncher", "com.mygdx.game.android.EvolvingHexagonalTillingLauncher"
                ,"data/ii_hexagonal_tilling.png");
        callClassTillingLauncher(EvolvingTriangullarTillingLauncherButton, R.id.evolvingTriangullarTillingLauncher
                ,"EvolvingTriangullarTillingLauncher", "com.mygdx.game.android.EvolvingTriangullarTillingLauncher"
                ,"data/ii_triangular_tilling.png","data/ii_triangular_tilling_2.png");
        callClassTillingLauncher(SnubTrihexagonalTilingLauncherButton, R.id.snubTrihexagonalTilingLauncher
                ,"SnubTrihexagonalTilingLauncher", "com.mygdx.game.android.SnubTrihexagonalTilingLauncher"
                ,"data/ii_triangular_tilling.png","data/ii_triangular_tilling_2.png");
        callClassTillingLauncher(TruchetTillingLauncherButton, R.id.truchetTillingLauncher
                ,"TruchetTillingLauncher", "com.mygdx.game.android.TruchetTillingLauncher"
                ,"data/ii_truchet_tilling.png");
        callClassTillingLauncherWithDesign(RecursiveTruchetTillingLauncherButton, R.id.RecursiveTruchetTillingLauncher
                ,"RecursiveTruchetTillingLauncher", "com.mygdx.game.android.RecursiveTruchetTillingLauncher"
                ,"data/ii_truchet_tilling.png");
        callClassTillingLauncher(RandomTruchetTillingLauncherButton, R.id.RandomTruchetTillingLauncher
                ,"RandomTruchetTillingLauncher", "com.mygdx.game.android.RandomTruchetTillingLauncher"
                ,"data/ii_truchet_tilling.png");
        callClassTillingLauncher(RoundEdges1TTLButton, R.id.TTLRoundEdges1
                ,"RoundEdges1TTL", "com.mygdx.game.android.RoundEdges1TTL"
                ,"data/ii_truchet_tilling_round_edges.png");
        callClassTillingLauncher(RoundEdges2TTLButton, R.id.TTLRoundEdges2
                ,"RoundEdges2TTL", "com.mygdx.game.android.RoundEdges2TTL"
                ,"data/ii_truchet_tilling_round_edges_2.png");
        callClassTillingLauncher(TTLRoundEdgesRandomColorButton, R.id.TTLRoundEdgesRandomColor
                ,"RoundEdgesRandomColorTTL", "com.mygdx.game.android.RoundEdgesRandomColorTTL"
                ,"data/ii_truchet_tilling_round_edges_2.png");
        callClassTillingLauncher(TriangleEdges1TTLButton, R.id.TriangleEdges1TTL
                ,"TriangleEdges1TTL", "com.mygdx.game.android.TriangleEdges1TTL"
                ,"data/ii_truchet_tilling_triangle_edges.png");
        callClassTillingLauncher(TriangleEdges2TTLButton, R.id.TriangleEdges2TTL
                ,"TriangleEdges2TTL", "com.mygdx.game.android.TriangleEdges2TTL"
                ,"data/ii_truchet_tilling_triangle_edges.png");
        callClassTillingLauncher(PenroseTillingButton, R.id.PenroseTilling
                ,"PenroseTilling", "com.mygdx.game.android.PenroseTillingLauncher"
                ,"data/penrose.png");
    }

    public void callClassTillingLauncher(Button buttonTobeUsed, int RidObjectToBeCalled,
                                                final String nameOfThisLauncher, final String nameOfclassToLaunch
            ,final String image1Name ){
        //TriangullarTillingLauncher = (Button) findViewById(R.id.TriangullarTillingLauncher);
        buttonTobeUsed = (Button) findViewById(RidObjectToBeCalled);
        buttonTobeUsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LogicalClassForRenderCallingActivites.setupPatternStyle(nameOfThisLauncher);
                MyGdxGame.imageNameToBeSavedMGG=image1Name;
                try {
                    Class<?> act = Class.forName(nameOfclassToLaunch);
                    Intent i = new Intent(StartingActivity.this,act);
                    startActivity(i);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void callClassTillingLauncher(Button buttonTobeUsed, int RidObjectToBeCalled,
                                               final String nameOfThisLauncher, final String nameOfclassToLaunch
            ,final String image1Name,final String image2Name ){
        //TriangullarTillingLauncher = (Button) findViewById(R.id.TriangullarTillingLauncher);
        buttonTobeUsed = (Button) findViewById(RidObjectToBeCalled);
        buttonTobeUsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LogicalClassForRenderCallingActivites.setupPatternStyle(nameOfThisLauncher);
                MyGdxGame.imageNameToBeSavedMGG=image1Name;
                MyGdxGame.imageNameToBeSavedMGG2=image2Name;
                try {
                    Class<?> act = Class.forName(nameOfclassToLaunch);
                    Intent i = new Intent(StartingActivity.this,act);
                    startActivity(i);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void callClassTillingLauncherPenrose(Button buttonTobeUsed, int RidObjectToBeCalled,
                                         final String nameOfThisLauncher, final String nameOfclassToLaunch
            ,final String image1Name,final String image2Name ){
        //TriangullarTillingLauncher = (Button) findViewById(R.id.TriangullarTillingLauncher);
        buttonTobeUsed = (Button) findViewById(RidObjectToBeCalled);
        buttonTobeUsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LogicalClassForRenderCallingActivites.setupPatternStyle(nameOfThisLauncher);
               /* MyGdxGame.imageNameToBeSavedMGG=image1Name;
                MyGdxGame.imageNameToBeSavedMGG2=image2Name;*/
                try {
                    Class<?> act = Class.forName(nameOfclassToLaunch);
                    Intent i = new Intent(StartingActivity.this,act);
                    startActivity(i);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void callClassTillingLauncherWithDesign(Button buttonTobeUsed, int RidObjectToBeCalled,
                                         final String nameOfThisLauncher, final String nameOfclassToLaunch
            ,final String image1Name ){
        //TriangullarTillingLauncher = (Button) findViewById(R.id.TriangullarTillingLauncher);
        buttonTobeUsed = (Button) findViewById(RidObjectToBeCalled);
        setDesign(buttonTobeUsed);
        buttonTobeUsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                LogicalClassForRenderCallingActivites.setupPatternStyle(nameOfThisLauncher);
                MyGdxGame.imageNameToBeSavedMGG=image1Name;
                try {
                    Class<?> act = Class.forName(nameOfclassToLaunch);
                    Intent i = new Intent(StartingActivity.this,act);
                    startActivity(i);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void setDesign(Button buttonToBeUsed){
        buttonToBeUsed.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
    }
}
