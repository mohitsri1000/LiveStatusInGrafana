package Utils;

import okhttp3.OkHttpClient;
import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;

public class ResultSender {
    private static final InfluxDB INFLXUDB;
    private static final String DATABASE = "Test";

    static {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.addInterceptor(chain -> {
            okhttp3.Request request = chain.request()
                    .newBuilder()
                    .addHeader("Authorization", "Token <apitoken>")
                    .build();
            return chain.proceed(request);
        });
        INFLXUDB
                = InfluxDBFactory.connect("http://localhost:8086", clientBuilder);
        INFLXUDB.setDatabase(DATABASE);
    }

    public static void send(final Point point){
        INFLXUDB.write(point);
    }

}
