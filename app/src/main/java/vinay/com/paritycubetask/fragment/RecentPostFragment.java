package vinay.com.paritycubetask.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import vinay.com.paritycubetask.GsonRequest;
import vinay.com.paritycubetask.R;
import vinay.com.paritycubetask.UrlsRepo;
import vinay.com.paritycubetask.adapter.RecentPostAdapter;
import vinay.com.paritycubetask.model.RecentPostModel;
import vinay.com.paritycubetask.network.CheckNetworkConnection;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecentPostFragment extends Fragment {

    RecyclerView list_report_post;
    View view;
    Context context;
    RecentPostModel listData;
    RecentPostAdapter recentPostAdapter;

    public RecentPostFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank, container, false);

        initialize();
        fetchdata();
        return view;
    }

    private void initialize() {
        listData = new RecentPostModel();
        list_report_post = (RecyclerView) view.findViewById(R.id.list_report_post);
        recentPostAdapter = new RecentPostAdapter(context, listData);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(context);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        list_report_post.setLayoutManager(mLayoutManager);
        list_report_post.setAdapter(recentPostAdapter);
    }


    private void fetchdata() {
        final RequestQueue requestQueue = Volley.newRequestQueue(context);


        new CheckNetworkConnection(context, false, new CheckNetworkConnection.OnConnectionCallback() {

            @Override
            public void onConnectionSuccess() {
                requestQueue.add(request);

            }

            @Override
            public void onConnectionFail(String msg) {


            }
        }).execute();

    }

    GsonRequest request = new GsonRequest(UrlsRepo.FETCH_RECENT_POST_URL, RecentPostModel.class, null, new Response.Listener<RecentPostModel>() {

        @Override
        public void onResponse(RecentPostModel response) {

            String result = response.toString();
            Log.d("RecentPostFragment", "result is : " + result);
            listData = response;
            recentPostAdapter.notifyDataSetChanged();
            recentPostAdapter = new RecentPostAdapter(context, listData);
            list_report_post.setAdapter(recentPostAdapter);

        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            if (error != null) Log.e("RecentPostFragment", error.getMessage());
        }
    });


    @Override
    public void onResume() {
        super.onResume();
    }
}
