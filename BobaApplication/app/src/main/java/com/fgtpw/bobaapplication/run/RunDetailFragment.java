package com.fgtpw.bobaapplication.run;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fgtpw.bobaapplication.R;
import com.fgtpw.bobaapplication.networking.DataManager;

import data.Order;

public class RunDetailFragment extends Fragment {

    private static final String RUN_ID = "runId";
    private static final String USER_ID = "userId";

    public static RunDetailFragment getNewInstance(int runId, int userId) {
        Bundle args = new Bundle();
        args.putInt(RUN_ID, runId);
        args.putInt(USER_ID, userId);
        RunDetailFragment runDetailFragment = new RunDetailFragment();
        runDetailFragment.setArguments(args);
        return runDetailFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout linearLayout = (LinearLayout)inflater.inflate(R.layout.run_details, container, false);
        Button button = (Button)linearLayout.findViewById(R.id.join_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment orderFragment = OrderDialogFragment.getNewInstance();
                orderFragment.show(getActivity().getFragmentManager(), "order");
            }
        });
        return linearLayout;
    }

    public static class OrderDialogFragment extends DialogFragment {

        public static OrderDialogFragment getNewInstance() {
            Bundle args = new Bundle();
            OrderDialogFragment fragment = new OrderDialogFragment();
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            getDialog().setTitle("My Order");
            final View layout = inflater.inflate(R.layout.order_dialog, container, false);
            Button confirm = (Button)layout.findViewById(R.id.confirm_order);
            confirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView orderDetailsTextView = (TextView)layout.findViewById(R.id.order_details);
                    Order order = new Order(orderDetailsTextView.getText().toString(),
                            System.currentTimeMillis() + "");
                    Bundle args = getArguments();
                    DataManager dataManager = new DataManager(getActivity());
                    dataManager.addToRun(args.getInt(RUN_ID), args.getInt(USER_ID), order);
                    getDialog().dismiss();
                }
            });
            Button cancel = (Button)layout.findViewById(R.id.cancel_order);
            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getDialog().dismiss();
                }
            });

            return layout;
        }
    }
}
