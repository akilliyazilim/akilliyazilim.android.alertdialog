package com.example.alertdialog1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	final Context context = this;
	Button button1, button2;
	String[] color_list = { "Red", "Green", "Blue" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);

		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);

				alertDialogBuilder.setTitle("www.akilliyazilim.org");

				alertDialogBuilder
						.setMessage(
								"Uygulamadan Gercekten C�kmak Ist�yor musunuz?")
						.setCancelable(false)
						.setPositiveButton("Evet",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										MainActivity.this.finish();
									}
								})
						.setNegativeButton("Hay�r",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										dialog.cancel();
									}

								});
				AlertDialog alertDialog = alertDialogBuilder.create();
				alertDialog.show();

			}
		});

		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);

				alertDialogBuilder.setTitle("www.akilliyazilim.org");

				alertDialogBuilder.setCancelable(false).setItems(color_list,
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub
								switch (which) {
								case 0:
									Toast.makeText(getApplicationContext(),
											"K�rm�z� rengi se�tiniz",
											Toast.LENGTH_SHORT).show();
									break;
								case 1:
									Toast.makeText(getApplicationContext(),
											"Ye�il rengi se�tiniz",
											Toast.LENGTH_SHORT).show();
									break;
								case 2:
									Toast.makeText(getApplicationContext(),
											"Mavi rengi se�tiniz",
											Toast.LENGTH_SHORT).show();
									break;

								}

							}
						});

				AlertDialog alertDialog = alertDialogBuilder.create();
				alertDialog.show();
			}
		});

	}

}
