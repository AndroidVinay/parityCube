package vinay.com.paritycubetask.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import vinay.com.paritycubetask.R;
import vinay.com.paritycubetask.activity.DetailActivity;
import vinay.com.paritycubetask.model.RecentPostModel;

/**
 * Created by asus on 7/31/2016.
 */
public class RecentPostAdapter extends RecyclerView.Adapter<RecentPostAdapter.MyViewHolder> {

    Context context;
    RecentPostModel rpModel;

    public RecentPostAdapter(Context context, RecentPostModel rpModel) {
        this.context = context;
        this.rpModel = rpModel;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recent_post_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvUserName.setText(rpModel.getData().get(position).getUser().getName());
        holder.tvKarmaCount.setText(rpModel.getData().get(position).getUser().getKarma() + " Karma");
        holder.tvTitle1.setText(rpModel.getData().get(position).getForum().getTitle());


//        holder.tv_dimmecount.setText((rpModel.getData().get(position).getTopic().getViewCount()+ " Dimer liked"));
        Picasso.with(context).load(rpModel.getData().get(position).getUser().getImage()).into(holder.civImage);
        holder.tvTitle2.setText(rpModel.getData().get(position).getTopic().getTitle());
        holder.tv_text.setText(Html.fromHtml(rpModel.getData().get(position).getForum().getDescription().toString()));
        holder.tvTitle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return rpModel.getData().size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle1, tvTitle2, tvDesription, tvUserName, tvKarmaCount, tv_text, tv_dimmecount;
        CircleImageView civImage;
        ImageView tvDimerLiked;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvTitle1 = (TextView) itemView.findViewById(R.id.tv_title1);
            tvTitle2 = (TextView) itemView.findViewById(R.id.tv_title2);
            tvUserName = (TextView) itemView.findViewById(R.id.tv_user_name);
            tvKarmaCount = (TextView) itemView.findViewById(R.id.tv_karma_count);
            tv_dimmecount = (TextView) itemView.findViewById(R.id.tv_dimmecount);
            tv_text = (TextView) itemView.findViewById(R.id.tv_text);
            tvDimerLiked = (ImageView) itemView.findViewById(R.id.tv_dimer_liked);
            civImage = (CircleImageView) itemView.findViewById(R.id.civ_image);
        }
    }
}
