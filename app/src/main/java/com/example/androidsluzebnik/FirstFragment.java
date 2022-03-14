package com.example.androidsluzebnik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.androidsluzebnik.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    Bundle bundle = new Bundle();

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(1);
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(2);
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(3);
            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(4);
            }
        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(5);
            }
        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(6);
            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(7);
            }
        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(8);
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(9);
            }
        });
        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(10);
            }
        });
        binding.button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(11);
            }
        });
        binding.button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(12);
            }
        });
        binding.button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(13);
            }
        });
        binding.button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(14);
            }
        });
        binding.button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick(15);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    void myClick(int number) {
        bundle.putString("url", "file:///android_asset/index" + number + ".html");

        NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
    }

}