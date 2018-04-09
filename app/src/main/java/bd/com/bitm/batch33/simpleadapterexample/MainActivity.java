package bd.com.bitm.batch33.simpleadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] name = {"Facebook","Twitter","Instagram"};
        int [] images = {R.drawable.logo,R.drawable.twitter,R.drawable.ins};

        String [] form = {"name","image"};
        int [] to = {R.id.textView,R.id.imageView};

        ArrayList<HashMap<String,String>> data = new ArrayList<>();

        for(int i = 0; i < name.length; i++){
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put("name",name[i]);
            hashMap.put("image",images[i]+"");
            data.add(hashMap);
        }

        SimpleAdapter adapter =
                new SimpleAdapter(this,data,R.layout.custom_list_item,form,to);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
