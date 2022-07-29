package sg.edu.rp.c346.id21012377.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }
        @Override
        public View getView (int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = (LayoutInflater) parent_context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View rowView = inflater.inflate(layout_id, parent, false);

            TextView tvName = rowView.findViewById(R.id.tvName);
            TextView tvCode = rowView.findViewById(R.id.tvCC);
            TextView tvNum = rowView.findViewById(R.id.tvPNum);
            ImageView ivGender = rowView.findViewById(R.id.ivGender);

            String imageUrl ="https://i.imgur.com/tGbaZCY.jpg";
            Picasso.with(this).load(imageUrl).into(ivGender);
            Contact currentItem = contactList.get(position);
            tvName.setText((currentItem.getName()));
            tvCode.setText("+" + currentItem.getCountryCode());
            tvNum.setText(currentItem.getPhoneNum() + "");



            if (currentItem.getGender() == 'M') {
                ivGender.setImageResource(R.drawable.male);
            } else if (currentItem.getGender() == 'F') {
                ivGender.setImageResource(R.drawable.female);
            }



            return rowView;

        }
    }

