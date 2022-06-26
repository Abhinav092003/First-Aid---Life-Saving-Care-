package Home_App;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.firstaid.R;

import java.util.ArrayList;

public class Listview_adapter extends ArrayAdapter<CustomList> {


    private Context ctx;
    private int img;

    public Listview_adapter(@NonNull Context context, int resource, @NonNull ArrayList<CustomList> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.img = resource;
    }

    public Listview_adapter(@NonNull Context context, int resource, @NonNull CustomList[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(ctx);
        convertView = layoutInflater.inflate(img, parent, false);
        ImageView imageView = convertView.findViewById(R.id.imageView2);
        TextView textView = convertView.findViewById(R.id.textView2);
        imageView.setImageResource(getItem(position).getImagee());
        textView.setText(getItem(position).getName());


        return convertView;
    }
}

