package org.com.app;



/**
 * Created by Mokshitha on 2/20/2018.
 */

class LoginPresenter  {
    private LoginView view;
    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void onLoginClicked() {
    String username = view.getUserName();
    if(username.isEmpty()){
        view.showUserNameError("Please enter UserName");
        return;
    }

    String password = view.getPassword();
    if(password.isEmpty()){
        view.showPasswordErrorEmpty("Please enter password");
        return;
    }

      /*  Observable.just("my name is chandra")
//                .subscribeOn(Schedulers.io())
                //.observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String s) {
                        view.setUserName(s);
                        Log.i("NCS","String is"+s);
                    }
                });*/

    }


}
