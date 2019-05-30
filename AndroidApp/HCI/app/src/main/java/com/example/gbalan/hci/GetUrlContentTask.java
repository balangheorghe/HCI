package com.example.gbalan.hci;

import android.os.AsyncTask;


class GetUrlContentTask extends AsyncTask<String, Integer, String> {
    protected String doInBackground(String... urls) {

        System.out.println("background");
        return "background";
    }

    protected void onProgressUpdate(Integer... progress) {
    }

    protected void onPostExecute(String result) {
        // this is executed on the main thread after the process is over
        // update your UI here
        //ProfileActivity2.text2.setText(result);
        //displayMessage(result);
    }

}