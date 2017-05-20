package example.com.androidsession8assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;




public class MainActivity extends AppCompatActivity {
    ListView listView;

    // defining the array of names & phone numbers
    private final static String[] namelist={"Ruturaj B.","Reshma M.","Rishita S.",
                                        "Ankita T.","Mayuresh H.","Vidya B.",
                                        "Ajit K."};
    private final static String[] phlist={"2345678901","2345612345","7689045321","4534343421",
                                    "3456789012","2345671234","5678903412"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Setting the activity content from a layout resource
        listView=(ListView) findViewById(R.id.numberList);

        CustomAdapter adapter=new CustomAdapter(this,namelist,phlist);
        listView.setAdapter(adapter);     //Setting the data behind this ListView
    }
}
