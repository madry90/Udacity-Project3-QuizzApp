package com.example.android.quizzapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayScore(View view) {
        final String text = "Your score: " +getScore()+ "/4";
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
    }
    private int getScore(){
        int score = 0;
        //Test answers radioButton questions
        RadioButton firstQuestion = (RadioButton)findViewById(R.id.firstRadioButtonC);
        boolean firstCorrectAnswer = firstQuestion.isChecked();
        RadioButton fourthQuestion = (RadioButton)findViewById(R.id.fourthRadioButtonC);
        boolean fourthCorrectAnswer = fourthQuestion.isChecked();
        //Test answer editable
        String correctAnswerThirdQuestion = "int var1 = 1;";
        EditText editText = (EditText)findViewById(R.id.thirdEditText);
        String thirdQuestionAnswer = editText.getText().toString();
        //Test answers checkBoxes question
        CheckBox secondQuestionCheckBoxA = (CheckBox)findViewById(R.id.secondCheckboxA);
        CheckBox secondQuestionCheckBoxB = (CheckBox)findViewById(R.id.secondCheckboxA);
        CheckBox secondQuestionCheckBoxC = (CheckBox)findViewById(R.id.secondCheckboxC);
        CheckBox secondQuestionCheckBoxD = (CheckBox)findViewById(R.id.secondCheckboxD);
        boolean secondCorrectAnswer = secondQuestionCheckBoxA.isChecked() && secondQuestionCheckBoxB.isChecked()
                && !(secondQuestionCheckBoxC.isChecked()) && !(secondQuestionCheckBoxD.isChecked());
        //Update score with correct answers
        if(firstCorrectAnswer)  {
            score++;
        }
        if(secondCorrectAnswer){
            score++;
        }
        if(thirdQuestionAnswer.equals(correctAnswerThirdQuestion)){
            score++;
        }
        if(fourthCorrectAnswer) {
            score++;
        }
        return score;
    }
}