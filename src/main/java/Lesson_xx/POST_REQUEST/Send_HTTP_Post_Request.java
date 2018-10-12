package Lesson_xx.POST_REQUEST;

        import java.io.*;
        import java.net.HttpURLConnection;
        import java.net.URL;
        import java.net.URLEncoder;
        import java.util.Iterator;
        import java.util.LinkedHashMap;
        import java.util.Map;
        import org.apache.commons.io.IOUtils;
        import org.json.JSONArray;
        import org.json.JSONObject;



public class Send_HTTP_Post_Request {
        public static void main(String[] args) {
            Send_HTTP_Post_Request.Post_JSON();
        }


        //http://localhost:31147/hbase-rest/all_new?msisdn=9052284114&start_date=20180801&end_date=20180831&offset=1&limit=0
        //http://localhost:31147/hbase-rest/all_new?imsi=250023038290736&start_date=20180801&end_date=20180831&offset=1&limit=1

        public static void Post_JSON() {
            String query_url = "http://localhost:31147/hbase-rest/all_new?msisdn=9052284114&start_date=20180801&end_date=20180831&offset=1&limit=1";
           // String query_url = "http://localhost:31147/hbase-rest/all_new?imsi=250023038290736&start_date=20180801&end_date=20180831&offset=1&limit=1";
            //String json = "{\"filters\":[],\"orders\":[{\"field\":\"_duration\",\"direction\":\"down\"}]}";
            String json = "{\"filters\":[],\"orders\":[{\"field\":\"_duration\",\"direction\":\"up\"}]}";
            try {
                URL url = new URL(query_url);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(5000);
                conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                conn.setDoOutput(true);
                conn.setDoInput(true);
                conn.setRequestMethod("POST");
                OutputStream os = conn.getOutputStream();
                os.write(json.getBytes("UTF-8"));
                os.close();
                // read the response
                InputStream in = new BufferedInputStream(conn.getInputStream());
                String result = IOUtils.toString(in, "UTF-8");
                //               System.out.println(result);
//                System.out.println("result after Reading JSON Response");
                JSONObject myResponse = new JSONObject(result);
//                System.out.println(myResponse.length());
//                System.out.println("listInfo- "+myResponse.getString("listInfo"));
//                System.out.println("listInfo- "+myResponse.getJSONObject("listInfo").getString("count"));

                //System.out.println("litems- "+myResponse.optJSONArray("items"));


                JSONArray mass = myResponse.getJSONArray("items");
                for (int i = 0; i < mass.length(); i++) {
                        System.out.println(mass.getJSONObject(i).getString("_duration"));
                }

                System.out.println("Length"+mass.length());



//                System.out.println("listInfo- "+myResponse.getString("listInfo"));




                in.close();
                conn.disconnect();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}


//{"listInfo":{"count":100,"limit":5,"offset":1},"items":[{"_start_time":"01.08.2018 12:07:57","_rec_type":"09 - Вход. SMS","_day":"01.08.2018","_hour":"12","_st_name_a":"NODATA_NAME","_st_type_a":"NODATA","_key":"11490522842018080121207570910929011","_imei_a":"","_imei_b":"359205075780080","_a_cell":"9000021"