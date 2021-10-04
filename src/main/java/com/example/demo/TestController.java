package com.example.demo;

import com.revotech.sdkofficelocal.util.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Properties;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping
    public String test() throws IOException {
        Properties prop = new Properties();
        File file = new File(Constants.APPLICATION.FILE_PATH_APP_CONF);
        prop.load(new InputStreamReader( new FileInputStream(file), Charset.forName("UTF-8")));
        System.out.println("directory "+file.isDirectory());
        System.out.println("getPath "+file.getPath());
        System.out.println("getAbsolutePath "+file.getAbsolutePath());
        System.out.println("prop.getPropertyBNV_TOKEN " +prop.getProperty("BNV_TOKEN"));
        return "hello";
    }
}
