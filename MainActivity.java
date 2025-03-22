package p1.c1.app;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import android.app.*;
import android.os.*;
import android.app.AlertDialog;
import android.app.Activity;
import android.widget.Toast;
import java.util.Random;
import 	java.nio.charset.Charset;
import android.content.Context;
import android.app.Activity; 
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends Activity
{
    Context context ;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        context=getApplicationContext();
		final Button B2 = (Button)findViewById(R.id.button2); 
                           final Button B3 = (Button)findViewById(R.id.button3); 
                           
		final Button B = (Button)findViewById(R.id.button);

		final EditText ED = (EditText)findViewById(R.id.textEdit);
                            final EditText ED2 = (EditText)findViewById(R.id.textEdit2);
		
ED.setText("/sdcard/");
		B.setOnClickListener(new OnClickListener(){ 
				
				public void onClick(View arg0)
				{ 
					String s="",ss="";
                                                                    
					
                                                                     ED2.setText(s);
		}	
                  });		


B2.setOnClickListener(new OnClickListener(){ 
				
				public void onClick(View arg0)
				{ 
					String s="",ss="";

try  {	
                                                                    String TextEntered = ED.getText().toString(); 
					FileInputStream is;					              File file=new File( TextEntered.toString());
                                                                    is = new FileInputStream(file);
					BufferedReader reader = new          BufferedReader(new InputStreamReader(is));
					
                                                                    if (file.exists())
						{

						String line =reader.readLine();

while(line!=null){

          s=s+line;
          line=reader.readLine();
}
}		
reader.close();				
}catch (Exception e)
		{




			setTitle(e.toString());

		}
						

							
							
					
                                                                     ED2.setText(s);

		}	
                  });		


    
    
B3.setOnClickListener(new OnClickListener(){ 
				
				public void onClick(View arg0)
				{ 
					String s="",ss="";


try  {	
                                                                    String TextEntered = ED.getText().toString(); 
                                                                    String TextEntered2 = ED2.getText().toString(); 
                                                                    File f=new File(TextEntered2);
FileOutputStream fos = new FileOutputStream(TextEntered);
					OutputStreamWriter is=new OutputStreamWriter(fos);					              is.write(TextEntered2);
is.close();				
}catch (Exception e)
		{




			setTitle(e.toString());
ED2.setText(e.toString());
		
						

							
							
					
                                                                     

		}	}
                  });		


    
    
}	
    @Override
    protected void onDestroy() {
        super.onDestroy();
        
    }
}
