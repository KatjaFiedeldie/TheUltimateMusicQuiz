package com.example.android.theultimatemusicquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// this method is called when the check answers button is clicked
    // The artistName is added + grade.

    public void submitAnswers(View view) {
        // Name of the user:
        EditText nameEdit = findViewById(R.id.edit_name_view);
        String artistName = nameEdit.getText().toString();

        //Radiobutton of Question 1
        RadioButton jeffBuckley = findViewById(R.id.jeff_Buckley);
        boolean isQ1Correct = jeffBuckley.isChecked();

        //Radiobutton of Question 2
        RadioButton homeBound = findViewById(R.id.home_Bound);
        boolean isQ2Correct = homeBound.isChecked();

        //Checkboxes of question 3.
        CheckBox answer1 = findViewById(R.id.loved_CheckBox);
        boolean hasAnswer1 = answer1.isChecked();
        CheckBox answer2 = findViewById(R.id.paint_checkbox);
        boolean hasAnswer2 = answer2.isChecked();
        CheckBox answer3 = findViewById(R.id.letter_checkbox);
        boolean hasAnswer3 = answer3.isChecked();
        CheckBox answer4 = findViewById(R.id.lola_checkbox);
        boolean hasAnswer4 = answer4.isChecked();
        CheckBox answer5 = findViewById(R.id.something_checkbox);
        boolean hasAnswer5 = answer5.isChecked();
        boolean isBeatlesCorrect = hasAnswer1 && !hasAnswer2 && !hasAnswer3 && !hasAnswer4 && hasAnswer5;

        //Correct answer to question 4.
        EditText questionOneAnswerEditText = findViewById(R.id.the_doors);
        String questionOneAnswer = questionOneAnswerEditText.getText().toString();
        boolean isQ4Correct = questionOneAnswer.equalsIgnoreCase("Jim Morrison") || questionOneAnswer.equalsIgnoreCase("Jim Morisson ");

        //Correct answer to Question 5.
        RadioButton pjotrT = findViewById(R.id.pjotr);
        boolean isQ5Correct = pjotrT.isChecked();

        int finalGrade = calculateCheckbox(isBeatlesCorrect, isQ1Correct, isQ2Correct, isQ4Correct, isQ5Correct);
        // The toast message when the check score button is pushed: artistName, Grade, message
        Toast.makeText(this, "Hi " + artistName + "\nYou've gotten " + finalGrade + " right answers!", Toast.LENGTH_LONG).show();
    }

    public int calculateCheckbox(boolean isBeatlesCorrect, boolean isQ1Correct, boolean isQ2Correct, boolean isQ4Correct, boolean isQ5Correct) {
        int grade = 0;

        if (isQ1Correct) {
            grade = grade +1;
        }

        if (isQ2Correct) {
            grade = grade +1;
        }

        if (isBeatlesCorrect) {
            grade = grade + 1;
        }

        if (isQ4Correct) {
            grade = grade + 1;
        }

        if (isQ5Correct) {
            grade = grade + 1;
        }
        else
            grade = grade;
        return grade;
    }

}


