package rani.kawla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.app.ListActivity;

import java.util.ArrayList;

public class ContentLists extends AppCompatActivity {
    ArrayList<String> selectedItems=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_lists);
        ListView chl=(ListView) findViewById(R.id.checkable_list);
        chl.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        String[] items={"Teknologi","Lingkungan","Energi Terbarukan","Elektronik","Makanan dan Minuman","Mainan","Media","Otomotif","Pertambangan",
                "Pertanian","Hiburan","Pemasaran"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.item_row, R.id.txt_lan, items);
        chl.setAdapter(adapter);
        chl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem=((TextView)view).getText().toString();

                if (selectedItems.contains(selectedItem)){
                    selectedItems.remove(selectedItem); //uncheckitem
                }
                else
                    selectedItems.add(selectedItem);
            }
        });


    }

    public void showSelectedItems(View view){
        String items="";
        for(String item:selectedItems){
            items+="-"+item+"\n";
            Toast.makeText(this, "you have selected \n"+items,Toast.LENGTH_LONG).show();
        }
    }
}
