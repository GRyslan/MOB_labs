package ua.kpi.comsys.iv8305.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ua.kpi.comsys.iv8305.R;
import ua.kpi.comsys.iv8305.models.Book;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Book> books;

    public BooksAdapter(Context context, List<Book> books) {
        this.books = books;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public BooksAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.book_entry, parent, false);
        view.getResources();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BooksAdapter.ViewHolder holder, int position) {
        Book book = books.get(position);
        String tmp = book.getImage();
        if (tmp != null) {
            holder.coverView.setImageResource(holder.coverView.getResources().getIdentifier(tmp.substring(0, tmp.lastIndexOf(".")),
                    "raw", holder.coverView.getContext().getPackageName()));
        }
        if(!book.getTitle().isEmpty()) {
            holder.titleView.setText(book.getTitle());
            holder.titleView.setTextColor(holder.titleView.getResources().getColor(R.color.black));
        }
        if(!book.getSubtitle().isEmpty()) {
            holder.subtitleView.setText(book.getSubtitle());
            holder.subtitleView.setTextColor(holder.titleView.getResources().getColor(R.color.black));
        }
        if(!book.getIsbn13().isEmpty()) {
            tmp = holder.isbnView.getResources().getString(R.string.isbn) + book.getIsbn13();
            holder.isbnView.setText(tmp);
            holder.isbnView.setTextColor(holder.titleView.getResources().getColor(R.color.black));
        }
        if(!book.getPrice().isEmpty()) {
            holder.priceView.setText(book.getPrice());
            holder.priceView.setTextColor(holder.titleView.getResources().getColor(R.color.black));
        }

        holder.priceView.setText(book.getPrice());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView coverView;
        final TextView titleView, subtitleView, isbnView, priceView;
        ViewHolder(View view){
            super(view);
            coverView = view.findViewById(R.id.cover);
            titleView = view.findViewById(R.id.title);
            subtitleView = view.findViewById(R.id.subtitle);
            isbnView = view.findViewById(R.id.isbn);
            priceView = view.findViewById(R.id.price);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

}