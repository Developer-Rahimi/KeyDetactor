package ir.otoplay.keydetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;

public class KeyDetector {
    public static final int KEY1 =1;
    public static final int KEY2 =2;
    public static final int KEY3 =3;
    public static final int KEY4 =4;
    public static final int KEY5 =5;
    public static final int KEY6 =6;
    public static final int KEY7 =7;
    public static final int KEY8 =8;
    public static final int KEY9 =9;
    public static final int KEY10 =10;
    public static final int KEY11 =11;
    public static final int KEY12 =12;
    public static final int KEY13 =13;
    public static final int KEY14 =14;
    public static final int KEY15 =15;
    public static final int KEY16 =16;
    public static final int KEY17 =17;
    public static final int KEY18 =18;
    private ServiceMangerReceiver serviceMangerReceiver=new ServiceMangerReceiver();
    Context context;
    public KeyDetector(Context context) {
        this.context=context;
        IntentFilter filter=new IntentFilter();
        filter.addAction("ServiceManager.Notification");
        context.registerReceiver(serviceMangerReceiver,filter);
    }
    public class ServiceMangerReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            String Action =intent.getStringExtra("Action");
            String Value =intent.getStringExtra("Value");
            if(Action.equals("Key")){
                if(onKeyDetectListener!=null){
                    if(Value.equals("Call")){
                        onKeyDetectListener.Detect(KEY1);
                    }
                    else if(Value.equals("Reject")){
                        onKeyDetectListener.Detect(KEY2);
                    }
                    else if(Value.equals("Radio")){
                        onKeyDetectListener.Detect(KEY3);
                    }
                    else if(Value.equals("Home")){
                        onKeyDetectListener.Detect(KEY4);
                    }
                    else if(Value.equals("Navi")){
                        onKeyDetectListener.Detect(KEY5);
                    }
                    else if(Value.equals("Mute")){
                        onKeyDetectListener.Detect(KEY6);
                    }
                    else if(Value.equals("Enter")){
                        onKeyDetectListener.Detect(KEY7);
                    }
                    else if(Value.equals("BT")){
                        onKeyDetectListener.Detect(KEY8);
                    }
                    else if(Value.equals("Brithness")){
                        onKeyDetectListener.Detect(KEY9);
                    }
                    else if(Value.equals("Back")){
                        onKeyDetectListener.Detect(KEY10);
                    }
                    else if(Value.equals("Media")){
                        onKeyDetectListener.Detect(KEY11);
                    }
                    else if(Value.equals("Setting")){
                        onKeyDetectListener.Detect(KEY12);
                    }
                    else if(Value.equals("Equalizer")){
                        onKeyDetectListener.Detect(KEY13);
                    }else if(Value.equals("Next")){
                        onKeyDetectListener.Detect(KEY14);
                    }else if(Value.equals("ChangeState")){
                        onKeyDetectListener.Detect(KEY15);
                    }
                    else if(Value.equals("Prev")){
                        onKeyDetectListener.Detect(KEY16);
                    }
                    else if(Value.equals("Left")){
                        onKeyDetectListener.Detect(KEY17);
                    }
                    else if(Value.equals("Right")){
                        onKeyDetectListener.Detect(KEY18);
                    }
                }

            }

        }
    }
    public interface OnKeyDetectListener{
        void Detect(int key);
    }
    private  OnKeyDetectListener onKeyDetectListener;
    public void setOnKeyDetectListener(OnKeyDetectListener onKeyDetectListener){
        this.onKeyDetectListener=onKeyDetectListener;
    }

}
