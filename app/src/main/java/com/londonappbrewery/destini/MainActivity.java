package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView storytext;
    Button topButton;
    Button bottomButton;
    int mStoryIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storytext = findViewById(R.id.storyTextView); /* you may need to add '(TextView)' right before findViewB... if this doesn't work */

        topButton = findViewById(R.id.buttonTop); /* you may need to add '(Button)' right before findViewB... if this doesn't work */

        bottomButton = findViewById(R.id.buttonBottom); /* you may need to add '(Button)' right before findViewB... if this doesn't work */


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mStoryIndex = 1;

        View.OnClickListener listnerTop = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("destini", "The Top Button has been pressed");

                if (mStoryIndex == 1) {
                    storytext.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;

                }

                else if (mStoryIndex == 3) {
                    storytext.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                    mStoryIndex = 6;

                }

                else if (mStoryIndex == 2) {
                    storytext.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }

                else if (mStoryIndex == 2) {
                    storytext.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                    mStoryIndex = 6;

                }


            }

            }; topButton.setOnClickListener(listnerTop);








            // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        View.OnClickListener listenerBottom = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini", "The Bottom Button has been pressed");

                if (mStoryIndex == 1) {
                storytext.setText(R.string.T2_Story);
                topButton.setText(R.string.T2_Ans1);
                bottomButton.setText(R.string.T2_Ans2);
                mStoryIndex = 2; }

                else if (mStoryIndex == 2){
                storytext.setText(R.string.T4_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                mStoryIndex = 4; }

                else if (mStoryIndex == 3) {
                storytext.setText(R.string.T5_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                mStoryIndex = 5;

                }

              /* else if (mStoryIndex == 2) {
                storytext.setText(R.string.T3_Story);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);

                } */

            }


            };  bottomButton.setOnClickListener(listenerBottom);


        }


};


