package com.fgtpw.bobaapplication.new_run;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import com.fgtpw.bobaapplication.R;

import java.util.Calendar;

public class NewRunFragment extends Fragment {

    private static TextView endTimeTextView;
    public static final String RESTURANT_ARG = "resturant_name";

    public static NewRunFragment newInstance(String resturantName) {
        NewRunFragment fragment = new NewRunFragment();
        Bundle args = new Bundle();
        args.putString(RESTURANT_ARG, resturantName);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle args = getArguments();
        View linearLayout = inflater.inflate(R.layout.hostorder, container, false);

        TextView restaurantNameTextView = (TextView) linearLayout.findViewById(R.id.business_name);
        restaurantNameTextView.setText(args.getString(RESTURANT_ARG));

        endTimeTextView = (TextView) linearLayout.findViewById(R.id.order_end_time);
        endTimeTextView.setText(formatTime(getInitialTime()));
        Button changeTimeButton = (Button) linearLayout.findViewById(R.id.change_end_time);
        changeTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment newFragment = TimePickerFragment.getNewInstance(getInitialTime());
                newFragment.show(getActivity().getFragmentManager(), "timePicker");
            }
        });

        final Button confirmButton = (Button)linearLayout.findViewById(R.id.confirm);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // save to database
            }
        });
        return linearLayout;
    }

    private static String formatTime(Calendar c) {

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        return formatter.format(c.getTime());
    }

    private Calendar getInitialTime() {
        Calendar current = Calendar.getInstance();
        current.add(Calendar.HOUR_OF_DAY, 1);
        return current;
    }

    public static class TimePickerFragment extends DialogFragment implements
            TimePickerDialog.OnTimeSetListener {

        private static final String HOUR = "hour";
        private static final String MINUTE = "minute";

        public static TimePickerFragment getNewInstance(Calendar initial) {
            int hour = initial.get(Calendar.HOUR_OF_DAY);
            int minute = initial.get(Calendar.MINUTE);

            Bundle arguments = new Bundle();
            arguments.putInt(HOUR, hour);
            arguments.putInt(MINUTE, minute);

            TimePickerFragment fragment = new TimePickerFragment();
            fragment.setArguments(arguments);
            return fragment;
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker

            Bundle arguments = getArguments();
            int hour = arguments.getInt(HOUR);
            int minute = arguments.getInt(MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, hourOfDay);
            cal.set(Calendar.MINUTE, minute);
            endTimeTextView.setText(formatTime(cal));
        }
    }


}
