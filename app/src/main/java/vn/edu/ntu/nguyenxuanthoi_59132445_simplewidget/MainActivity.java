package vn.edu.ntu.nguyenxuanthoi_59132445_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNgaySinh, edtSoThich;
    RadioGroup rdgGioiTinh;
    RadioButton rdbNam,rdbNu;
    CheckBox cbXemphim, cbNgheNhac, cbcf,cbONha,cbVaoBep;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addView() {
        edtTen=findViewById(R.id.edtTen);
        edtNgaySinh= findViewById(R.id.edtNgaySinh);
        edtSoThich = findViewById(R.id.edtSoThich);
        rdgGioiTinh=findViewById(R.id.rdgGioiTinh);
        rdbNam = findViewById(R.id.rdbNam);
        rdbNu = findViewById(R.id.rdbNu);
        cbXemphim = findViewById(R.id.cbXemphim);
        cbNgheNhac = findViewById(R.id.cbNgheNhac);
        cbcf = findViewById(R.id.cbcf);
        cbVaoBep = findViewById(R.id.cVaoBep);
        cbONha = findViewById(R.id.cbONha);
        btnXacNhan= findViewById(R.id.btnXacNhan);
    }

    private void addEvent() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HienThi();
            }
        });
    }

    private void HienThi() {
        String TT1 = "Tên:" + edtTen.getText().toString() + "\n" + "Ngày sinh:" + edtNgaySinh.getText().toString() + "\n";
        String TT2 = "Giới tính:";
        switch (rdgGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rdbNam:
                TT1 += TT2 + rdbNam.getText().toString(); break;
            case R.id.rdbNu:
                TT1 += TT2 + rdbNu.getText().toString(); break;
        }

        String TT3 = "\n Sở thích: ";
        TT1 += TT3;
        if (cbXemphim.isChecked())
        {
            TT1 += cbXemphim.getText().toString()+", ";
        }
        if (cbNgheNhac.isChecked())
        {
            TT1 += cbNgheNhac.getText().toString()+", ";
        }
        if (cbcf.isChecked())
        {
            TT1 += cbcf.getText().toString()+", ";
        }
        if (cbONha.isChecked())
        {
            TT1 += cbONha.getText().toString()+", ";
        }
        if (cbVaoBep.isChecked())
        {
            TT1 += cbVaoBep.getText().toString()+", ";
        }

        TT1 += edtSoThich.getText().toString();
        Toast.makeText(getApplicationContext(),TT1,Toast.LENGTH_LONG).show();
    }
}
