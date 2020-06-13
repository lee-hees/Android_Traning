package dsu.software.samplemovie;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    ArrayList<Movie> items = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item,viewGroup,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Movie item=items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Movie item){
        items.add(item);
    }

    public void clearItems(){
        items.clear();
    }

    public void setItems(ArrayList<Movie> items){
        this.items=items;
    }

    public Movie getItems(int position){
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView,textView2;

        public ViewHolder(View itemView){
            super(itemView);

            textView=itemView.findViewById(R.id.textview);
            textView2=itemView.findViewById(R.id.textview2);
        }

        @SuppressLint("SetTextI18n")
        public void setItem(Movie item){
            textView.setText(item.movieNm);
            textView2.setText(item.audiCnt+"명");
        }
    }

}
