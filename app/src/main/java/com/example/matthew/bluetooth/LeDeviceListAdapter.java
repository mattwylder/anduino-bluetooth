package com.example.matthew.bluetooth;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by matthew on 9/19/15.
 */
public class LeDeviceListAdapter extends ArrayAdapter<BluetoothDevice> {


    public LeDeviceListAdapter(Context context, ArrayList<BluetoothDevice> devs) {
        super(context, 0, devs);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        BluetoothDevice curDev = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        TextView tv = (TextView) convertView.findViewById(R.id.namething);
        tv.setText(curDev.getName().toString());

        return convertView;
    }

    public void addDevice(BluetoothDevice device){
        Log.d("addDevice ", ""+ device.getName());
        super.add(device);

    }
}
