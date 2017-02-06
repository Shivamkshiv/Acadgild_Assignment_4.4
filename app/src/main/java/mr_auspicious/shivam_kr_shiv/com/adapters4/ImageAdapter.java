package mr_auspicious.shivam_kr_shiv.com.adapters4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ImageAdapter extends ArrayAdapter<Image> {

    public ImageAdapter(Context context,  List<Image> arr) {
        super(context,0, arr);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView  = LayoutInflater.from(getContext()).inflate(R.layout.grdlist_design,parent,false);
        }

        Image shiv = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.img);
        image.setImageResource(shiv.getimageId());

        TextView txt = (TextView) listItemView.findViewById(R.id.t1);
        txt.setText(shiv.gettext());
        return listItemView;
    }
}
