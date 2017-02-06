package mr_auspicious.shivam_kr_shiv.com.adapters4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grdlst);

        ArrayList<Image> arr = new ArrayList<>();
        arr.add(new Image(R.drawable.gingerbread, "GingerBread"));
        arr.add(new Image(R.drawable.images, "HoneyComb"));
        arr.add(new Image(R.drawable.ic, "Ice Cream Sandwich"));
        arr.add(new Image(R.drawable.jelly, "JellyBean"));
        arr.add(new Image(R.drawable.download, "Kitkat"));
        arr.add(new Image(R.drawable.lollipo,"Lolipop"));

        GridView grid = (GridView) findViewById(R.id.grd);
        ImageAdapter imageAdapter = new ImageAdapter(MainActivity.this,arr);
        grid.setAdapter(imageAdapter);

    }
}
