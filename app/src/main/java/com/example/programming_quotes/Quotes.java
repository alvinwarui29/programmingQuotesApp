package com.example.programming_quotes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Quotes {

    @GET("quotes")
    Call<List<ProgrammingQuotes>> getQuotes();
}
