package config;

/**
 * Created by magic_000 on 20/06/2017.
 */
public class ServerConfig {

    public static String HOST_MONGO;
    public static Integer PORT_MONGO;
    public static String DB_NAME;



    //public static Gson globalGson = new Gson();



    public static void initConfig() {
        ServerPropertiesLoader properties = new ServerPropertiesLoader();
        HOST_MONGO = properties.getString("host_mongo");
        PORT_MONGO = properties.getInt("port_mongo");
        DB_NAME = properties.getString("db_name");
    }


}
