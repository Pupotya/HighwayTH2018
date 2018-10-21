package Lesson16;

import okhttp3.*;

import java.io.IOException;

public class TrelloApi {

    public static final String KEY = "5e8fd9836aa5b172ef1b38a402f15830";
    public static final String TOKEN = "b9e8c0d8c8384ef9ad596c247cab3e93d5072cbbbbe12782dd41b714b78fce86";


    OkHttpClient client = new OkHttpClient();

    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),json);
        Request request = new Request.Builder().url(url).post(body).build();
        Response response  = client.newCall(request).execute();
        return response.body().string();
    }

    public String getRequest(String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader("Accept-Language", "en-US,en;q=0.5")
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String getBoardList(String bordId) throws IOException {
        String url = "https://api.trello.com/1/boards/"+bordId+"/lists?cards=all&key="+KEY+"&token="+TOKEN;
        String response = getRequest(url);
        return response;

    } public String getBoardLabels(String bordId) throws IOException {
        String url = "https://api.trello.com/1/boards/"+bordId+"/labels?key="+KEY+"&token="+TOKEN;
        String response = getRequest(url);
        return response;

    }

    }
