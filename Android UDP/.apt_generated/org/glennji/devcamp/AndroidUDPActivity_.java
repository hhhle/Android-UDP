//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package org.glennji.devcamp;

import java.net.DatagramSocket;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;
import com.googlecode.androidannotations.api.BackgroundExecutor;
import com.googlecode.androidannotations.api.SdkVersionHelper;
import org.glennji.devcamp.R.id;
import org.glennji.devcamp.R.layout;

public final class AndroidUDPActivity_
    extends AndroidUDPActivity
{

    private Handler handler_ = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.main);
    }

    private void init_(Bundle savedInstanceState) {
    }

    private void afterSetContentView_() {
        hostname = ((EditText) findViewById(id.hostname));
        port = ((EditText) findViewById(id.port));
        output = ((TextView) findViewById(id.output));
        {
            View view = findViewById(id.sendPacketButton);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    public void onClick(View view) {
                        clickSendPacketButton();
                    }

                }
                );
            }
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView_();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    public static AndroidUDPActivity_.IntentBuilder_ intent(Context context) {
        return new AndroidUDPActivity_.IntentBuilder_(context);
    }

    @Override
    public void printOutput(final String update) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    AndroidUDPActivity_.super.printOutput(update);
                } catch (RuntimeException e) {
                    Log.e("AndroidUDPActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void receiveResponse(final DatagramSocket socket) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    AndroidUDPActivity_.super.receiveResponse(socket);
                } catch (RuntimeException e) {
                    Log.e("AndroidUDPActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void sendPacket(final DatagramSocket socket, final int port) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    AndroidUDPActivity_.super.sendPacket(socket, port);
                } catch (RuntimeException e) {
                    Log.e("AndroidUDPActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, AndroidUDPActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public AndroidUDPActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

    }

}
