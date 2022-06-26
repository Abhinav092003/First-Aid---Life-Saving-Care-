package com.example.firstaid.ui.treatment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.firstaid.AmputationActivity;
import com.example.firstaid.AsthmaActivity;
import com.example.firstaid.BurnsActivity;
import com.example.firstaid.ChestActivity;
import com.example.firstaid.Choking_AdultActivity;
import com.example.firstaid.Choking_babyActivity;
import com.example.firstaid.CutsActivity;
import com.example.firstaid.DiarrhoeaActivity;
import com.example.firstaid.DogbiteActivity;
import com.example.firstaid.DrowningActivity;
import com.example.firstaid.EpilepsyActivity;
import com.example.firstaid.FaintnessActivity;
import com.example.firstaid.FeverActivity;
import com.example.firstaid.FractureActivity;
import com.example.firstaid.NosebleedActivity;
import com.example.firstaid.PoisoningActivity;
import com.example.firstaid.R;
import com.example.firstaid.SnakebliteActivity;
import com.example.firstaid.StingActivity;
import com.example.firstaid.StrokeActivity;
import com.example.firstaid.databinding.FragmentHomeBinding;

import java.util.ArrayList;

import Home_App.CustomList;
import Home_App.Listview_adapter;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        ListView listView = view.findViewById(R.id.listview);
        ArrayList<CustomList> arrayList = new ArrayList<>();
        arrayList.add(new CustomList(R.drawable.amputation, "Amputation"));
        arrayList.add(new CustomList(R.drawable.asthma, "Asthma"));
        arrayList.add(new CustomList(R.drawable.burns, "Burns"));
        arrayList.add(new CustomList(R.drawable.chest_pain, "Chest Pain"));
        arrayList.add(new CustomList(R.drawable.choking_adults, "Choking (Adults)"));
        arrayList.add(new CustomList(R.drawable.vomiting_baby, "Choking (Baby)"));
        arrayList.add(new CustomList(R.drawable.cuts2, "Cuts"));
        arrayList.add(new CustomList(R.drawable.diarrhoea, "Diarrhoea"));
        arrayList.add(new CustomList(R.drawable.dog_bite, "Dog Bite"));
        arrayList.add(new CustomList(R.drawable.drowning, "Drowning"));
        arrayList.add(new CustomList(R.drawable.epilepsy, "Epilepsy"));
        arrayList.add(new CustomList(R.drawable.eye_allergies, "Eye Allergies"));
        arrayList.add(new CustomList(R.drawable.fainting, "Fiantness"));
        arrayList.add(new CustomList(R.drawable.fever, "Fever"));
        arrayList.add(new CustomList(R.drawable.fracture, "Fracture"));
        arrayList.add(new CustomList(R.drawable.headache, "HeadAche"));
        arrayList.add(new CustomList(R.drawable.insect_repellent, "Insect Repellent"));
        arrayList.add(new CustomList(R.drawable.loose_motion, "Loose Motion"));
        arrayList.add(new CustomList(R.drawable.muscular_pain, "Muscular Pain"));
        arrayList.add(new CustomList(R.drawable.neck_pain, "Neck Sprain"));
        arrayList.add(new CustomList(R.drawable.nose_bleed, "Nose Bleed"));
        arrayList.add(new CustomList(R.drawable.poisoning, "Poisoning"));
        arrayList.add(new CustomList(R.drawable.runny_nose, "Runny Nose"));
        arrayList.add(new CustomList(R.drawable.skin_allergy, "Skin Allergies"));
        arrayList.add(new CustomList(R.drawable.snake_bite, "Snake Bite"));
        arrayList.add(new CustomList(R.drawable.stings, "Stings"));
        arrayList.add(new CustomList(R.drawable.stroke, "Stroke"));
        arrayList.add(new CustomList(R.drawable.swelling, "Swelling"));
        arrayList.add(new CustomList(R.drawable.vomiting, "Vomiting"));

        Listview_adapter listview_adapter = new Listview_adapter(getActivity(), R.layout.customlistview, arrayList);
        listView.setAdapter(listview_adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {

                    Intent intent = new Intent(view.getContext(), AmputationActivity.class);
                    startActivity(intent);
                }
                if (i == 1) {

                    Intent intent = new Intent(view.getContext(), AsthmaActivity.class);
                    startActivity(intent);
                }
                if (i == 2) {

                    Intent intent = new Intent(view.getContext(), BurnsActivity.class);
                    startActivity(intent);
                }
                if (i == 3) {

                    Intent intent = new Intent(view.getContext(), ChestActivity.class);
                    startActivity(intent);
                }
                if (i == 4) {

                    Intent intent = new Intent(view.getContext(), Choking_AdultActivity.class);
                    startActivity(intent);
                }
                if (i == 5) {

                    Intent intent = new Intent(view.getContext(), Choking_babyActivity.class);
                    startActivity(intent);
                }
                if (i == 6) {

                    Intent intent = new Intent(view.getContext(), CutsActivity.class);
                    startActivity(intent);
                }
                if (i == 7) {

                    Intent intent = new Intent(view.getContext(), DiarrhoeaActivity.class);
                    startActivity(intent);
                }
                if (i == 8) {

                    Intent intent = new Intent(view.getContext(), DogbiteActivity.class);
                    startActivity(intent);
                }
                if (i == 9) {

                    Intent intent = new Intent(view.getContext(), DrowningActivity.class);
                    startActivity(intent);
                }
                if (i == 10) {

                    Intent intent = new Intent(view.getContext(), EpilepsyActivity.class);
                    startActivity(intent);
                }
                if (i == 11) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 12) {

                    Intent intent = new Intent(view.getContext(), FaintnessActivity.class);
                    startActivity(intent);
                }
                if (i == 13) {

                    Intent intent = new Intent(view.getContext(), FeverActivity.class);
                    startActivity(intent);
                }
                if (i == 14) {

                    Intent intent = new Intent(view.getContext(), FractureActivity.class);
                    startActivity(intent);
                }
                if (i == 15) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 16) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 17) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 18) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 19) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 20) {

                    Intent intent = new Intent(view.getContext(), NosebleedActivity.class);
                    startActivity(intent);
                }
                if (i == 21) {

                    Intent intent = new Intent(view.getContext(), PoisoningActivity.class);
                    startActivity(intent);
                }
                if (i == 22) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 23) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 24) {

                    Intent intent = new Intent(view.getContext(), SnakebliteActivity.class);
                    startActivity(intent);
                }
                if (i == 25) {

                    Intent intent = new Intent(view.getContext(), StingActivity.class);
                    startActivity(intent);
                }
                if (i == 26) {

                    Intent intent = new Intent(view.getContext(), StrokeActivity.class);
                    startActivity(intent);
                }
                if (i == 27) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();
                }
                if (i == 28) {
                    Toast.makeText(view.getContext(), "Coming Soon 😁", Toast.LENGTH_SHORT).show();

                }


            }
        });


    }
}