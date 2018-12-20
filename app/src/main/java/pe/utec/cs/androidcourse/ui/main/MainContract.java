package pe.utec.cs.androidcourse.ui.main;

public interface MainContract {
    interface View {
        void updateText(String text);
    }

    interface Presenter {
        void setNewText();
    }
}
