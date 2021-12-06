package com.example.bt_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class tt_sinhvien_adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<tt_sinhvien> tt_sinhvienList;

    public tt_sinhvien_adapter(Context context, int layout, List<tt_sinhvien> tt_sinhvienList) {
        this.context = context;
        this.layout = layout;
        this.tt_sinhvienList = tt_sinhvienList;
    }

    @Override
    public int getCount() {
        return tt_sinhvienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        //ánh xạ view
        TextView id_classSV = (TextView) view.findViewById(R.id.id_classSV);
        TextView nameSV = (TextView) view.findViewById(R.id.nameSV);
        TextView classSV = (TextView) view.findViewById(R.id.classSV);
        ImageView imgSV = (ImageView) view.findViewById(R.id.imgSV);

        //gán giá trị
        return null;
    }
}
