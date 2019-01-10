package com.sanjeev.battleofmesoketes;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sanjeev.battleofmesoketes.Interface.BattleResultCallback;
import com.sanjeev.battleofmesoketes.viewmodel.BattleVewModelFactory;
import com.sanjeev.battleofmesoketes.viewmodel.BattleViewModel;
import com.sanjeev.battleofmesoketes.utils.BattleUtils;
import com.sanjeev.battleofmesoketes.databinding.ActivityBattleBinding;

public class BattleActivity extends AppCompatActivity implements BattleResultCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Integer[][] battlePoints = {{3, 4, 0, 2},
                {3, 2, 4, 0},
                {2, 0, 5, 3}};

        Toast.makeText(this, "REsult::"+(new BattleUtils().getBattleResult(battlePoints)), Toast.LENGTH_SHORT).show();

        ActivityBattleBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_battle);
        activityMainBinding.setViewModel(ViewModelProviders.of(this, new BattleVewModelFactory(this))
                .get(BattleViewModel.class));

    }

    @Override
    public void onSuccess(int result) {

    }
}
