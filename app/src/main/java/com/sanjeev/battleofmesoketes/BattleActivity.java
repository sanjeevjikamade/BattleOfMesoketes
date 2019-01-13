package com.sanjeev.battleofmesoketes;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sanjeev.battleofmesoketes.Interface.BattleResultCallback;
import com.sanjeev.battleofmesoketes.viewmodel.BattleVewModelFactory;
import com.sanjeev.battleofmesoketes.viewmodel.BattleViewModel;
import com.sanjeev.battleofmesoketes.utils.BattleUtils;
import com.sanjeev.battleofmesoketes.databinding.ActivityBattleBinding;

/**
 * author::Sanjeev Jikamade
 */
public class BattleActivity extends AppCompatActivity implements BattleResultCallback {
    ActivityBattleBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_battle);
        activityMainBinding.setViewModel(ViewModelProviders.of(this, new BattleVewModelFactory(this))
                .get(BattleViewModel.class));

    }

    @Override
    public void onSuccess(int result) {
        Toast.makeText(this, "Successful Battles:: "+result, Toast.LENGTH_SHORT).show();
        activityMainBinding.tvResult.setText(""+result);
    }

    @Override
    public void onFailure(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
