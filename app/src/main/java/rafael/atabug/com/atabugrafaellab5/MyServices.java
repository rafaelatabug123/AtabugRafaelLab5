package rafael.atabug.com.atabugrafaellab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyServices extends IntentService {
        public MyServices()
        {
            super("MyServices");
        }

        protected void onHandleIntent(@Nullable Intent intent){
            Log.d("4ITH", "My Services is executing");
        }
}
