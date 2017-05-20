package example.com.androidsession8assignment2;

/**
 * Created by HPWorld on 5/18/2017.
 */

import android.content.Context;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



public class CustomAdapter extends BaseAdapter {
        private Activity context;    //context
        private String[] namelist1;    //data source of the list adapter
        private String[] phlist1;


    // constructor

    CustomAdapter(Activity mainactivity,String[] namelist,String[] phlist ){
        super();
        this.context = mainactivity;
        namelist1=namelist;
        phlist1=phlist;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return namelist1.length; //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null; //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    private class Holder
    {
        TextView tvname,tvphone;

    }
    //ArrayAdapter for list of names
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        Holder holder=new Holder();
        LayoutInflater
                inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
               // inflater = context.getLayoutInflater();

        if (convertView==null)
        {
            convertView = inflater.inflate(R.layout.customlist, null);// inflate the layout for each list row

            holder.tvname=(TextView) convertView.findViewById(R.id.name);       // get the TextView for name
            holder.tvphone=(TextView) convertView.findViewById(R.id.phno);      // get the TextView for phone number
            convertView.setTag(holder);    // returns the view for the current row
        }
        else
        {
            holder=(Holder)convertView.getTag();
        }
        holder.tvname.setText(namelist1[position]);
        holder.tvphone.setText(phlist1[position]);

        return convertView;


    }

}
