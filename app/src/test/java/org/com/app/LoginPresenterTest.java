package org.com.app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;



import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Mokshitha on 2/20/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {
    @Mock
    private LoginView view;
    private LoginPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new LoginPresenter(view);
    }

    @Test
    public void showErrorIfUsernameEmpty() throws Exception {
        when(view.getUserName()).thenReturn("");
        presenter.onLoginClicked();
        verify(view).showUserNameError("Please enter UserName");
    }

    @Test
    public void  showErrorIfPasswordEmpty() throws Exception {
        when(view.getUserName()).thenReturn("chandra");
        when(view.getPassword()).thenReturn("");
        presenter.onLoginClicked();
        verify(view).showPasswordErrorEmpty("Please enter password");
    }
}