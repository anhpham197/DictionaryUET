package API;
import com.squareup.okhttp.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
//new Translate().readFromJson("hi");
public class Translate {
    private static String subscriptionKey = "8bf19512de9f4ca9ae596bcd54611389";

    private HttpUrl url = new HttpUrl.Builder()
            .scheme("https")
            .host("api.cognitive.microsofttranslator.com")
            .addPathSegment("/translate")
            .addQueryParameter("api-version", "3.0")
            .addQueryParameter("from", "en")
            .addQueryParameter("to", "vi")
            .build();

    private OkHttpClient client = new OkHttpClient();



    //return json text
    private String post(String text) throws IOException {

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType,
                "[{\"Text\": \"" + text + "\"}]");
        Request request = new Request.Builder().url(url).post(body)
                .addHeader("Ocp-Apim-Subscription-Key", subscriptionKey).addHeader("Content-type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String getOnlineDefine(String text) {

        JSONParser parser = new JSONParser();
        try {
            text = post(text);
            //text = "[{\"translations\":[{\"text\":\"Chào bạn\",\"to\":\"vi\"}]}]";
            //System.out.println(text);
            Object obj = parser.parse(text);
            JSONArray array = (JSONArray)obj;
            JSONObject jsonObject = (JSONObject) array.get(0);
            array = (JSONArray) jsonObject.get("translations");
            jsonObject = (JSONObject) array.get(0);
            //System.out.println(jsonObject);

            return  (String) jsonObject.get("text");

        } catch (ParseException | IOException e) {
            e.printStackTrace();
            return "";
        }

    }


}
