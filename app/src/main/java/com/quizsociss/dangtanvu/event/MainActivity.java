package com.quizsociss.dangtanvu.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sum(View view)
    {
        EditText edita=(EditText) findViewById(R.id.edt_soa);
        int a= Integer.parseInt(edita.getText()+"");

        EditText editb=(EditText) findViewById(R.id.edt_sob);

        int b= Integer.parseInt(editb.getText()+"");

        TextView txtkq=(TextView) findViewById(R.id.txt_kq);
        txtkq.setText((a+b)+"");
    }
}
//      Cách 2: Anonymous listener
 /*  package com.quizsociss.dangtanvu.event;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sum =(Button) findViewById(R.id.btn_tong);
        sum.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View arg0)
            {
                EditText edita = (EditText) findViewById(R.id.edt_soa);
                int a = Integer.parseInt(edita.getText() + "");

                EditText editb = (EditText) findViewById(R.id.edt_sob);

                int b = Integer.parseInt(editb.getText() + "");

                TextView txtkq = (TextView) findViewById(R.id.txt_kq);
                txtkq.setText((a + b) + "");

            }
        });
    }
} */

 // Cách 3: Activity is listener
  /*package com.quizsociss.dangtanvu.event;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
        implements OnClickListener
 {    Button sum;
      EditText edita, editb;
      TextView txtkq;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum=(Button) findViewById(R.id.btn_tong);
        sum.setOnClickListener(this);
        edita = (EditText) findViewById(R.id.edt_soa);
        editb = (EditText) findViewById(R.id.edt_sob);
        txtkq = (TextView) findViewById(R.id.txt_kq);
    }
        @Override
            public void onClick(View arg0)
            {
                int a = Integer.parseInt(edita.getText() + "");
                int b = Integer.parseInt(editb.getText() + "");
                txtkq.setText((a + b) + "");
            }
 }
*/

