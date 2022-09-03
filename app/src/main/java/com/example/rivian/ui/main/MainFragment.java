package com.example.rivian.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rivian.R;
import com.example.rivian.databinding.FragmentMainBinding;

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
//                Shared Element Transition Not Working
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
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

    }
}