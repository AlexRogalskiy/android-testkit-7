package com.frlgrd;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.frlgrd.animatededittext.R;

public class MainActivity extends AppCompatActivity {

	//private AnimatedEditText dateInput;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*dateInput = findViewById(R.id.dateInput);
		dateInput.setOnNonKeyboardRequestListener(new AnimatedEditText.OnNonKeyboardRequestListener() {
			@Override public void onNonKeyboardRequested() {
				pickDate();
			}
		});*/
	}

	private void pickDate() {
		/*final Calendar calendar = Calendar.getInstance();
		new DatePickerDialog(this, R.style.DatePicker, new DatePickerDialog.OnDateSetListener() {
			@Override public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
				String myFormat = "MM/dd/yy"; //In which you need put here
				SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
				calendar.set(Calendar.YEAR, year);
				calendar.set(Calendar.MONTH, month);
				calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
				dateInput.getEditText().setText(sdf.format(calendar.getTime()));
			}
		}, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DAY_OF_MONTH)).show();*/
	}
}
