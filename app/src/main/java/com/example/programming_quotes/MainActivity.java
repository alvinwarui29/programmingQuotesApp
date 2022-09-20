package com.example.programming_quotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private List<ProgrammingQuotes> mProgrammingQuotes = new ArrayList<>();
    private PQAdapter mPQAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mPQAdapter = new PQAdapter(this, mProgrammingQuotes);
        mRecyclerView.setAdapter(mPQAdapter);


        requestQuotes();
    }


    private void requestQuotes() {

        Quotes quotesInterface = RetrofitServiceGenerator.createRetrofitService(Quotes.class);

        Call<List<ProgrammingQuotes>> call = quotesInterface.getQuotes();


        call.enqueue(new Callback<List<ProgrammingQuotes>>() {
            @Override
            public void onResponse(Call<List<ProgrammingQuotes>> call, Response<List<ProgrammingQuotes>> response) {

                if (response.isSuccessful()) {

                    for (ProgrammingQuotes quote : response.body()) {
                        mProgrammingQuotes.add(quote);
                    }
                    mPQAdapter.notifyDataSetChanged();
                } else {

                    Log.e(TAG, response.message());

                }
            }

            @Override
            public void onFailure(Call<List<ProgrammingQuotes>> call, Throwable t) {
                Log.e(TAG, t.getMessage());

            }
        });

    }
}