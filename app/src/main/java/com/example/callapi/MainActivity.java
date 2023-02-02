package com.example.callapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView tvTerm, tvSource, tvUsdVnd, tvPostResult;
    Button btCallApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTerm = findViewById(R.id.tv_term);
        tvSource = findViewById(R.id.tv_source);
        tvUsdVnd = findViewById(R.id.tv_usdvnd);
        tvPostResult = findViewById(R.id.tv_Post_Result);

        btCallApi = findViewById(R.id.callApi);
        
        btCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickcallApi();//GET
            }
        });

    }

    private void clickcallApi() {
        ApiInterface.apiIterface.getApi("843d4d34ae72b3882e3db642c51e28e6", "VND","USD",1)
                .enqueue(new Callback<Currency>() {
                    @Override
                    public void onResponse(Call<Currency> call, Response<Currency> response) {
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

                        Currency currency = response.body();
                        if (currency != null && currency.getSuccess()){
                            tvTerm.setText(currency.getTerms());
                            tvSource.setText(currency.getSource());
                            tvUsdVnd.setText(String.valueOf(currency.getQuotes().getUsdVnd()));
                        }
                    }

                    @Override
                    public void onFailure(Call<Currency> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                    }
                });
    }

}