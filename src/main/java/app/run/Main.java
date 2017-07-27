package app.run;

import config.ServerConfig;
import controller.SampleController;
import org.springframework.boot.SpringApplication;

/**
 * Created by Fresher on 27/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        ServerConfig.initConfig();

        //DatabaseConn conn= AppContext.getInstance().getBean("database_conn", DatabaseConn.class);

        SpringApplication.run(SampleController.class);
    }
}
