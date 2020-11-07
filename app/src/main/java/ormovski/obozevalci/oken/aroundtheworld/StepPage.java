package ormovski.obozevalci.oken.aroundtheworld;

import android.os.Bundle;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StepPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StepPage extends Fragment {

    private static final String PAGE = "page";

    private int page;
    private MotionLayout view;

    public StepPage() {
        // Required empty public constructor
    }

    public static StepPage newInstance(int page) {
        StepPage fragment = new StepPage();
        Bundle args = new Bundle();
        args.putInt(PAGE, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            page = getArguments().getInt(PAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        int layoutId;
        switch (page) {
            case 0: layoutId = R.layout.step_two_screen;
                    break;
            default: layoutId = R.layout.step_two_screen;
        }

        view = (MotionLayout) inflater.inflate(layoutId, container, false);
        return view;
    }

    public void setAnimationProgress(float progress) {
        // TODO: Set motion layout progress.
        if (view != null) {
            view.setProgress(progress);
        }
    }

}