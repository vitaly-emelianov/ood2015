package ru.sbt.bit.ood.hw1.attribute;

import org.w3c.dom.Attr;

/**
 * Created by vitaly on 10/13/16.
 */
public class Attribute {
    private final String host;
    private final int port;
    private final String login;
    private final String password;

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Attribute(String host, int port, String login, String password) {
        this.host = host;
        this.port = port;
        this.login = login;
        this.password = password;
    }


}
