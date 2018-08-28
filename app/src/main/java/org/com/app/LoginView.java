package org.com.app;

/**
 * Created by Mokshitha on 2/20/2018.
 */

interface LoginView {
    String getUserName();
    String getPassword();
    void setUserName(String s);
    void showUserNameError(String s);
    void showPasswordErrorEmpty(String s);
}
