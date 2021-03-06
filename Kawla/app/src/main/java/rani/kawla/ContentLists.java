package rani.kawla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class ContentLists extends AppCompatActivity {
    ArrayList<String> selectedItems=new ArrayList<>();
    private Button btnDone;
    private String selectedItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_lists);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        btnDone = (Button) findViewById(R.id.btn_done);

        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.iconkawla);
        ListView chl=(ListView) findViewById(R.id.checkable_list);
        chl.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        String[] items={"Asuransi","Bioteknologi","Elektronik","Farmasi","Firma Akuntansi","Ikan","Jamu","Jasa",
                "Jasa Keuangan","Kayu","Kimia","Logam","Logistik","Mainan","Makanan","Manufaktur","Media","Militer","Minuman",
        "Minyak","Otomotif","Penerbit","Pertambangan","Pertanian",};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.item_row, R.id.txt_lan, items);
        chl.setAdapter(adapter);

        chl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedItem=((TextView)view).getText().toString();

                if (selectedItems.contains(selectedItem)){
                    selectedItems.remove(selectedItem); //uncheckitem
                }
                else
                    selectedItems.add(selectedItem);
           }
        });

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContentLists.this, NewsActivity.class);
                startActivity(intent);
                //Toast.makeText(ContentLists.this, selectedItems.toString(),Toast.LENGTH_LONG).show();
                startActivity(new Intent(ContentLists.this, SliderActivity.class));
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

