package com.training.spring.demo.security;

import javax.activation.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//@Component
public class TacoDataSource implements DataSource {
    @Override
    public InputStream getInputStream() {
        return null;
    }


    @Override
    public OutputStream getOutputStream() throws IOException {
        return null;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
