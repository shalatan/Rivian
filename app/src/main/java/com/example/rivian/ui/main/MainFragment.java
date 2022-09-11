package com.example.rivian.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.FragmentNavigator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.rivian.R;
import com.example.rivian.databinding.FragmentMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private FragmentMainBinding binding;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);

        View view = binding.grid1.getRoot();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Shared Element Transition not working as expected, even after following the documentations and tutorials
//                FragmentNavigator.Extras extras = new FragmentNavigator.Extras.Builder()
//                        .addSharedElement(binding.carImage, "car_image")
//                        .build();
//                Navigation.findNavController(view).navigate(
//                        R.id.action_mainFragment_to_chargingFragment,
//                        null,
//                        null,
//                        extras
//                );
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_chargingFragment);
            }
        });

        binding.grid3.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Not yet implemented", Snackbar.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

    }
}