package edu.cwu.app.makedisciples.Adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import edu.cwu.app.makedisciples.R;

public class CustomExpandableAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String> listHeader;
    private HashMap<String,List<String>>listchild;

    public CustomExpandableAdapter(Context context,List<String> listHeader,HashMap<String,List<String>>listchild){
        this.context = context;
        this.listchild = listchild;
        this.listHeader = listHeader;
    }
    @Override
    public int getGroupCount() {
        return listHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listchild.get(listHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listchild.get(listHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title =(String)getGroup(groupPosition);
        if (convertView== null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_group,null);
        }
        TextView txtTitle = (TextView)convertView.findViewById(R.id.listGroup);
        txtTitle.setTypeface(null,Typeface.BOLD);
        txtTitle.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String title =(String)getChild(groupPosition,childPosition);
        if (convertView== null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item,null);
        }
        TextView txtChild = (TextView)convertView.findViewById(R.id.listItem);
        txtChild.setText(title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
