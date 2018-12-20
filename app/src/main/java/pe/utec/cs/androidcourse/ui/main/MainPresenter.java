package pe.utec.cs.androidcourse.ui.main;

class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;

    MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void setNewText() {
        view.updateText("Hola chicos, soy un presenter");
    }
}
