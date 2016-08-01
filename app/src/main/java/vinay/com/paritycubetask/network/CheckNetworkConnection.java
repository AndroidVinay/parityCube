package vinay.com.paritycubetask.network;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by Lokesh on 01-11-2015.
 */
public class CheckNetworkConnection extends AsyncTask<Void, Void, Boolean> {
    private OnConnectionCallback onConnectionCallback;
    private Context context;
    boolean isShowProgressDialog = false;

    public CheckNetworkConnection(Context con, OnConnectionCallback onConnectionCallback) {
        this(con, false, onConnectionCallback);
    }

    public CheckNetworkConnection(Context con, boolean isShowProgressDialog, OnConnectionCallback onConnectionCallback) {
        super();
        this.onConnectionCallback = onConnectionCallback;
        this.isShowProgressDialog = isShowProgressDialog;
        this.context = con;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        if (context == null)
            return false;

        boolean isConnected = new NetWorkInfoUtility().isNetWorkAvailableNow(context);
        return isConnected;
    }

    @Override
    protected void onPostExecute(Boolean b) {
        super.onPostExecute(b);

        if (b) {
            onConnectionCallback.onConnectionSuccess();
        } else {
            String msg = "No Internet Connection";
            if (context == null)
                msg = "Context is null";
            onConnectionCallback.onConnectionFail(msg);
        }

    }

    public interface OnConnectionCallback {
        void onConnectionSuccess();

        void onConnectionFail(String errorMsg);
    }
}
