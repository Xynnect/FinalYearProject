package com.mygdx.game.android;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.dian.androidclasses.LogicalClassForRenderCallingActivites;
import com.mygdx.game.MyGdxGame;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by XelnectMobileUser on 2/5/2015.
 */
public class AIOLauncher extends AndroidApplication {

    private static Intent intent;
    private static Bitmap bMap;
    public static String selectedImagePath;
    public static String imageNameToBeSaved;
            //"data/ii_square_tilling.png";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyGdxGame.pictureAddress = imageNameToBeSaved;
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new MyGdxGame(), config);
    }

    public boolean onPrepareOptionsMenu(Menu menu){
        MenuItem menuItem2 = menu.findItem(R.id.option2);
        menuItem2.setTitle("");
        menuItem2.setVisible(false);
        MenuItem menuItem3 = menu.findItem(R.id.option3);
        menuItem3.setTitle("");
        menuItem3.setVisible(false);
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        invalidateOptionsMenu ();
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option1:
                //MyGdxGame.evolvingTilling = false;

                runTheGalleryChoosingMethods();
                return true;
            case R.id.option2:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (resultCode == RESULT_OK) {
            Uri selectedImageUri = data.getData();
            selectedImagePath = getPath(selectedImageUri);
            if (requestCode == 1) {
                try {
                    FileInputStream fileis=new FileInputStream(selectedImagePath);
                    BufferedInputStream bufferedstream=new BufferedInputStream(fileis);
                    byte[] bMapArray= new byte[bufferedstream.available()];
                    bufferedstream.read(bMapArray);
                    bMap = BitmapFactory.decodeByteArray(bMapArray, 0, bMapArray.length);
                    if (fileis != null){
                        fileis.close();
                    }
                    if (bufferedstream != null){
                        bufferedstream.close();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        MyGdxGame.optionSelected = true;
        //LogicalClassForRenderCallingActivites.setupPatternStyle(getCurrentClassName());
        LogicalClassForRenderCallingActivites.useSelectedImage(MyGdxGame.square1Img, selectedImagePath);
        saveBitmapToFile(bMap);
        LogicalClassForRenderCallingActivites.useImage(
                MyGdxGame.square1Img,LogicalClassForRenderCallingActivites.method2(bMap));
        //deleteUsedImage(selectedImagePath);
        goToRenderingActivity();
    }
    public void saveBitmapToFile(Bitmap bmp1) {
        String path = Environment.getExternalStorageDirectory().toString();
        OutputStream fOut = null;
        File file = new File(path, imageNameToBeSaved); // the File to save to
        try {
            fOut = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        bmp1.compress(Bitmap.CompressFormat.PNG, 85, fOut); // saving the Bitmap to a file compressed as a JPEG with 85% compression rate
        try {
            fOut.flush();
            fOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void goToRenderingActivity(){
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new MyGdxGame(), config);
    }
    public void runTheGalleryChoosingMethods(){
        intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, 1);
    }
    public String getPath(Uri uri) {
        String[] projection = { MediaStore.Images.Media.DATA };
        Cursor cursor = managedQuery(uri, projection, null, null, null);
        int column_index = cursor
                .getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        return cursor.getString(column_index);
    }
    public String getCurrentClassName() {
        String className = this.getClass().getSimpleName();
        return(className);
    }


    public static String getImageNameToBeSaved() {
        return imageNameToBeSaved;
    }

    public static void setImageNameToBeSaved(String imageNameToBeSaved) {
        SquareTillingLauncher.imageNameToBeSaved = imageNameToBeSaved;
    }

}