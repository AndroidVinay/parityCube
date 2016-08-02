package vinay.com.paritycubetask.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import vinay.com.paritycubetask.R;
import vinay.com.paritycubetask.activity.DetailActivity;
import vinay.com.paritycubetask.model.Data;
import vinay.com.paritycubetask.model.RecentPostModel;

/**
 * Created by asus on 7/31/2016.
 */
public class RecentPostAdapter extends RecyclerView.Adapter<RecentPostAdapter.MyViewHolder> {

    Context context;
    RecentPostModel rpModel;
    Data[] data;

    public RecentPostAdapter(Context context, RecentPostModel rpModel) {
        this.context = context;
        this.rpModel = rpModel;
        data = rpModel.getData();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recent_post_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvUserName.setText(data[position].getUser().getName());
        holder.tvKarmaCount.setText(data[position].getUser().getKarma() + " Karma");
        holder.tvTitle.setText(data[position].getForum().getTitle());

        holder.tv_dimmecount.setText((data[position].getLike_count() + " Dimer liked"));
        Picasso.with(context).load(data[position].getUser().getImage()).into(holder.civImage);
        holder.tv_text.setText(Html.fromHtml(data[position].getForum().getDescription().toString()));

//        if (data[position].getPost_like_status().contains("true"))
//            holder.ivDimerLiked.set(R.drawable.ic_favorite_on);





        long now = System.currentTimeMillis();
//        Log.d("RecentPostAdapter", String.valueOf(DateUtils.getRelativeTimeSpanString(Long.parseLong(data[position].getCreated_at()), now, DateUtils.HOUR_IN_MILLIS)));
        String time = String.valueOf(DateUtils.getRelativeTimeSpanString(Long.parseLong(data[position].getCreated_at()), now, DateUtils.HOUR_IN_MILLIS));

        if (time.contains("hours ago"))
            time = time.replace("hours ago", "hr");

        if (time.contains("minute ago"))
            time = time.replace("minute ago", "min");

        if (time.contains("second ago"))
            time = time.replace("second ago", "sec");

        holder.list_time.setText(time);
        holder.tvSubTitle.setText(data[position].getTopic().getTitle());
        holder.tvSubTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        if (data == null) {
            return 0;
        }

        return data.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvSubTitle, tvDesription, tvUserName, tvKarmaCount, tv_text, tv_dimmecount, list_time;
        CircleImageView civImage;
        ToggleButton ivDimerLiked;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvSubTitle = (TextView) itemView.findViewById(R.id.tv_subtitle);
            list_time = (TextView) itemView.findViewById(R.id.list_time);
            tvUserName = (TextView) itemView.findViewById(R.id.tv_user_name);
            tvKarmaCount = (TextView) itemView.findViewById(R.id.tv_karma_count);
            tv_dimmecount = (TextView) itemView.findViewById(R.id.tv_dimmecount);
            tv_text = (TextView) itemView.findViewById(R.id.tv_text);
            ivDimerLiked = (ToggleButton) itemView.findViewById(R.id.iv_dimer_liked);
            civImage = (CircleImageView) itemView.findViewById(R.id.civ_image);
        }
    }
}
