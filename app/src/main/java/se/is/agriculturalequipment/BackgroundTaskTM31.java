package se.is.agriculturalequipment;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by BlackClover on 10/30/2017.
 */

public class BackgroundTaskTM31 extends AsyncTask<String, Void, String> {

    Context ctx;

    BackgroundTaskTM31(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    protected String doInBackground(String... params) {
        //        String insert_profile_url = "http://10.0.2.2/AgriculturalEquipmentServer/insert_profile.php";
        String insert_profile_url = "http://tomori.siameki.com/insert_profile_tm31.php";

        String method = params[0];
        if (method.equals("insert_profile_tm31")) {
            String idNo = params[1];
            String name = params[2];
            String amount = params[3];

            String imageName = params[4];
            String encodedImage = params[5];
            String strName = params[6];
            String[] partName = new String[]{strName};
            String idxEngine = params[7];
            String dealingStatus = params[8];

            //Convert String[] to String.
            try {
                JSONArray temp = new JSONArray(strName);
                partName = temp.join(",").split(",");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Log.d("partName : ", strName);

//            Test debug values of partName.
            for (int i = 0; i < partName.length; i++) {
                Log.d("partName " + i + " : ", partName[i]);
            }

            try {
                URL url = new URL(insert_profile_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream os = httpURLConnection.getOutputStream();

                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));

                String data = null;
                //Check engine work?
                if (idxEngine.equals("0")) {
                    data = URLEncoder.encode("idNo", "UTF-8") + "=" + URLEncoder.encode(idNo, "UTF-8") + "&" +
                            URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8") + "&" +
                            URLEncoder.encode("amount", "UTF-8") + "=" + URLEncoder.encode(amount, "UTF-8") + "&" +
                            URLEncoder.encode("image_name", "UTF-8") + "=" + URLEncoder.encode(imageName, "UTF-8") + "&" +
                            URLEncoder.encode("encoded_image", "UTF-8") + "=" + URLEncoder.encode(encodedImage, "UTF-8") + "&" +
                            URLEncoder.encode("engineStatus", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&" +
                            URLEncoder.encode("airChamber", "UTF-8") + "=" + URLEncoder.encode(partName[0], "UTF-8") + "&" +
                            URLEncoder.encode("sealSet", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&" +
                            URLEncoder.encode("adjustSet", "UTF-8") + "=" + URLEncoder.encode(partName[1], "UTF-8") + "&" +
                            URLEncoder.encode("dischargeMetal", "UTF-8") + "=" + URLEncoder.encode(partName[2], "UTF-8") + "&" +
                            URLEncoder.encode("suctionMetal", "UTF-8") + "=" + URLEncoder.encode(partName[3], "UTF-8") + "&" +
                            URLEncoder.encode("pistonSet", "UTF-8") + "=" + URLEncoder.encode(partName[4], "UTF-8") + "&" +
                            URLEncoder.encode("starterRopeReel", "UTF-8") + "=" + URLEncoder.encode(partName[5], "UTF-8") + "&" +
                            URLEncoder.encode("pressureGauge", "UTF-8") + "=" + URLEncoder.encode(partName[6], "UTF-8") + "&" +
                            URLEncoder.encode("ballValveSwitch", "UTF-8") + "=" + URLEncoder.encode(partName[7], "UTF-8") + "&" +
                            URLEncoder.encode("oilFilter", "UTF-8") + "=" + URLEncoder.encode(partName[8], "UTF-8") + "&" +
                            URLEncoder.encode("newPaint", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&" +
                            URLEncoder.encode("oilTankCap", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&" +
                            URLEncoder.encode("amount", "UTF-8") + "=" + URLEncoder.encode(amount, "UTF-8") + "&" +
                            URLEncoder.encode("dealingStatus", "UTF-8") + "=" + URLEncoder.encode(dealingStatus, "UTF-8");

                } else {
                    /*data = URLEncoder.encode("idNo", "UTF-8") + "=" + URLEncoder.encode(idNo, "UTF-8") + "&" +
                            URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8") + "&" +
                            URLEncoder.encode("amount", "UTF-8") + "=" + URLEncoder.encode(amount, "UTF-8") + "&" +
                            URLEncoder.encode("image_name", "UTF-8") + "=" + URLEncoder.encode(imageName, "UTF-8") + "&" +
                            URLEncoder.encode("encoded_image", "UTF-8") + "=" + URLEncoder.encode(encodedImage, "UTF-8") + "&" +
                            URLEncoder.encode("engineStatus", "UTF-8") + "=" + URLEncoder.encode(partName[0], "UTF-8") + "&" +
                            URLEncoder.encode("airChamber", "UTF-8") + "=" + URLEncoder.encode(partName[1], "UTF-8") + "&" +
                            URLEncoder.encode("sealSet", "UTF-8") + "=" + URLEncoder.encode(partName[2], "UTF-8") + "&" +
                            URLEncoder.encode("adjustSet", "UTF-8") + "=" + URLEncoder.encode(partName[3], "UTF-8") + "&" +
                            URLEncoder.encode("dischargeMetal", "UTF-8") + "=" + URLEncoder.encode(partName[4], "UTF-8") + "&" +
                            URLEncoder.encode("suctionMetal", "UTF-8") + "=" + URLEncoder.encode(partName[5], "UTF-8") + "&" +
                            URLEncoder.encode("pistonSet", "UTF-8") + "=" + URLEncoder.encode(partName[6], "UTF-8") + "&" +
                            URLEncoder.encode("starterRopeReel", "UTF-8") + "=" + URLEncoder.encode(partName[7], "UTF-8") + "&" +
                            URLEncoder.encode("pressureGauge", "UTF-8") + "=" + URLEncoder.encode(partName[8], "UTF-8") + "&" +
                            URLEncoder.encode("ballValveSwitch", "UTF-8") + "=" + URLEncoder.encode(partName[9], "UTF-8") + "&" +
                            URLEncoder.encode("oilFilter", "UTF-8") + "=" + URLEncoder.encode(partName[10], "UTF-8") + "&" +
                            URLEncoder.encode("newPaint", "UTF-8") + "=" + URLEncoder.encode(partName[11], "UTF-8") + "&" +
                            URLEncoder.encode("oilTankCap", "UTF-8") + "=" + URLEncoder.encode(partName[12], "UTF-8") + "&" +
                            URLEncoder.encode("amount", "UTF-8") + "=" + URLEncoder.encode(amount, "UTF-8") + "&" +
                            URLEncoder.encode("dealingStatus", "UTF-8") + "=" + URLEncoder.encode(dealingStatus, "UTF-8");*/
                }

                /*String data = URLEncoder.encode("idNo","UTF-8") + "=" + URLEncoder.encode(idNo,"UTF-8")+"&"+
                        URLEncoder.encode("name","UTF-8") + "=" + URLEncoder.encode(name,"UTF-8")+"&"+
                        URLEncoder.encode("encoded_image","UTF-8") + "=" + URLEncoder.encode("SGVsbG9=","UTF-8")+"&"+
                        URLEncoder.encode("image_name","UTF-8") + "=" + URLEncoder.encode(imageName,"UTF-8")+"&";*/

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                os.close();
                InputStream is = httpURLConnection.getInputStream();
                is.close();

                return "Insert values TM31 success.";
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(ctx, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
