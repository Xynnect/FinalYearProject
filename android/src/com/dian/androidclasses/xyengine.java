import android.util.Log;

import com.badlogic.gdx.Gdx;

/**
 * Created by XelnectMobileUser on 3/14/2015.
 */
public abstract class xyengine {
// For the swarm!!!
//xyengine as it is now can be used for methods but it is not to be used for other types of information


    public static void helloWorldExample(){
        System.out.print("hello world");
    }

    public static void helloWorldExample1(){
        System.out.print("hello world");
    }

    public static void helloWorldExample2(){
        System.out.print("hello world");
    }
    /**
     *javadoc test
     */

    public static void helloWorldExample(String stringToBeAppended){
        System.out.print("hello world" + stringToBeAppended);
    }

    public static void log(String stringToBeLogged){
        Log.e("xyengineLogging",stringToBeLogged);
    }
    public static void log(int stringToBeLogged){
        Log.e("xyengineLogging","" + stringToBeLogged);
    }
    public static void log(String logParameter,String stringToBeLogged){
        Log.e(logParameter,stringToBeLogged);
    }
    public static void log(String logParameter,int stringToBeLogged){Log.e(logParameter, "" + stringToBeLogged);}
    public static void log(float stringToBeLogged){
        Log.e("xyengineLogging","" + stringToBeLogged);
    }
    public static void log(double stringToBeLogged){
        Log.e("xyengineLogging","" + stringToBeLogged);
    }
    public static void log(boolean stringToBeLogged){
        Log.e("xyengineLogging","" + stringToBeLogged);
    }
    public static void log(String logParameter,float stringToBeLogged){
        Log.e(logParameter, "" + stringToBeLogged);
    }
    public static void log(String logParameter,double stringToBeLogged){
        Log.e(logParameter, "" + stringToBeLogged);
    }
    public static void log(String logParameter,boolean stringToBeLogged){
        Log.e(logParameter, "" + stringToBeLogged);
    }

    public static void logGdx(String stringToBeLogged){
        Gdx.app.error("xyengineLogging",stringToBeLogged);
    }
    public static void logGdx(int stringToBeLogged){
        Gdx.app.error("xyengineLogging","" + stringToBeLogged);
    }
    public static void logGdx(String logParameter,String stringToBeLogged){
        Gdx.app.error(logParameter,stringToBeLogged);
    }
    public static void logGdx(String logParameter,int stringToBeLogged){
        Gdx.app.error(logParameter,"" + stringToBeLogged);
    }
    public static void logGdx(float stringToBeLogged){
        Gdx.app.error("xyengineLogging","" + stringToBeLogged);
    }
    public static void logGdx(double stringToBeLogged){
        Gdx.app.error("xyengineLogging","" + stringToBeLogged);
    }
    public static void logGdx(boolean stringToBeLogged){
        Gdx.app.error("xyengineLogging","" + stringToBeLogged);
    }
    public static void logGdx(String logParameter,float stringToBeLogged){
        Gdx.app.error(logParameter,"" + stringToBeLogged);
    }
    public static void logGdx(String logParameter,double stringToBeLogged){
        Gdx.app.error(logParameter,"" + stringToBeLogged);
    }
    public static void logGdx(String logParameter,boolean stringToBeLogged){
        Gdx.app.error(logParameter,"" + stringToBeLogged);
    }
}
